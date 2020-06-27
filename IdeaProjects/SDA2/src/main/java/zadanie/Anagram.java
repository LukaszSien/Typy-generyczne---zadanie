package zadanie;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public boolean check(String slowo1, String slowo2){
        Map<Character, Integer> mapaSlowa1 = new HashMap<>();
        Map<Character, Integer> mapaSlowa2 = new HashMap<>();

        if (slowo1.length() != slowo2.length()){
            return false;
        }

       mapaSlowa1 = wypelnijMapeSlow(mapaSlowa1, slowo1.toLowerCase());
       mapaSlowa2 = wypelnijMapeSlow(mapaSlowa2, slowo2.toLowerCase());

      return mapaSlowa1.equals(mapaSlowa2);
    }

    private Map<Character, Integer> wypelnijMapeSlow(Map<Character, Integer> mapaSlowa, String slowo){
        //Iterujemy po literkach, przeszktalcajac stringa na tablice charow
        for (Character c : slowo.toCharArray()) {
            // sprawdzamy czy klcz wystepuje, jesli nie, to dodajemy go wraz z 1 wystapieniem
            if (!mapaSlowa.containsKey(c)){
                mapaSlowa.put(c, 1);
            } else {
                mapaSlowa.put(c, mapaSlowa.get(c) + 1); //jesli wystepuje to zwiekszamy ilosc o 1
            }
        }
        return mapaSlowa;
    }
}
