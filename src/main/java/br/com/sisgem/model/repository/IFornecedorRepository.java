package br.com.sisgem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.sisgem.model.FornecedorEntity;

public interface IFornecedorRepository extends JpaRepository<FornecedorEntity, Long>{
//	@Query("select p from FornecedorEntity p where p.CNPJ like %?1% or p.Nome like %?1% or p.RazaoSocial like %?1%")
//	public List<FornecedorEntity> findByCNPJ(String paramFornecedor);
}
