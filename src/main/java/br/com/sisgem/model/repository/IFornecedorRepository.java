package br.com.sisgem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisgem.model.FornecedorEntity;

public interface IFornecedorRepository extends JpaRepository<FornecedorEntity, Long>{

}
