public class CWH_0_ADVANCED {
//    FINDING THE PRAP BETWEEN THE BLOCKS
    static int trapwater(int height[]){
        // if the blocks are two and less than 2
        int n=height.length;
        if(n<=2){
            System.out.println("No,water is trapped");
        }
//        calculate the left max boundaries
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n ;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
//        calculate the right max boundaries
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
//        CALCULATING THE TRAPPED WATER
        int trapWater=0;
        for(int i=0;i<n;i++){
            int waterlevel= Math.min(leftMax[i],rightMax[i] );

            trapWater+=waterlevel-height[i];
        }
        return trapWater;
    }

//BUY AND SELL THE STOCKS

static int stocks(int stock[]){
        int max= 0;
        int buyStocks = Integer.MAX_VALUE;
        for(int i=0;i<stock.length;i++){
            if(buyStocks<stock[i]){
                int p=stock[i]-buyStocks;
                max=Math.max(p,max);
            }
            else{
                buyStocks=stock[i];
            }
        }
        return max;

}

//PRINT SPIRAL MATRIX
    static void spiral(int arr[][]){
        int startRow=0;
        int startColumn=0;
        int endRow=arr.length-1;
        int endColumn=arr[0].length-1;

        while(startRow<=endRow && startColumn<=endColumn){

//            TOP
            for(int j=startColumn;j<=endColumn;j++){
                System.out.print(arr[startRow][j]+" ");
            }

//            RIGHT
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endColumn]+" ");
            }

//            BOTTOM
            for(int j=endColumn-1;j>=startColumn;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }

//              LEFT
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(arr[i][startColumn]+" ");
            }
            startColumn++;
            startRow++;
            endColumn--;
            endRow--;

        }
        System.out.println();

    }

//    SUM OF THE DIALGONAL IN MATRIX
    static int sumDiagonal(int arr[][]){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<= arr[0].length-1;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                else if (i+j== arr.length-1) {
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

//    SEARCHING OF AN ELEMENT BY STAIR CASE SEARCH
    static int staircase(int ar[][],int key){
        int row=0,col=ar[0].length-1;
        while(row< ar.length && col>=0){
            if(ar[row][col]==key){
                System.out.println("key found at"+row+" "+col);//ye matrix ke first row ki last value se hi start krr rhe haii
                return ar[row][col];
            } else if (key<ar[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        return -1;
    }

//    OPTIMIZE SOLUTION OF POWER FUNCTION
    static  int optimizePower(int a,int n){
        int halfPowersq;
        if(n==0){
            return 1;
        }

  halfPowersq= optimizePower(a,n/2)*optimizePower(a,n/2);


        if(n%2!=0){
            halfPowersq=a*halfPowersq;
        }
        return halfPowersq;
    }

//    TAILING PROBLEM(means2xn board find the ways to put 2x1 tiles in that board)
    static int TailingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
//        for execution
        //for vertical
        int fn1=TailingProblem(n-1);

//        for horizontal;
        int fn2=TailingProblem(n-2);
        int totalways=fn1+fn2;
        return totalways;
    }

//    REMOVE THE DUPLICATE CHARACTER IN STRING
    static void removeString(String s,int idx,StringBuilder newS,boolean map[]){
        if(idx==s.length()){
            System.out.println(newS);
            return;
        }
        char currChar=s.charAt(idx);
        if(map[currChar-'a']==true){
            removeString(s,idx+1,newS,map);
        }
        else {
             map[currChar-'a']=true;
            removeString(s,idx+1,newS.append((currChar)),map);

        }
    }


    public static void main(String[] args) {
//WATER TRAP
int height[]={4,2,6};
        System.out.println(trapwater(height));
        System.out.println(Integer.MAX_VALUE  );

//        BUY AND SELL STOCKS
        int s[]={7,1,5,3,6,4};
        System.out.println(stocks(s));

//        SPIRAL

        int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(ar);

//        SUMDIAGONAL
        System.out.println(sumDiagonal(ar));

//        STAIR CASE SEARCH
        System.out.println(staircase(ar,11));

//        optimize solution
        System.out.println(optimizePower(2,10));

//        tailing problem
        System.out.println(TailingProblem(4));

//        DUPLICATE
        removeString("ruchiiii",0,new StringBuilder(""),new boolean[26]);
    }
}


