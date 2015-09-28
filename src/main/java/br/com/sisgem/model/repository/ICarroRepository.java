package br.com.sisgem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisgem.model.CarroEntity;

public interface ICarroRepository extends JpaRepository<CarroEntity, Long>{
	
	
}
