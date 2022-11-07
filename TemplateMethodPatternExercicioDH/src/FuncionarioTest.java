import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void executandoContratado(){
        Contratado contratado1 = new Contratado("Laiane", "Barbalho", "800-55", "New York", 20, 200);

        contratado1.pagamentoSalario();
    }

    @Test
    void executandoEfetivo(){
        Efetivo efetivo1 = new Efetivo("Benazit", "Gorgonio", "8009-2", "Brazil", 2500.0, 500, 150);

        efetivo1.pagamentoSalario();
    }
}