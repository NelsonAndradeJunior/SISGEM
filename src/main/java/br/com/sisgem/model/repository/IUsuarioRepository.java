package br.com.sisgem.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.sisgem.model.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	@Query("select p from UsuarioEntity p where p.Nome like %?1%")
	public List<UsuarioEntity> findByNome(String paramUsuario);

//	public UsuarioEntity findByUsernameAndPassword(String username, String password);
}
