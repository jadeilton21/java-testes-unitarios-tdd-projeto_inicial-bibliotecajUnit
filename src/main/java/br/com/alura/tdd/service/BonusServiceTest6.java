package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest6 {



    @Test
    void bonusDeveSerZeroParaSalarioMuitoAlto(){

        BonusService2 service = new BonusService2();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("25000")));

        assertEquals(BigDecimal.ZERO, bonus);
        System.out.println(bonus);

    }

    @Test
    void bonusDeveTerParaSalarioMuitoBaixo(){

        BonusService2 service = new BonusService2();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("945")));

        System.out.println(bonus);

    }
}
