package br.com.sisgem.test.sf.primefaces.repositories;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.sisgem.enums.EinativoAtivo;
import br.com.sisgem.model.ClienteEntity;
import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.repository.IClienteRepository;
import br.com.sisgem.test.jsf.primefaces.AbstractDatabaseTest;

public class ClienteTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER= Logger.getLogger(ClienteTest.class);
	
	@Inject
	private IClienteRepository clienteRepository;
	
	@Test
	public void testFindAll(){
		List<ClienteEntity> clienteList = this.clienteRepository.findAll();
		LOGGER.info(clienteList);
	}
	
	@Test
	public void testInsertCliente(){
		Date d = new Date(); 
		
		clienteEntity.setNomeRazaoS("João");
		clienteEntity.setNumeroEnd(11);
		clienteEntity.setComplemento("apt 34");
		clienteEntity.setTelefone("8546-5224");
		clienteEntity.setCelular("5468-6541");
		clienteEntity.setCNPJCPF("316.1561/00001-35");
		clienteEntity.setEmail("joao@terra.com.br");
		clienteEntity.setIE("testeaie");
		clienteEntity.setIE("testeIM");
		clienteEntity.setStatusCliente(EinativoAtivo.Ativo);

			
			this.clienteRepository.save(clienteEntity);
			Long id = clienteEntity.getId();
			
//			PessoaJuridicaFornecedorEntity fornecedorInserido = this.fornecedorRepository.findOne(id);
//			LOGGER.info(fornecedorInserido);
	}
	
	ClienteEntity clienteEntity = new ClienteEntity();
}
