package com.zxz.service.user;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zxz.dao.user.UserMapper;
import com.zxz.pojo.User;
import com.zxz.utils.PageInfo;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User login(User user) {
		return userMapper.findUser(user);
	}

	@Override
	public boolean updateUser(User user) {
		return userMapper.updateUser(user)>0;
	}

	@Override
	public PageInfo<User> findUserList(User user, Integer pageIndex, Integer pageSize) {
		PageInfo<User> pageInfo=new PageInfo<User>();
		try {
			Integer totalCount=userMapper.getUserCount(user);
			if(totalCount!=null&&totalCount>0){
				pageInfo.setTotalCount(totalCount);
				pageInfo.setPageSize(pageSize);
				pageInfo.setPageIndex(pageIndex);
				pageInfo.setList(userMapper.findUserList(user,
						(pageInfo.getPageIndex()-1)*pageInfo.getPageSize(), pageInfo.getPageSize()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pageInfo;
	}

	@Override
	public Integer addUser(User user) {
		return userMapper.addUser(user);
	}

	@Override
	public boolean deleteUser(Integer id) {
		return userMapper.deleteUser(id)>0;
	}

}
