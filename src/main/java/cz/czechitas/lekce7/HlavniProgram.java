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


        svatky.smazSvatek("Kdo");
        System.out.printf("Po smazání Kdovíka je v seznamu je %d jmen.", svatky.getPocetJmen()).println();

        svatky.pridejSvatek("Rukia", 1, 6);
        svatky.pridejSvatek("Ichigo", 2, Month.JUNE);
        svatky.pridejSvatek("Byakuya", MonthDay.of(6, 3));
        svatky.pridejSvatek("Ishida", MonthDay.of(Month.JUNE, 3));
        System.out.printf("Po přidání Rukii, Ichiga, Kuchiki Byakuyi a Ishida je v seznamu je %d jmen.", svatky.getPocetJmen()).println();

    }


}
