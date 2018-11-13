package com.zxz.dao.user;

import com.zxz.pojo.User;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User findUser(@Param("user") User user);

    public int updateUser(@Param("user") User user);
    
    public List<User> findUserList(@Param("user")User user,@Param("pageIndex")Integer pageIndex,
    		@Param("pageSize")Integer pageSize);
    
    public int getUserCount(@Param("user")User user);
    
    public int addUser(User user);
    
    public int deleteUser(Integer id);

}
