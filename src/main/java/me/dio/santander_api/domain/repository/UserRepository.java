package me.dio.santander_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.santander_api.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existsByAccountNumber(Long id);

}
