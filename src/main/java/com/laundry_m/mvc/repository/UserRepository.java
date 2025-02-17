package com.laundry_m.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laundry_m.mvc.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}
