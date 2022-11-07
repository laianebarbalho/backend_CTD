package com.digitalhouse.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @BeforeAll
    static void imprimirMsg(){
        System.out.println("Iniciando teste com @BeforeAll!");
    }

    @BeforeEach
    void doBeforeEach() {
        System.out.println("Dentro do @BeforeEach!");
    }

    @Test
    public void adicionarColecao1(){
        System.out.println("teste 1");
    }

    @Test
    @Disabled("Teste 2 nao foi executado")
    public void adicionarColecao2(){
        System.out.println("teste 2");
    }

    @Test
    public void adicionarColecao3() {
        System.out.println("teste 3");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After ALL!!");
    }

    @AfterEach
    void afterEach() {
        System.out.println("After Each!");
    }

}