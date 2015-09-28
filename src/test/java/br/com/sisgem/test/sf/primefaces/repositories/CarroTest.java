package br.com.sisgem.test.sf.primefaces.repositories;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.sisgem.enums.EinativoAtivo;
import br.com.sisgem.model.CarroEntity;
import br.com.sisgem.model.repository.ICarroRepository;
import br.com.sisgem.test.jsf.primefaces.AbstractDatabaseTest;

public class CarroTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER= Logger.getLogger(CarroTest.class);
	
	@Inject
	private ICarroRepository carroRepository;
	
	@Test
	public void testFindAll(){
		List<CarroEntity> carroList = this.carroRepository.findAll();
		LOGGER.info(carroList);
	}
	
	// inserção na tabela esta funcionando 
	@Test
	public void testInsertCarro(){
			carroEntity.setAluguel(true);
			carroEntity.setAno(20150708);
			carroEntity.setCor("azul");
			//carroEntity.setId(2);
			carroEntity.setLocalCarro("curitiba");
			carroEntity.setModelo("corsa");
			carroEntity.setPlaca("12345");
			carroEntity.setStatusCarro("1");
			carroEntity.setUsuario_idUsuario(1);
			
			this.carroRepository.save(carroEntity);
			Long id = carroEntity.getId();
//			PessoaJuridicaFornecedorEntity fornecedorInserido = this.fornecedorRepository.findOne(id);
			
//			LOGGER.info(fornecedorInserido);
	}
	
	
	
	CarroEntity carroEntity = new CarroEntity();
}
