package com.adina.adina.repository;

import com.adina.adina.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer>
{

}
