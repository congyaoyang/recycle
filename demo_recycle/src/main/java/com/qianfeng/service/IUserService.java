package com.qianfeng.service;

import com.qianfeng.vo.LoginInfoVO;

public interface IUserService {

    public Boolean login(LoginInfoVO loginInfoVO);

    public void regist(String username,String password);
}
