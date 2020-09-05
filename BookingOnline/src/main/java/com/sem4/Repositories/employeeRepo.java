package com.sem4.Repositories;

import com.sem4.Model.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepo extends JpaRepository<UserEntity,Integer> {
}
