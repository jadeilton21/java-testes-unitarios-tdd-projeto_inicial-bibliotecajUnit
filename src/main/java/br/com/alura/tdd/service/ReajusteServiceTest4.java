package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho2;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest4 {


    private ReajusteService service2;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        System.out.println("--> Código Inicializado...");
        this.service2 = new ReajusteService();
        this.funcionario = new Funcionario("Jadeilton", LocalDate.now(), new BigDecimal("1000"));
    }
    @BeforeAll
    public static void antesDoPresente(){
        System.out.println("--> Antes Do Presente!!");
    }
    @AfterAll
    public static void depoisDoPresente(){
        System.out.println("--> Depois Do presente");
    }


    @Test
    void reajusteDeveSerParaQuemDesempenhoADesejar(){

        inicializar();

        service2.concederReajuste2(funcionario, Desempenho2.A_DESEJAR);
        assertEquals(new BigDecimal("1300.00"), funcionario.getSalario());


    }

    @Test
    void reajusteDeveSerParaQuemDesempenhoBom(){
        inicializar();
        service2.concederReajuste2(funcionario, Desempenho2.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDeveSerParaQuemDesempenhaOtimo(){
        inicializar();
        service2.concederReajuste2(funcionario, Desempenho2.OTIMO);

        assertEquals(new BigDecimal("1200.00"),funcionario.getSalario());
    }
    @AfterEach
    public void fimDoCodigo(){
        System.out.println("--> Fechando O Código...");
    }




}
