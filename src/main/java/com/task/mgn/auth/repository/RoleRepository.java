package com.task.mgn.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.mgn.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
