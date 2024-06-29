package com.websystem.schedule.repository;

import com.websystem.schedule.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
