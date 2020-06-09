package com.git.dao;

import java.util.List;

public class UserDao {

	public void addUser(int id, String username, String password) {
		//添加操作
	}
	
	public void deleteUser (int id) {
		// 删除操作
	}
	
	public void updateUser(int id, String newUsername, String newPassword) {
		// 修改操作
	}
	
	public List<Object> scanUser (int pageIndex, int pageSize) {
		//查询操作
		return null;
	}
}
