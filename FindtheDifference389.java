class FindtheDifference389{
    public char findTheDifference(String s, String t) {
        long sum1=0,sum2=0;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        for(char i:arr1){
            sum1+=(long)i;
        }
        for(char i:arr2){
            sum2+=(long)i;
        }
        return (char)(sum2-sum1);
    }
    public char findTheDifference1(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;
    }
}