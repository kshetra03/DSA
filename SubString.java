public class SubString {
    public static void main(String... args) {
        System.out.println(sub_string("string", "ring"));
    }

    public static int sub_string(String s1, String s2){
        if (s1.equals(s2))
            return 0;
        if (s2.length() > s1.length())
            return -1;
        if (s1.length() == s2.length())
            if (s1.charAt(0) != s2.charAt(0))
                return -1;
        int i = 0, j = 0;
        boolean flag = false ;
        while (i < s1.length() && j < s2.length()){
            if (s1.charAt(i) == s2.charAt(j)){
                flag = true;
                i++;
                j++;
            }
            else if(flag == true){
                i = i-j+1;
                j = 0;
                flag = false;
            }
            else
                i ++;
        }
        if (i == s1.length() && j != s2.length())
            return -1;
        return i - s2.length();
    }
}
