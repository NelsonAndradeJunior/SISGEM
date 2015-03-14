package br.com.sisgem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisgem.model.UserEntity;

public interface IUserRepository extends JpaRepository<UserEntity, Long>{
	
	public UserEntity findByUsernameAndPassword(String username, String password);
}

