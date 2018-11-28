package com.eviac.blog.powermock.dao;

import com.eviac.blog.powermock.dto.User;
import com.eviac.blog.powermock.util.IDGenerator;

public class UserDAO {

	public int create(User user) {

		int id = IDGenerator.generateID();

		// Save user into database.

		return id;

	}

}
