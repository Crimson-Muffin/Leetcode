import java.util.*;

public class StringtoInteger_8 {
    private boolean isDigit(char ch) {
    return ch >= '0' && ch <= '9';
  }
    public int myAtoi(String str){
        final int len = str.length();

        if(len == 0){return 0;}

        int index = 0;

        // skipping whitespaces
        while(index < len && str.charAt(index)==' '){
            ++index;
        }

        boolean isNegative = false;

        // checking sign
        if(index < len && (str.charAt(index)=='+' || str.charAt(index)=='-')){
            isNegative = str.charAt(index)=='-' ? true : false;
            ++index;
        }

        int result = 0;

        while(index < len && isDigit(str.charAt(index))){
            /* str.charAt(index) - '0' is to convert the char digit into int digit eg: '5' - '0' --> 5
            or else it will store the ASCII value of 5 i.e. 53,
            so we do 53(ASCII of 5) - 48(ASCII of 0(zero)) to get 5 as int*/
            int digit = str.charAt(index) - '0';

            // checking for overflow
            if (result > (Integer.MAX_VALUE / 10) || (result == (Integer.MAX_VALUE / 10) && digit > 7)){
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = (result * 10) + digit;
            ++index;
        }
        return isNegative ? -result : result;
    }
}
