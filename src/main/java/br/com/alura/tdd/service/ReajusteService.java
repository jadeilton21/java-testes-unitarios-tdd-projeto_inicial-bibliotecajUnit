package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Desempenho2;
import br.com.alura.tdd.modelo.Desempenho3;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
            BigDecimal percentual = desempenho.percentualReajuste();
            BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
            funcionario.reajusteSalarial(reajuste);
        }

    public void concederReajuste2(Funcionario funcionario, Desempenho2 desempenho2) {
        BigDecimal percentual = desempenho2.percentualReajuste2();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajusteSalarial(reajuste);
    }

    public void concedendoReajuste(Funcionario funcionario, Desempenho3 desempenho3) {
        BigDecimal percentual = desempenho3.percentualReajuste();
        BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
        funcionario.reajusteSalarial(reajuste);
    }
}
