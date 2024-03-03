package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        Collections.addAll(osudi, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49);
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */
    public List<Integer> dejVylosovanaCisla() {
        return osudi.subList(0, 6);
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */
    public Integer dejDodatkoveCislo() {
        return osudi.get(6);
    }
}
