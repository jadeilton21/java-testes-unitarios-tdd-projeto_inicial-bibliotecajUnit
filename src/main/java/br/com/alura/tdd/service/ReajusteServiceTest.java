package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {


    @Test
    void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){


        ReajusteServiceTest service = new ReajusteServiceTest();
        Funcionario funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000"));


        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    private void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
        if(desempenho == Desempenho.A_DESEJAR){
            BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.3"));
            funcionario.reajusteSalarial(reajuste);
        }
    }


}
