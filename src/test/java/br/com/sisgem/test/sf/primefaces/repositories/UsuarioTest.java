package br.com.sisgem.test.sf.primefaces.repositories;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.sisgem.enums.Ecargo;
import br.com.sisgem.enums.EinativoAtivo;
import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.UsuarioEntity;
import br.com.sisgem.model.repository.IFornecedorRepository;
import br.com.sisgem.model.repository.IUsuarioRepository;
import br.com.sisgem.test.jsf.primefaces.AbstractDatabaseTest;

public class UsuarioTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER= Logger.getLogger(UsuarioTest.class);
	
	@Inject
	private IUsuarioRepository usuarioRepository;
	
	@Test
	public void testFindAll(){
		List<UsuarioEntity> usuarioList = this.usuarioRepository.findAll();
		LOGGER.info(usuarioList);
	}
	
	@Test
	public void testInsertUsuario(){
		Date d = new Date(); 
		
		usuarioEntity.setDtaValiCM(d);
		usuarioEntity.setEmail("teste@email");
		usuarioEntity.setCargo(Ecargo.Administrador);
		usuarioEntity.setCelular("9999-9999");
		usuarioEntity.setSenha("123456");
		usuarioEntity.setNome("Rodrigo");
		usuarioEntity.setNumeroEnd(82);
		usuarioEntity.setTelefone("999-99999");
		usuarioEntity.setCMotorista("546231854113");

			
			this.usuarioRepository.save(usuarioEntity);
			Long id = usuarioEntity.getId();
//			PessoaJuridicaFornecedorEntity fornecedorInserido = this.fornecedorRepository.findOne(id);
			
//			LOGGER.info(fornecedorInserido);
	}
	
	UsuarioEntity usuarioEntity = new UsuarioEntity();
}
