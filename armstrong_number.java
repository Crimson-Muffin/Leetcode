class armstrong_number{
    static boolean armstrongNumber(int n){
        int og_no = n;
        int count = 0;
        int temp = n;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum += Math.pow(digit,count);
            n/=10;
        }
        return (sum==og_no);
    }
    public static void main(String args[])
{
    int n1 = 152;
    if (armstrongNumber(n1))
    {
        System.out.println("Yes, it is an Armstrong Number\n");
    }
    else
    {
        System.out.println("No, it is not an Armstrong Number\n");
    }
    
}
}