package BasicProblemSolving;

import java.util.HashMap;
import java.util.Map;

public class ExcelColumnTitle {
    public static void main(String... args) {
        System.out.println(excel_col(943566));
    }

    public static String excel_col(int a){
        int r = 0;
        Map<Integer, Character> map = new HashMap<>();
        int _a_ascii = 65;
        for (int i = 1; i <= 26; i++){
            map.put(i, (char)_a_ascii);
            _a_ascii++;
        }
        String ret = "" ;

        while (a > 0){
            if (a % 26 == 0){
                r = 26;
                a -= 26;
            }else
                r = a % 26;
            a /= 26;
            ret += map.get(r);
        }
        return new StringBuilder((ret)).reverse().toString();
    }
}
