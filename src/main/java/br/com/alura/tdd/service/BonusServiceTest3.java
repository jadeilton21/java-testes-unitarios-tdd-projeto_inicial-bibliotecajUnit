package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest3 {

    @Test
    public void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto(){


        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("25000")));



        System.out.println("--> Testando...");
        System.out.println("--> " + bonus);

    }

    @Test
    void bonusDeveriaTerParaSalarioMuitoBaixo(){
        BonusService service = new BonusService();
        BigDecimal bonus = service.calcularBonus(new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000")));



        System.out.println("--> Teste Dois: ");
        System.out.println(bonus);
    }
}
