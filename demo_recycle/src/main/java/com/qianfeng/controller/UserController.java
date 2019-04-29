package com.qianfeng.controller;

import com.qianfeng.service.impl.UserServiceImpl;
import com.qianfeng.vo.JsonResultVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(value = "/login/{userName}/{password}",method = RequestMethod.POST)
    public JsonResultVO loginAjax(@PathVariable("userName")String userName,
                                  @PathVariable("password")String password){

        JsonResultVO jsonResultVO = new JsonResultVO();
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(userName,password));
            jsonResultVO.setCode(1);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            jsonResultVO.setCode(0);
            jsonResultVO.setMsg("登录失败，用户名或者密码错误");
        }

        /*重定向不会经过视图解析器*/
        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
        return jsonResultVO;
    }

    @ResponseBody
    @RequestMapping(value = "/regist/{userName}/{password}",method = RequestMethod.POST)
    public JsonResultVO registAjax(@PathVariable("userName") String userName,@PathVariable("password") String password){
        JsonResultVO jsonResultVO = new JsonResultVO();
        userService.regist(userName,password);
        jsonResultVO.setCode(1);
        jsonResultVO.setMsg("注册成功");
        return jsonResultVO;
    }

}
