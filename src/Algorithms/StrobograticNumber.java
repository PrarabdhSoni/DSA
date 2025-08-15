package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class StrobograticNumber {

    public static void main(String[] args) {
        System.out.println(strobo("101"));
        System.out.println(strobo("69"));
        System.out.println(strobo("88"));
        System.out.println(strobo("123"));
    }

    public static boolean strobo(String num){
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6','9');
        map.put('9','6');
        map.put('1', '1');
        map.put('0', '0');
        map.put('8', '8');

        int l=0, r = num.length() -1;

        while (l<= r){
            if(!map.containsKey(num.charAt(l))) return false;
            if(map.get(num.charAt(l)) != num.charAt(r)) return false;
            r--;
            l++;
        }
        return true;
    }
}
