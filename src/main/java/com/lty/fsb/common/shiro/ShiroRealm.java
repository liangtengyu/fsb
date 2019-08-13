package com.lty.fsb.common.shiro;

import com.lty.fsb.entity.system.TMenu;
import com.lty.fsb.entity.system.TRole;
import com.lty.fsb.entity.system.TUser;
import com.lty.fsb.service.system.ITMenuService;
import com.lty.fsb.service.system.ITRoleService;
import com.lty.fsb.service.system.ITUserService;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 自定义实现 ShiroRealm，包含认证和授权两大模块
 */
@Component
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private ITUserService userService;
    @Autowired
    private ITRoleService roleService;
    @Autowired
    private ITMenuService menuService;

    /**
     * 授权模块，获取用户角色和权限
     *
     * @param principal principal
     * @return AuthorizationInfo 权限信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        TUser user = (TUser) SecurityUtils.getSubject().getPrincipal();
        String userName = user.getUsername();

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();

        // 获取用户角色集
        List<TRole> roleList = this.roleService.findUserRole(userName);
        Set<String> roleSet = roleList.stream().map(TRole::getRoleName).collect(Collectors.toSet());
        simpleAuthorizationInfo.setRoles(roleSet);

        // 获取用户权限集
        List<TMenu> permissionList = this.menuService.findUserPermissions(userName);
        Set<String> permissionSet = permissionList.stream().map(TMenu::getPerms).collect(Collectors.toSet());
        simpleAuthorizationInfo.setStringPermissions(permissionSet);
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     *
     * @param token AuthenticationToken 身份认证 token
     * @return AuthenticationInfo 身份认证信息
     * @throws AuthenticationException 认证相关异常
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        /**
         * 1. 从token中获取输入的用户名
         * 2. 通过username查询数据库得到用户对象
         * 3. 调用Authenticator进行密码校验
         */

        //获取用户名和密码
        String username = (String) token.getPrincipal();

        TUser user = userService.findByName(username);

        if (user == null) {
            throw new UnknownAccountException();
        }

        /**
         * 交给Shiro进行密码的解密校验
         * 调用SecurityUtils.getSubject().getPrincipal() 遇到类型转换问题，报错 String !=> User
         * 请参考这篇文章：{@link https://blog.csdn.net/qq_35981283/article/details/78634575}
         */
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(),ByteSource.Util.bytes(user.getUsername()) ,getName());

        return authenticationInfo;
    }
    }


