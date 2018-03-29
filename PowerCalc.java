public class PowerCalc {

    public static void main(String[] args) {

        System.out.println(calc_pow(2,3));
        System.out.println(calc_pow(3,4));
    }

    public static int calc_pow(int a, int b){
        int res = 1;
        while (b > 0){
            if (b % 2 == 1)
                res *= a;
            b /= 2 ;
            a *= a;
        }
        return res;
    }
}
