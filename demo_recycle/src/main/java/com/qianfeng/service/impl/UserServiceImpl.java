package com.qianfeng.service.impl;

import com.qianfeng.mapper.UserMapper;
import com.qianfeng.po.UserInfo;
import com.qianfeng.service.IUserService;
import com.qianfeng.utils.MD5Utils;
import com.qianfeng.vo.LoginInfoVO;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean login(LoginInfoVO loginInfoVO) {
        if (loginInfoVO == null) {
            throw new NullPointerException("param is null");
        }
        String username = loginInfoVO.getUsername();
        String password = loginInfoVO.getPassword();
        if (null == username || "".equals(username)) {
            throw new NullPointerException("username is null");
        }

        //1、检验用户名在数据库是否存在
        UserInfo userInfo = userMapper.selectUserInfoByName(username);
        if (userInfo == null) {
            throw new UnknownAccountException();
        }

        //2、密码校验
        //a、先对用户传入的密码进行加密
        String md5Password = MD5Utils.md5(password, username);
        //b、同数据库的密文进行对比
        if (!md5Password.equals(userInfo.getUserPassword())){
            throw new IncorrectCredentialsException();
        }
        return null;
    }

    @Override
    public void regist(String username,String password) {
         String md5Password = MD5Utils.md5(password, username);
         userMapper.registUserInfo(username,md5Password);
    }
}
