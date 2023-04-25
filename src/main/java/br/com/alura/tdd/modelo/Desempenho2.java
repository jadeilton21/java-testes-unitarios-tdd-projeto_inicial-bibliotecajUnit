package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho2 {
    BOM{
        @Override
        public BigDecimal percentualReajuste2() {
            return new BigDecimal("0.15");
        }
    },
    OTIMO{
        @Override
        public BigDecimal percentualReajuste2() {
            return new BigDecimal("0.2");
        }
    },
    A_DESEJAR{
        @Override
        public BigDecimal percentualReajuste2() {
            return new BigDecimal("0.3");
        }
    };



    public abstract BigDecimal percentualReajuste2();

}
