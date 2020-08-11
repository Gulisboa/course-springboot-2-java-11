package com.lisboa.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lisboa.couser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
