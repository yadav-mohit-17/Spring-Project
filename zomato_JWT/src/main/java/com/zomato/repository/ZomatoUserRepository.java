package com.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zomato.entity.UserEntity;

public interface ZomatoUserRepository extends JpaRepository<UserEntity, String>{

	UserEntity findByEmailIdAndPassword(String emailId,String password);
}
