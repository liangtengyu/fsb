package com.lty.fsb.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lty
 * @since 2019-08-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RolePermission extends Model<RolePermission> {

    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.AUTO)
    private  Integer id;
    /**
     * 角色id
     */
    private String roleName;

    /**
     * 权限id
     */
    private String permissionName;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
