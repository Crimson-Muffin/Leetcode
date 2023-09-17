class AverageWaitingTime1701{
    public static void main(String args[]){
        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
        double wait = 0, curr = 0;
        for(int[] a: A){
            curr = Math.max(curr, 1.0*a[0]) + a[1];
            wait += curr -a[0];
        }
        return 1.0*wait/A.length;
    }
}