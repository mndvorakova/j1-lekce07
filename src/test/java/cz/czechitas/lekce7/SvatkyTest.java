package cz.czechitas.lekce7;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Filip Jirsák
 */
class SvatkyTest {

    /**
     * Testuje metodu {@link Svatky#vratKdyMaSvatek(String)}
     */
    @Test
    void kdyMaSvatek() {
        Svatky svatky = new Svatky();
        assertEquals(MonthDay.of(5, 18), svatky.vratKdyMaSvatek("Mononoke"));
        assertNull(svatky.vratKdyMaSvatek("Eva"));
    }

    /**
     * Testuje metodu {@link Svatky#jeVSeznamu(String)}
     */
    @Test
    void jeVSeznamu() {
        //TODO Otestovat, že najde v seznamu existující jméno a nenajde neexistující jméno
        Svatky svatky = new Svatky();
        assertTrue(svatky.jeVSeznamu("Mononoke"));
        assertFalse(svatky.jeVSeznamu("Eva")); //neexistující

    }

    /**
     * Testuje metodu {@link Svatky#getPocetJmen()}
     */
    @Test
    void getPocetJmen() {
        //TODO Otestovat, že vrací počet jmen, která máme v seznamu
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Naushika", 5, 2);
        assertEquals(37 + 1, svatky.getPocetJmen());
    }

    /**
     * Testuje metodu {@link Svatky#getSeznamJmen()}
     */
    @Test
    void getSeznamJmen() {
        //TODO Zkontrolovat, že seznam jmen má správný počet položek.
        Svatky svatky = new Svatky();
        Set<String> seznamJmen = svatky.getSeznamJmen();
        assertEquals(svatky.getPocetJmen(), seznamJmen.size());
        assertFalse(svatky.getSeznamJmen().isEmpty());
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, int)}
     */
    @Test
    void pridatSvatekDenMesicInt() {
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Son Goku", MonthDay.of(5, 5));
        assertTrue(svatky.jeVSeznamu("Son Goku"));
        assertEquals(MonthDay.of(5, 5), svatky.vratKdyMaSvatek("Son Goku"));
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, int, Month)}
     */
    @Test
    void pridatSvatekDenMesicMonth() {
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
        Svatky svatky = new Svatky();
        svatky.pridejSvatek("Bulma", 6, Month.MAY);
        assertEquals(MonthDay.of(MonthDay.of(Month.MAY, 6), svatky.vratKdyMaSvatek("Bulma"));
    }

    /**
     * Testuje metodu {@link Svatky#pridejSvatek(String, MonthDay)}
     */
    @Test
    void pridatSvatekMonthDay() {
        //TODO Otestuje, že je jméno v seznamu svátků a že má přiřazen správný den
        Svatky svatky = new Svatky();
        MonthDay den = MonthDay.of(Month.MAY, 5);
        svatky.pridejSvatek("Kakarote", den);
        assertTrue(svatky.jeVSeznamu("Kakarote"));
        assertEquals(den, svatky.vratKdyMaSvatek("Kakarote"));
    }

    /**
     * Testuje metodu {@link Svatky#smazSvatek(String)}
     */
    @Test
    void smazatSvatek() {
        //TODO Zkontrolovat, že po smazání bude počet svátků odpovídat novému počtu.
        Svatky svatky = new Svatky();
        int pocetJmen = svatky.getPocetJmen();
        svatky.smazSvatek("Chihiro");
        assertFalse(svatky.jeVSeznamu("Chihiro"));
        assertEquals(pocetJmen -1, svatky.getPocetJmen());
    }
}
