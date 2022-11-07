import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void SeOAnimalEPesado(){
        Animal cavalo = new Animal("Cavalo", "Grande", 890);
        Animal cachorro = new Animal("Cachorro", "Pequeno", 15);

        boolean ePesado = cachorro.ehPesado();

        assertEquals(true, cavalo.ehPesado());
        assertFalse(ePesado);

    }
}