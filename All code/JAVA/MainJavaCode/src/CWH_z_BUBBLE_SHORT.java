

public class CWH_z_BUBBLE_SHORT {
//    public static void main(String[] args) {
//        BUBBLE SHORT( ye hamra N-1 times chalta hai or sabse bada no. last me chala jata adjacent no. compare ho hoke  or ye process continue hota rhta hai)
//        int [] arr= {7,8,1,3,2};
//        int n=5;
//        for (int i=0;i<n-1;i++){
//            for(int j = 0;j<n-i-1;j++){   //ye n-i-1 ishliye kiya kyuki let i =1 to wo 3 value tak hi compare krega baki to nhi kyuki wo to phel hi set krr di naa
//                if (arr[j]>arr[j+1]){
//                    //swap
//                    int num=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=num;
//                }
//            }
//
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i] );
//            System.out.print(" ");
//        }

//        ******************************************************
 //                                          SELECTION SHORT

//        for (int i=0;i<n-1;i++){
//            int small = i;
//            for (int j=i+1;j<n;j++){
////                if(arr[i])
//            }
//        }




        public static boolean isSafe(char[][] board, int row, int col, int number) {
            //column
            for(int i=0; i<board.length; i++) {
                if(board[i][col] == (char)(number+'0')) {
                    return false;
                }
            }

            //row
            for(int j=0; j<board.length; j++) {
                if(board[row][j] == (char)(number+'0')) {
                    return false;
                }
            }

            //grid
            int sr = 3 * (row/3);
            int sc = 3 * (col/3);

            for(int i=sr; i<sr+3; i++) {
                for(int j=sc; j<sc+3; j++) {
                    if(board[i][j] == (char)(number+'0')) {
                        return false;
                    }
                }
            }

            return true;
        }

        public static boolean helper(char[][] board, int row, int col) {
            if(row == board.length) {
                return true;
            }

            int nrow = 0;
            int ncol = 0;

            if(col == board.length-1) {
                nrow = row + 1;
                ncol = 0;
            } else {
                nrow = row;
                ncol = col + 1;
            }

            if(board[row][col] != '.') {
                if(helper(board, nrow, ncol)) {
                    return true;
                }
            } else {

                //fill the place
                for(int i=1; i<=9; i++) {
                    if(isSafe(board, row, col, i)) {
                        board[row][col] = (char)(i+'0');
                        if(helper(board, nrow, ncol))
                            return true;
                        else
                            board[row][col] = '.';
                    }
                }
            }

            return false;
        }

        public static void main(String[] args) {

            char[][] board = new char[9][9];
            helper(board, 0, 0);


        }
}
