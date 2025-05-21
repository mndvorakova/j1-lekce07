package cz.czechitas.lekce7;

import java.time.Month;
import java.time.MonthDay;

/**
 * Hlaví třída pro lekci 7.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        Svatky svatky = new Svatky();

        System.out.printf("V seznamu je %d jmen.", svatky.getPocetJmen()).println();
        System.out.printf("Monika má svátek %s.", svatky.vratKdyMaSvatek("Monika")).println();
        System.out.printf("Eva je v seznamu svátků: %b.", svatky.jeVSeznamu("Eva")).println();

        System.out.println("V seznamu jsou následující jména:");
        svatky.getSeznamJmen().forEach(jmeno -> System.out.printf("- %s", jmeno).println());


        svatky.smazSvatek("Trunks");
        System.out.printf("Po smazání Trunsk-kun je v seznamu je %d jmen.", svatky.getPocetJmen()).println();

        svatky.pridejSvatek("Usagi", 3, 7);
        svatky.pridejSvatek("Jolanda", 2, Month.DECEMBER);
        svatky.pridejSvatek("Son Foi", MonthDay.of(1, 1));
        svatky.pridejSvatek("Asuka", MonthDay.of(Month.JUNE, 3));
        System.out.printf("Po přidání Usagi, Jolandy, Son Foi a Asuky je v seznamu je %d jmen.", svatky.getPocetJmen()).println();

    }


}
