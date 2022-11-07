package com.digitalhouse.junit;


import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class PessoaTest {

    static Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;

    int tamanho;

    @BeforeAll
    static void doBeforeAll(){
//        p1 = new Pessoa("Ivolanda", "Ganda");
//        p1.setDataNasc(LocalDate.of(2000,3,23));
//        p2 = new Pessoa("Ana", "Musk");
//        p2.setDataNasc(LocalDate.of(1966,1,03));
//        p3 = new Pessoa("Joe", "Morello");
//        p3.setDataNasc(LocalDate.of(2010, 12, 04));
//        p4 = new Pessoa("Rob", "Johnson");
//        p4.setDataNasc(LocalDate.of(1976, 10, 25));
//        p5 = new Pessoa("Ted", "Trujillo");
//        p5.setDataNasc(LocalDate.of(2014, 5, 14));
//        p6 = new Pessoa("Robert", "Traids");
//        p6.setDataNasc(LocalDate.of(2000, 3, 30));
//        p7 = new Pessoa("Renata", "Castro");
//        p7.setDataNasc(LocalDate.of(2010, 1, 18));
//        p8 = new Pessoa("Murilo", "Bianch");
//        p8.setDataNasc(LocalDate.of(2015, 7, 11));
//        p9 = new Pessoa("Candido", "Silveira");
//        p9.setDataNasc(LocalDate.of(1975, 9, 01));
//        p10 = new Pessoa("Camila", "Porto");
//        p10.setDataNasc(LocalDate.of(2014, 5, 25));
    }

    @BeforeEach
    void doBefore(){
        tamanho = Pessoa.colecao.size();
    }

    @Test
    void imprimirPessoas(){
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
//        System.out.println(p5.toString());
//        System.out.println(p6.toString());
//        System.out.println(p7.toString());
//        System.out.println(p8.toString());
//        System.out.println(p9.toString());
//        System.out.println(p10.toString());
    }

    @Test
    void testeNaoInserindoColecao(){
        Pessoa pessoa = new Pessoa("Ivo", "Ganda");
        pessoa.setDataNasc(LocalDate.of(2000,3,23));
        pessoa.adicionarNomes(pessoa);
        Assertions.assertTrue(pessoa.getColecao().size() == tamanho);
        System.out.println(pessoa);
    }
    @Test
    void testeInserindoColecao(){
        Pessoa pessoa = new Pessoa("Ivolanda", "Ganda");
        pessoa.setDataNasc(LocalDate.of(2000,3,23));


        System.out.println(pessoa);

        pessoa.adicionarNomes(pessoa);
        Assertions.assertTrue(pessoa.getColecao().size() > tamanho);
    }

    @Test
    void testandoAssertTrue(){
        //Assertions.assertTrue(p1.returnTrue());
    }

}