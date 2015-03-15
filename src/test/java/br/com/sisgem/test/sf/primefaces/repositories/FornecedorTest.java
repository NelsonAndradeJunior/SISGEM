package br.com.sisgem.test.sf.primefaces.repositories;

import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.repository.IFornecedorRepository;
import br.com.sisgem.test.jsf.primefaces.AbstractDatabaseTest;

public class FornecedorTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER= Logger.getLogger(FornecedorTest.class);
	
	@Inject
	private IFornecedorRepository fornecedorRepository;
	
	@Test
	public void testFindAll(){
		List<FornecedorEntity> fornecedorList = this.fornecedorRepository.findAll();
		LOGGER.info(fornecedorList);
	}
	
	FornecedorEntity fornecedorEntity = new FornecedorEntity();
}
