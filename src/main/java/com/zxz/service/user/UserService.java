package com.zxz.service.user;


import com.zxz.pojo.User;
import com.zxz.utils.PageInfo;
public interface UserService {

	public User login(User user);

	public boolean updateUser(User user);

	public PageInfo<User> findUserList(User user, Integer pageIndex, Integer pageSize);

	public Integer addUser(User user);

	public boolean deleteUser(Integer id);
}
