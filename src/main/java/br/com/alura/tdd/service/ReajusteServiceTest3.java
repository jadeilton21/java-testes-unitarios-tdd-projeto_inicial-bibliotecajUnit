package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest3 {

    private ReajusteService service;
    private Funcionario funcionario;
    @BeforeEach
    public void inicializar(){
        System.out.println("--> Inicializar Código.");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000"));
    }

    @Test
    void reajusteDeveSerFeitoParaDesempenhoADesejar(){

        inicializar();
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

        assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());

    }

    @Test
    void reajusteDeveSerFeitoParaDesempenhoBom(){

        inicializar();
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

    }


    @Test
    void reajusteDeveSerFeitoParaDesempenhoOtimo(){

        inicializar();
        service.concederReajuste(funcionario, Desempenho.OTIMO);

        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

    }
    @AfterEach
    public void finalizar(){
        System.out.println("Finalizar Código!!!!");
    }




    @BeforeAll
    public static void antesDeTudo(){
        System.out.println("-- Antes de Tudo...");
    }

    @AfterAll
    public static void depoisDeTudo(){
        System.out.println("-- Depois de Tudo....");
    }
}
