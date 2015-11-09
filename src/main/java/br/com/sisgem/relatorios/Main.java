package br.com.sisgem.relatorios;


import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import br.com.sisgem.relatorios.jdbc.ConnectionFactory;
import br.com.sisgem.relatorios.util.ReportUtils;

/**
* Ponto de entrada do projeto.
*
* @author 
*/
public class Main {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
       new Main().abrirRelatorioClientes();
   }

   public void abrirRelatorioClientes() {

       /*
        * Obtendo o arquivo do relatório.
        * Note que estamos utilizando um InputStream para obter o arquivo que
        * está dentro do nosso projeto. Fazendo isso, não teremos problema
        * quando nosso projeto for empacotado em um .jar.
        *
        * Note que o caminho do .jasper inicia com /, ou seja, a raiz da
        * localização das classes compiladas do nosso projeto
        * (o pacote default).
        *
        * Utilize a aba Files (canto superior esquerdo) e veja que os arquivos
        * .jasper e .jrxml são copiados para o diretório /build/classes
        * e por consequencia para o .jar que for criado.
        *
        * Se não os estiver vendo, mande dar um Clean and Build no projeto
        * (botão direito no nó raiz do projeto, Clean and Build (Limpar e Construir)
        *
        */
       InputStream inputStream = getClass().getResourceAsStream( "VerificaCarro.jasper" );

       // mapa de parâmetros do relatório (ainda vamos aprender a usar)
       Map parametros = new HashMap();
       
       parametros.put( "Parameter1", "Vendedor" );
       

       try {

           // abre o relatório
           ReportUtils.openReport( "VerificaCarro", inputStream, parametros,
                   ConnectionFactory.getSakilaConnection() );

       } catch ( SQLException exc ) {
           exc.printStackTrace();
       } catch ( JRException exc ) {
           exc.printStackTrace();
       }

   }

}