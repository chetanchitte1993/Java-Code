package com.bugtraking.api.dao;

import com.bugtraking.api.entity.UserRole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRoleDao extends JpaRepository<UserRole, Long> {



}
