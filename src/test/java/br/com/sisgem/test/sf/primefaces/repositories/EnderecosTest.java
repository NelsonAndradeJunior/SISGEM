package br.com.sisgem.test.sf.primefaces.repositories;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.junit.Test;

import br.com.sisgem.enums.Ecargo;
import br.com.sisgem.enums.EinativoAtivo;
import br.com.sisgem.model.FornecedorEntity;
import br.com.sisgem.model.UfEntity;
import br.com.sisgem.model.UsuarioEntity;
import br.com.sisgem.model.repository.IFornecedorRepository;
import br.com.sisgem.model.repository.IUfRepository;
import br.com.sisgem.model.repository.IUsuarioRepository;
import br.com.sisgem.test.jsf.primefaces.AbstractDatabaseTest;

public class EnderecosTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER= Logger.getLogger(EnderecosTest.class);
	
	@Inject
	private IUfRepository ufRepository;
	
	
//	@Test
//	public void testFindAll(){
//		List<UfEntity> ufList = this.ufRepository.findAll();
//		LOGGER.info(ufList);
//}
	
	@Test
	public void testFindTeste(){
		List<UfEntity> ufList = this.ufRepository.findByUf("PR");
		
		UfEntity id = new UfEntity();
		
		LOGGER.info(UfEntity.getSerialversionuid());
		LOGGER.info(ufList);
		
	   // For(UfEntity id : ufList){  
	   //       System.out.print(id.getNome());  
	   // }  
	}
	
	
	UfEntity ufEntity = new UfEntity();
}
