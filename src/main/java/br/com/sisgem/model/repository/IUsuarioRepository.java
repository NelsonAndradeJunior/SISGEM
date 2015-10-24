package br.com.sisgem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	@Query("select p from UsuarioEntity p where p.Nome like %?1% or p.Telefone like %?1% or p.Cargo like %?1%")
	public List<UsuarioEntity> findByUsuario(String paramUsuario);

}
