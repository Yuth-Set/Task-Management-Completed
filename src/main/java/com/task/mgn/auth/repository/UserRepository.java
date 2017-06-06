package com.task.mgn.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.mgn.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}