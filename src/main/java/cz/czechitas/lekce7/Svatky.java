package cz.czechitas.lekce7;

import java.time.Month;
import java.time.MonthDay;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Třída s informacemi o tom,kdo má kdy svátek.
 */
public class Svatky {
    private final Map<String, MonthDay> svatky = new HashMap<>();

    public Svatky() {
        svatky.put("Alfonse Elric", MonthDay.of(5, 2));
        svatky.put("Ichigo Kurosaki", MonthDay.of(5, 3));
        svatky.put("Rukia Kuchiki", MonthDay.of(5, 3));
        svatky.put("Byakuya Kuchiki", MonthDay.of(5, 4));
        svatky.put("Son Goku", MonthDay.of(5, 5));
        svatky.put("Kakarote", MonthDay.of(5, 5));
        svatky.put("Vegeta", MonthDay.of(5, 5));
        svatky.put("Bulma", MonthDay.of(5, 6));
        svatky.put("Freeza", MonthDay.of(5, 7));
        svatky.put("Son Gohan", MonthDay.of(5, 9));
        svatky.put("Son Goten", MonthDay.of(5, 9));
        svatky.put("Kuririne", MonthDay.of(5, 10));
        svatky.put("Madoka", MonthDay.of(5, 11));
        svatky.put("Homura", MonthDay.of(5, 12));
        svatky.put("Piccolo", MonthDay.of(5, 13));
        svatky.put("Muten Roshi", MonthDay.of(5, 14));
        svatky.put("Tanjiro", MonthDay.of(5, 15));
        svatky.put("Cell", MonthDay.of(5, 16));
        svatky.put("Totoro", MonthDay.of(5, 17));
        svatky.put("Mononoke", MonthDay.of(5, 18));
        svatky.put("Agitou", MonthDay.of(5, 19));
        svatky.put("Chihiro", MonthDay.of(5, 20));
        svatky.put("No face", MonthDay.of(5, 21));
        svatky.put("Light Yagami", MonthDay.of(5, 22));
        svatky.put("Ryuk", MonthDay.of(5, 23));
        svatky.put("L", MonthDay.of(5, 23));
        svatky.put("Ryuzaki", MonthDay.of(5, 24));
        svatky.put("Misa Amane", MonthDay.of(5, 24));
        svatky.put("Renji Abarai", MonthDay.of(5, 25));
        svatky.put("Sosuke Aizen", MonthDay.of(5, 26));
        svatky.put("Kisuke Urahara", MonthDay.of(5, 27));
        svatky.put("Kenpachi Zaraki", MonthDay.of(5, 28));
        svatky.put("Ulquirra Cifer", MonthDay.of(5, 28));
        svatky.put("Nel tu", MonthDay.of(5, 29));
        svatky.put("Shinji Hirako", MonthDay.of(5, 29));
        svatky.put("Zangetsu", MonthDay.of(5, 30));
        svatky.put("Trunks", MonthDay.of(5, 31));
    }

    /**
     * Vrací den, kdy má zadané jméno svátek.
     *
     * @param jmeno Hledané jméno.
     * @return Den a měsíc, případně {@code null}, pokud jméno nebylo nalezeno.
     */
    public MonthDay vratKdyMaSvatek(String jmeno) {
        //TODO

        return svatky.get(jmeno);
    }

    /**
     * Vrací informaci, zda je dané jméno uvedeno v seznamu.
     *
     * @param jmeno Hledané jméno.
     * @return {@code true}, pokud je jméno v seznamu. Jinak vrací {@code false}.
     */
    public boolean jeVSeznamu(String jmeno) {
        //TODO
        return svatky.containsKey(jmeno);
    }

    /**
     * Vrací počet jmen uvedených v seznamu.
     *
     * @return
     */
    public int getPocetJmen() {
        //TODO
        return svatky.size();
    }

    /**
     * Vrací seznam jmen, pro které je uveden datum svátku.
     *
     * @return Neseřazený seznam jmen.
     */
    public Set<String> getSeznamJmen() {
        //TODO
        return svatky.keySet();
    }

    /**
     * Přidá na seznam svátků nové jméno.
     *
     * @param jmeno    Jméno.
     * @param denMesic Den a měsíc, kdy má dané jméno svátek.
     */
    public void pridejSvatek(String jmeno, MonthDay denMesic) {
        //TODO
        svatky.put(jmeno, denMesic);
    }

    /**
     * Přidá na seznam svátků nové jméno.
     *
     * @param jmeno Jméno.
     * @param den   Den v měsíci, kdy má dané jméno svátek (1–31).
     * @param mesic Měsíc, kdy má dané jméno svátek (1–12).
     */
    public void pridejSvatek(String jmeno, int den, int mesic) {
        //TODO
        svatky.put(jmeno, MonthDay.of(den, mesic));

    }

    /**
     * Přidá na seznam svátků nové jméno.
     *
     * @param jmeno Jméno.
     * @param den   Den v měsíci, kdy má dané jméno svátek (1–31).
     * @param mesic Měsíc, kdy má dané jméno svátek.
     */
    public void pridejSvatek(String jmeno, int den, Month mesic) {
        //TODO
        svatky.put(jmeno, MonthDay.of(mesic, den));

    }

    /**
     * Smaže jméno ze seznamu svátků.
     *
     * @param jmeno Jméno ke smazání.
     */
    public void smazSvatek(String jmeno) {
        //TODO
        svatky.remove(jmeno);
    }
}
