package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho3;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteTestService5 {

    private ReajusteService service3;
    private Funcionario funcionario;

    public void inicializarCodigo(){
        System.out.println("--> Incializar Código!");
        this.service3 = new ReajusteService();
        this.funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000"));
    }
    @BeforeEach
    public void fimDoCodigo(){
        System.out.println("--> Fim Dó Código!");
    }
    @BeforeAll
    public static void antesDoInicio(){
        System.out.println("--> Antes Do Inicio");
    }
    @AfterAll
    public static void depoisDoInicio(){
        System.out.println("--> Depois Do Inicio!!");
    }

    @Test
    public void reajusteParaSerDepositadoParaDesempenhoADesejar(){

        inicializarCodigo();
        service3.concedendoReajuste(funcionario, Desempenho3.A_DESEJAR);
        assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());

    }



    @Test
    public void reajusteParaSerDepositadoParaDesempenhoBom(){
        inicializarCodigo();
        service3.concedendoReajuste(funcionario, Desempenho3.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());


    }


    @Test
    public void reajusteParaSerDepositadoParaDesempenhoOtimo(){

        inicializarCodigo();
        service3.concedendoReajuste(funcionario, Desempenho3.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

    }
}
