package OOP;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OOPTest {

    @Test
    public void testMethodDacia() {
        //dam o comanda de o masina Dacia

        List<String> echipamenteLogan = Arrays.asList("Pachet Techno", "Pachet Clima", "Pachet Parking");
        List<String> accesoriiLogan = Arrays.asList("Tableta", "Scrumiera");

        DaciaConfigurator Logan = new DaciaConfigurator("Dacia", "Logan",
                2024, 13000.00, "Essential", "TCE 90", "Alb",
                "Expression", "Textil", "Standard", echipamenteLogan, accesoriiLogan);
        Logan.infoDacia();

        // Comanda pentru o masina Dacia Duster
        List<String> echipamenteDuster = Arrays.asList("Pachet Off-Road", "Pachet Confort", "Pachet Siguranta");
        List<String> accesoriiDuster = Arrays.asList("Bare transversale", "Protectie caroserie");

        DaciaConfigurator Duster = new DaciaConfigurator("Dacia", "Duster",
                2024, 18000.00, "Comfort", "1.5 dCi", "Negru",
                "Expression", "Piele", "Lux", echipamenteDuster, accesoriiDuster);
        Duster.infoDacia();
    }



    @Test
    public void testMethodVolkswagen() {
        //dam o comanda de o masina Volkswagen

        List<String> dotariOptionaleGolf = Arrays.asList("Navigatie", "Pachet Confort", "Pachet Sport");

        VolksWagenConfigurator Golf = new VolksWagenConfigurator("Volkswagen", "Golf",
                2024, 25000.00, "Highline", "2.0 TDI", "Negru", "Metalizat", "18 inch", dotariOptionaleGolf);
        Golf.infoVW();

        // Comanda pentru o masina Volkswagen Polo
        List<String> dotariOptionalePolo = Arrays.asList("Navigatie", "Pachet Confort", "Pachet City");

        VolksWagenConfigurator Polo = new VolksWagenConfigurator("Volkswagen", "Polo",
                2024, 20000.00, "Comfortline", "1.0 TSI", "Rosu", "Metalizat", "16 inch", dotariOptionalePolo);
        Polo.infoVW();
    }
}