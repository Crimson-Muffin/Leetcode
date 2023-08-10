public class Tic_Tac_Toe_Game {
    // public static void tictactoe(int[][] moves) {
    //     int max_moves = 9;
    //     // for(int i = 0; i < moves.length; i++){
    //     //     if(i%2 == 0){
    //     //         System.out.println(moves[0]);
    //     //     }
    //     // }
    //     System.out.println(moves[0]);
    // }

    public static void main(String[] args) {
        int[][] A ={{0,0},{2,0},{1,1},{2,1},{2,2}};
        char[][] grid = new char[3][3];

        for(int i=0; i<A.length; i++){
            if(i%2 == 0){
                grid[A[i][0]][A[i][1]] = 'X';
            }
            else{
                grid[A[i][0]][A[i][1]] = 'O';
            }
        }
    }
}
