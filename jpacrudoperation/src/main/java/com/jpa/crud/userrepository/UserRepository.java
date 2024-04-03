package com.jpa.crud.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
