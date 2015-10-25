package br.com.sisgem.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sisgem.model.UsuarioEntity;

public interface IUsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
	
//	@Query("select p from UsuarioEntity p where p.Nome like %?1% or p.Telefone like %?1% or p.Cargo like %?1%")
//	public List<UsuarioEntity> findByUsuario(String paramUsuario);

	public UsuarioEntity findByNameAndPassword(String username, String password);
}
