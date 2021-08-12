import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
            BigInteger a = new BigInteger("1");
            if (n <= 1) {
                return BigInteger.ONE;
            } else if (n == 2){
                return BigInteger.TWO;
            } else {
                for (int i = n; i >= 2; i -= 2) {
                    a = a.multiply(BigInteger.valueOf(i));
                }
                return a;
            }

    }
}

