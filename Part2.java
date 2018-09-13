import java.math.BigDecimal;
import java.math.RoundingMode;

public class Part2 {
    public static void main(String[] args) {
        final double term1 = 1;
        final double pi = 3.14159265;
        double multiplier = 4;
        double base = 3;
        double result = 0;
        double finalResult;
        double truncatedResult = 0;
        int count = 0;
        while (truncatedResult != pi) {
            if (count==0) {
                result = term1;
            }
            // when count is odd, subtract the next term
            else if (count % 2 == 1) {
                double nextTerm = term1/(base);
                result -= nextTerm;
                base += 2;
            }
            // when count is even, add the next term
            else {
                double nextTerm = term1/(base);
                result += nextTerm;
                base += 2;
            }
            count++;
            finalResult = multiplier * result; //multiply by 4 to get pi
            truncatedResult = BigDecimal.valueOf(finalResult).setScale(8, RoundingMode.HALF_UP).doubleValue();

        }
        System.out.println("The number of terms needed is " + count + ".");
    }
}
