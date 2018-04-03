package BasicProblemSolving;

/**
 * find decimal equivalent of 1/2n
 * e.g. --> n = 1 --> result = 0.5
 *          n = 2 --> result = 0.25
 */

public class OneByTwoNDecimal {

    public static void main(String... args) {
        System.out.println(solution(2));
        System.out.println(solution(1));
    }

    public static double solution(int n){
        int _numerator = 1 ;
        int _denominator = 2 * n;
        double _quot;
        int _remainder ;
        int _ctr = 0;
        double res = 0;

        while (_numerator < _denominator){
            _ctr -= 1;
            _numerator *= 10;
            _quot = (_numerator/_denominator) * Math.pow(10, _ctr);
            res += _quot;
            _remainder = _numerator % _denominator;
            _numerator = _remainder;
            if (_remainder == 0)
                break;
        }
        return res;
    }
}
