package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest2 {


    @Test
    void reajusteDeveSerQuinzePorCentoQuandoDesempenhoForADesejar(){

        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000"));


        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }



    @Test
    void reajusteDeveSerDeQuinzePorcentoQuandoDesempenhoForBom(){


        ReajusteService service = new ReajusteService();
        Funcionario funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("100"));

        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("10.00"),funcionario.getSalario());

    }
}
