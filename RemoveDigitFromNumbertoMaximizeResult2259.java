import java.math.BigInteger;
import java.util.*;

public class RemoveDigitFromNumbertoMaximizeResult2259 {

    // Naive Method
    public String removeDigit(String num, char digit) {

        ArrayList<String> a1 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == digit) {
                sb.deleteCharAt(i);
                a1.add(sb.toString());
                sb = new StringBuilder(num);
            }
        }
        BigInteger res = BigInteger.ZERO;
        for (int i = 0; i < a1.size(); i++) {
            BigInteger no = new BigInteger(a1.get(i));
            if (no.compareTo(res) > 0) {
                res = no;
            }
        }
        return res.toString();
    }

    // Optimized Method
    public String removeDigit1(String number, char digit) {

    }

}
