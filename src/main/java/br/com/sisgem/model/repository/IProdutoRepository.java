package br.com.sisgem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisgem.model.ProdutoEntity;

public interface IProdutoRepository extends JpaRepository<ProdutoEntity, Long>{

}
