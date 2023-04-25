package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho3 {
     A_DESEJAR{
         @Override
         public BigDecimal percentualReajuste() {
             return new BigDecimal("0.3");
         }
     },
    BOM{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    },
    OTIMO{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.2");
        }
    };


     public abstract BigDecimal percentualReajuste();



}
