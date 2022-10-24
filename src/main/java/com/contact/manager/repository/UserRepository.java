package com.contact.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.manager.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
