import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void contratado() {
        Contratado contratado1 = new Contratado("Laiane", "Barbalho", "00125-8", "Central-Park", 50.0, 10);
        Efetivo efetivo1 = new Efetivo("Benazit", "Gorgonio", "00124-9", "NY", 2500.00, 550.00, 125.00);

        contratado1.pagamentoDeSalario();
//        System.out.println(contratado1);

        efetivo1.pagamentoDeSalario();
    }
}