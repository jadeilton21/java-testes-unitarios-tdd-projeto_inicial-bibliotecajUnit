package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho4;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteTestService6 {
    private ReajusteService4 service4;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        System.out.println("--> Inciio Do Código");
        this.service4 = new ReajusteService4();
        this.funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000"));
    }
    @AfterEach
    public void fimdoCodigo(){
        System.out.println("--> Final do Código!!");
    }

    @BeforeAll
    public static void antesDoPresente(){
        System.out.println("--> Antes do Presente!!!");
    }
    @AfterAll
    public static void depoisPresente(){
        System.out.println("--> Depois do Presente!!");
    }

    @Test
    public void reajusteParaDesempenhoADesejar(){

        inicializar();

        service4.concederReajuste(funcionario, Desempenho4.A_DESEJAR);
        assertEquals(new BigDecimal("1300"), funcionario.getSalario());

    }




    @Test
    public void reajusteParaDesempenhoBom(){


        inicializar();

        service4.concederReajuste(funcionario, Desempenho4.BOM);
        assertEquals(new BigDecimal("1200"), funcionario.getSalario());
    }

    @Test
    void reajusteParaDesempenhoOtimo(){

        inicializar();
        service4.concederReajuste(funcionario, Desempenho4.OTIMO);

        assertEquals(new BigDecimal("1500"), funcionario.getSalario());
    }
}
