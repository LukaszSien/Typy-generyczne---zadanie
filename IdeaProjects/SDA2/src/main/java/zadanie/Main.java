package zadanie;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Napiszcie program, ktory sprawdzi czy 2 podane slowa sa anagramami
    public static void main(String[] args) {

       Anagram anagram = new Anagram();
       if(anagram.check("silent", "listen")){
           System.out.println("Jest anagramem");
       } else {
           System.out.println("Nie jest anagramem");
       }
    }
}
