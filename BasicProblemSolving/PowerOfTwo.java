package BasicProblemSolving;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(is_power_of_two(4));
        System.out.println(is_power_of_two(5));
        System.out.println(is_power_of_two(16));

    }

    public static boolean is_power_of_two(int n){
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
}
