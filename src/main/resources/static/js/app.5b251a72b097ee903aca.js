webpackJsonp([1],{"/nFA":function(e,r){},0:function(e,r){},"3ydl":function(e,r){},"4WSK":function(e,r){},NHnr:function(e,r,t){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var o=t("xd7I"),n={render:function(){var e=this.$createElement,r=this._self._c||e;return r("div",{attrs:{id:"app"}},[r("router-view")],1)},staticRenderFns:[]};var s=t("C7Lr")({name:"App"},n,!1,function(e){t("/nFA")},null,null).exports,i=t("ZWLj"),l={data:function(){return{drawer:!1,direction:"rtl",wap_sign:"",ruleForm:{input:"",password:"",remeber:""},regForm:{name:"",password:""},rules:{input:[{required:!0,message:"请输入帐号",trigger:"blur"},{min:4,max:16,message:"长度在 4 到 16 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:4,max:16,message:"长度在 4 到 16 个字符",trigger:"blur"}]},rulereg:{name:[{required:!0,message:"请输入帐号",trigger:"blur"},{min:4,max:16,message:"长度在 4 到 16 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:4,max:16,message:"长度在 4 到 16 个字符",trigger:"blur"}]}}},methods:{test:function(e){console.log(e)},login:function(e){var r=this;this.$refs[e].validate(function(e){if(!e)return console.log("error submit!!"),!1;r.$http.post("http://localhost:9999/login",{username:r.ruleForm.input,password:r.ruleForm.password,rememberMe:r.ruleForm.remeber},{emulateJSON:!0}).then(function(e){var t=e.body;0==t.code?(localStorage.setItem("fsbToken",t.data),console.log("login success"),r.$router.push({path:"/home"})):r.$message.error("登陆失败了")},function(e){console.log(e),r.$message.error("登陆失败了")})})},reg:function(e){var r=this;this.$refs[e].validate(function(e){if(!e)return console.log("error submit!!"),!1;r.$http.post("http://localhost:9999/reg",{username:r.regForm.name,password:r.regForm.password},{emulateJSON:!1}).then(function(e){0==e.body.code?(console.log("注册成功"),r.$router.push({path:"/home"})):r.$message.error("注册失败")},function(e){console.log(e),r.$message.error("注册失败")})})},changeR:function(e){"true"==e?this.$notify.info({title:"tips",message:"已经记住密码，下次不用输入咯1"}):this.$notify.info({title:"tips",message:"关闭记住密码"})},handleClose:function(e){this.$confirm("确认关闭？").then(function(r){e()}).catch(function(e){})},browserRedirect:function(){var e=navigator.userAgent.toLowerCase(),r="ipad"==e.match(/ipad/i),t="iphone os"==e.match(/iphone os/i),o="midp"==e.match(/midp/i),n="rv:1.2.3.4"==e.match(/rv:1.2.3.4/i),s="ucweb"==e.match(/ucweb/i),i="android"==e.match(/android/i),l="windows ce"==e.match(/windows ce/i),a="windows mobile"==e.match(/windows mobile/i);r||t||o||n||s||i||l||a?(this.wap_sign="yes",console.log(this.wap_sign),this.$notify.info({title:"tips",message:"现在正在用手机访问"})):(this.wap_sign="no",console.log(this.wap_sign),this.$notify.info({title:"tips",message:"现在正在用电脑访问"}))}},mounted:function(){this.browserRedirect()}},a={render:function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{attrs:{id:"div1"}},[t("el-form",{ref:"ruleForm1",staticClass:"demo-ruleForm",attrs:{model:e.ruleForm,rules:e.rules,"label-width":"100px"}},[t("el-form-item",{attrs:{label:"帐号",prop:"input"}},[t("el-input",{attrs:{placeholder:"请输入账号","prefix-icon":"el-icon-s-custom",max:"",clearable:""},model:{value:e.ruleForm.input,callback:function(r){e.$set(e.ruleForm,"input",r)},expression:"ruleForm.input"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-input",{attrs:{placeholder:"请输入密码","prefix-icon":"el-icon-key","show-password":""},model:{value:e.ruleForm.password,callback:function(r){e.$set(e.ruleForm,"password",r)},expression:"ruleForm.password"}})],1),e._v(" "),t("div",{attrs:{id:"but"}},[t("el-switch",{attrs:{"active-color":"#13ce66","active-value":"true","inactive-value":"false","active-text":"记住"},on:{change:function(r){return e.changeR(r)}},model:{value:e.ruleForm.remeber,callback:function(r){e.$set(e.ruleForm,"remeber",r)},expression:"ruleForm.remeber"}}),e._v(" "),t("el-button",{staticClass:"bt",attrs:{type:"success",plain:"",icon:"el-icon-thumb"},on:{click:function(r){e.drawer=!0}}},[e._v("注册")]),e._v(" "),t("el-button",{staticClass:"bt",attrs:{type:"primary",plain:"",icon:"el-icon-user"},on:{click:function(r){return e.login("ruleForm1")}}},[e._v("登陆")])],1),e._v(" "),t("el-drawer",{attrs:{title:"注册用户",visible:e.drawer,direction:e.direction,size:"65%","before-close":e.handleClose},on:{"update:visible":function(r){e.drawer=r}}},[[t("el-form",{ref:"ruleForm2",staticClass:"demo-ruleForm",attrs:{model:e.regForm,rules:e.rulereg,"label-width":"100px"}},[t("el-form-item",{attrs:{label:"帐号",prop:"name"}},[t("el-input",{model:{value:e.regForm.name,callback:function(r){e.$set(e.regForm,"name",r)},expression:"regForm.name"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-input",{model:{value:e.regForm.password,callback:function(r){e.$set(e.regForm,"password",r)},expression:"regForm.password"}})],1),e._v(" "),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:function(r){return e.reg("ruleForm2")}}},[e._v("立即创建")]),e._v(" "),t("el-button",{on:{click:function(r){return e.resetForm("regForm")}}},[e._v("重置")])],1)],1)]],2)],1)],1)},staticRenderFns:[]};var u=t("C7Lr")(l,a,!1,function(e){t("3ydl")},null,null).exports,m=t("lO7g"),c={data:function(){return{ruleForm:{name:"",password:""},rules:{name:[{required:!0,message:"请输入帐号",trigger:"blur"},{min:5,max:16,message:"长度在 5 到 16 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:5,max:16,message:"长度在 5 到 16 个字符",trigger:"blur"}]}}},methods:{submitForm:function(e){this.$refs[e].validate(function(e){if(!e)return console.log("error submit!!"),!1;alert("submit!")})},resetForm:function(e){this.$refs[e].resetFields()}}},p={render:function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.ruleForm,rules:e.rules,"label-width":"100px"}},[t("el-form-item",{attrs:{label:"帐号",prop:"name"}},[t("el-input",{model:{value:e.ruleForm.name,callback:function(r){e.$set(e.ruleForm,"name",r)},expression:"ruleForm.name"}})],1),e._v(" "),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-input",{model:{value:e.ruleForm.password,callback:function(r){e.$set(e.ruleForm,"password",r)},expression:"ruleForm.password"}})],1),e._v(" "),t("el-form-item",[t("el-button",{attrs:{type:"primary"},on:{click:function(r){return e.submitForm("ruleForm")}}},[e._v("立即创建")]),e._v(" "),t("el-button",{on:{click:function(r){return e.resetForm("ruleForm")}}},[e._v("重置")])],1)],1)},staticRenderFns:[]},d=t("C7Lr")(c,p,!1,null,null,null).exports;o.default.use(i.a);var f=new i.a({routes:[{path:"/",name:"index",component:u},{path:"/home",name:"home",component:m.default},{path:"/register",name:"register",component:d}]}),g=t("bzuk"),h=t.n(g),b=(t("4WSK"),t("OolZ"));o.default.config.productionTip=!1,o.default.use(b.a),o.default.use(h.a),new o.default({el:"#app",router:f,components:{App:s},template:"<App/>"})},jjzs:function(e,r){},lO7g:function(e,r,t){"use strict";var o=t("jjzs"),n=t.n(o),s=t("wufV"),i=t("C7Lr")(n.a,s.a,!1,null,null,null);r.default=i.exports},wufV:function(e,r,t){"use strict";var o={render:function(){var e=this.$createElement;return(this._self._c||e)("div",[this._v("\n  home page\n")])},staticRenderFns:[]};r.a=o}},["NHnr"]);
//# sourceMappingURL=app.5b251a72b097ee903aca.js.map