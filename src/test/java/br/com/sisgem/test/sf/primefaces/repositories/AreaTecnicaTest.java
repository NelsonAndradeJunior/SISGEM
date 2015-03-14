//package br.com.sisgem.test.sf.primefaces.repositories;
//
//import java.util.List;
//
//import javax.inject.Inject;
//
//import org.apache.log4j.Logger;
//import org.junit.Test;
//
//import br.com.conlabweb.model.AreaTecnicaEntity;
//import br.com.conlabweb.model.repository.IAreaTecnicaRepository;
//import br.com.conlabweb.test.jsf.primefaces.AbstractDatabaseTest;
//
//public class AreaTecnicaTest extends AbstractDatabaseTest {
//
//	private static final Logger LOGGER = Logger.getLogger(AreaTecnicaTest.class);
//
//	@Inject
//	private IAreaTecnicaRepository areaTecnicaRepository;
//
//	@Test
//	public void testFindAll() {
//		List<AreaTecnicaEntity> areaTecnicaList = this.areaTecnicaRepository.findAll();
//		LOGGER.info(areaTecnicaList);
//	}
//
//	AreaTecnicaEntity areaTecnicaEntity = new AreaTecnicaEntity();
//}
