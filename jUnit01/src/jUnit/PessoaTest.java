package jUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.testng.annotations.Test;

public class PessoaTest {
    @BeforeAll
    public static void doBeforeAll(){
        System.out.println("Esta dentro do before all");
    }

    @BeforeEach
    public void doBefore(){
        System.out.println("Esta dentro do before each");
    }
    @Test
    public void adicionarColecao1(){
        System.out.println("teste 1");
    }
    @Test
    public void adicionarColecao2(){
        System.out.println("teste 2");
    }
    @Test
    @Disabled("Teste nao foi executado")
    public void adicionarColecao3(){
        System.out.println("teste 3");
    }
    @Test
    public void adicionarColecao4(){
        System.out.println("teste 4");
    }
}