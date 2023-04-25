package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest5 {


    @Test
    void bonusDeveSerZeroParaSalariosMuitoAltos(){
        BonusService service = new BonusService();
        BigDecimal bonus= service.calcularBonus(new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("25000")));


        assertEquals(BigDecimal.ZERO,bonus);
        System.out.println(bonus);
    }


}
