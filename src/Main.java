import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(isIsomorpheString());

    }

    public static boolean isIsomorpheString() {
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
}
