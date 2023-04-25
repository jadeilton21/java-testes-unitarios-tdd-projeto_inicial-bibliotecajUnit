package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho3;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService3 {
    public void concedendoReajuste(Funcionario funcionario, Desempenho3 desempenho3) {

        BigDecimal percentual =  desempenho3.percentualReajuste();
        BigDecimal reajuste = desempenho3.percentualReajuste().multiply(percentual);
        funcionario.reajusteSalarial(reajuste);
    }
}
