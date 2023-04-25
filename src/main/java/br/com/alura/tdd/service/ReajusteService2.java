package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho2;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService2 {

    public void concederReajuste2(Funcionario funcionario, Desempenho2 desempenho2){

        BigDecimal percentual = desempenho2.percentualReajuste2();
        BigDecimal reajuste = desempenho2.percentualReajuste2().multiply(percentual);
        funcionario.reajusteSalarial(reajuste);
    }


}
