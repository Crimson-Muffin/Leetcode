class AverageWaitingTime1701{
    public static void main(String args[]){
        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
        double wait = 0, curr = 0;
        for(int[] a: A){
            curr = Math.max(curr, 1.0*a[0]) + a[1];
            wait += curr -a[0];
        }
        double avg = 1.0*wait/A.length;
    }
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double sum = customers[0][1];
        int last = customers[0][0] + customers[0][1];
        for(int i=1;i<n;i++)
        {
            if(last <= customers[i][0])
            {
                last = customers[i][0] + customers[i][1];
                sum+=  customers[i][1];
            }
            else
            {
                last = last + customers[i][1];
                sum += last - customers[i][0];
            }
        }

        return (sum / n);
        
    }
}