package com.zaurtregulov.spring.mvc_hibernate_aop.dao;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.User;

import java.util.List;

public interface UserDAO {

    public List<User> getAllUsers();
}
