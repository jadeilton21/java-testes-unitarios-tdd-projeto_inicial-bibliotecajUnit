package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest2 {


    @Test
    public void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto2() {
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario(" Jadeilton", LocalDate.now(),new BigDecimal("25000")));

        System.out.println("--> é esse");
        assertEquals(BigDecimal.ZERO, bonus);
        System.out.println(bonus);

    }


    @Test
    public void bonusDeveriaTerParaFuncionariosComSalarioBaixo(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Jadeilton", LocalDate.now(),new BigDecimal("2500")));
        System.out.println("--> é o outro: ");
        System.out.println(bonus);


    }

}
