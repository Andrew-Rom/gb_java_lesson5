import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //System.out.println(isIsomorphicString());

    /*
    Взять набор строк, например, "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись"
    Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
    Строки с одинаковой длиной не должны “потеряться”.
     */

        sortByLength("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись");

    }


    public static boolean isIsomorphicString() {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();

        if (s1.length() == s2.length()) {
            Map<Character, Character> map = new HashMap<>();
            char[] s1Ar = s1.toCharArray();
            char[] s2Ar = s2.toCharArray();

            for (int i = 0; i < s1.length(); i++) {
                if (map.containsKey(s1Ar[i])) {
                    if (!map.get(s1Ar[i]).equals(s2Ar[i])) return false;
                } else {
                    map.put(s1Ar[i], s2Ar[i]);
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private static void sortByLength(String text) {
        Map<String, Integer> map = new TreeMap<>();
        int temp = 0;
        for (String str : text.split(" ")) {
            map.put(str, str.length());
            if (str.length() > temp) temp = str.length();
        }
        for (int i = temp; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == i) System.out.println(entry.getKey());
            }
        }
    }

}
