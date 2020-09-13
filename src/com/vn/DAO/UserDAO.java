package com.vn.DAO;

import java.util.List;

import com.vn.entities.User;

public interface UserDAO {
	Integer delete(String userName);

	User create(User user);

	User update(User user);

	List<User> getAll();

	User findById(String userName);

}
