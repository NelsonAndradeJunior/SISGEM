package br.com.sisgem.test.sf.primefaces.repositories;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.sisgem.model.BairrosEntity;
import br.com.sisgem.model.CidadesEntity;
import br.com.sisgem.model.UfEntity;
import br.com.sisgem.model.repository.IBairrosRepository;
import br.com.sisgem.model.repository.ICidadesRepository;
import br.com.sisgem.model.repository.IUfRepository;
import br.com.sisgem.test.jsf.primefaces.AbstractDatabaseTest;

public class EnderecosTest extends AbstractDatabaseTest {
	
	private static final Logger LOGGER= Logger.getLogger(EnderecosTest.class);
	
	@Inject
	private IUfRepository ufRepository;
	private ICidadesRepository cidadesRepository;
	private IBairrosRepository bairrosRepository;
	
	UfEntity ufEntity = new UfEntity();
	CidadesEntity cidadesEntity = new CidadesEntity();
    BairrosEntity bairrosEntity = new BairrosEntity();
	
	
	@Test
	public void testFindTeste(){
	List<UfEntity> ufList = this.ufRepository.findByUf("PR");
	LOGGER.info(ufList);
		
	
		
		System.out.println(ufEntity.getId());
		LOGGER.info(ufEntity.getId());

		
		
		
		LOGGER.info(ufList);
		

   //List<CidadesEntity> cidadesList = this.cidadesRepository.findByCidades("Curitiba",18);
   //LOGGER.info(cidadesList);
	    
	   // List<BairrosEntity> bairrosList = this.bairrosRepository.findByBairros("Centro",6015);
	   // LOGGER.info(bairrosList);

   //List<CidadesEntity> cidadesList = this.cidadesRepository.findByCidades("Curitiba",18);
   //LOGGER.info(cidadesList);
	    
	   // List<BairrosEntity> bairrosList = this.bairrosRepository.findByBairros("Centro",6015);
	   // LOGGER.info(bairrosList);

	}
	
	UfEntity ufEntity = new UfEntity();
}
