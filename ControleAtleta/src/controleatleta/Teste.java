package controleatleta;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrebsguedes
 */
public class Teste {
    
    public Teste() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    ControleNadador controle;
    Nadador nadador;
    Nadador outroNadador;
    Premiacao premiacao;
    
    @Before
    public void setUp() {
        controle  = new ControleNadador();
        nadador = new Nadador("Teste");
        premiacao = new Premiacao("Prova",1990,"Medalha",300);
        ArrayList<Premiacao> premiacoes = new ArrayList<Premiacao>();
        premiacoes.add(premiacao);
        nadador.setPremiacoes(premiacoes);
        controle.adicionar(nadador);
    }
    
    @Test
    public void testListaAtiradores(){
        ArrayList<Nadador> listaNadadores = new ArrayList<Nadador>();
        listaNadadores.add(nadador);
        assertEquals(listaNadadores, controle.getListaNadadores());
    }
    @Test
    public void testAddAtirador(){
        controle.adicionar(outroNadador = new Nadador("Outro"));
        assertEquals(outroNadador, controle.pesquisar("Outro"));
    }
    @Test
    public void testGetAtirador(){
        assertEquals(nadador, controle.pesquisar("Teste"));
    }
    @Test
    public void testRemoveAtirador(){
        controle.remover(nadador);
        assertEquals(true, controle.getListaNadadores().isEmpty());
    }
    
    
    @Test
    public void testListaAtiradoresNome(){
        ArrayList<Nadador> listaNadadores = new ArrayList<Nadador>();
        listaNadadores.add(nadador);
        assertEquals(listaNadadores, controle.getListaNadadores());
    }
    
    @Test
    public void testListaAtiradoresProva(){
        premiacao = new Premiacao("Prova",1990,"Medalha",300);
        ArrayList<Premiacao> premiacoes = new ArrayList<Premiacao>();
        premiacoes.add(premiacao);
        nadador.setPremiacoes(premiacoes);
        ArrayList<Nadador> listaNadadores = new ArrayList<Nadador>();
        listaNadadores.add(nadador);
        
    }
    
    
    
    @After
    public void tearDown() {
    }
  
}
    

