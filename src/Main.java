import java.math.BigInteger;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.divide(b);
        System.out.println(c);

        BigDecimal d = new BigDecimal("1.0");
        BigDecimal h = new BigDecimal("3.2");
        BigDecimal e = d.divide(h, 7, RoundingMode.HALF_UP);
        System.out.println(e);

        BigInteger f = BigInteger.ONE;
        System.out.println(f);
    }
}