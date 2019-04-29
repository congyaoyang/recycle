package com.qianfeng.mapper;

import com.qianfeng.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

   UserInfo selectUserInfoByName(@Param("userName") String userName);

   void registUserInfo(@Param("userName") String userName,@Param("userPassword") String userPassword);

}
