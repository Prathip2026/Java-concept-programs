package org.text;

public class Multi {

    public static void main(String[] args) {

        int fun[][] = new int[4][4];
        fun[0][0]=  100;
        fun[0][1] = 100;
        fun[0][2] = 200;
        fun[0][3] = 300;
        fun[1][0]=  700;
        fun[1][1] = 400;
        fun[1][2] = 500;
        fun[1][3] = 600;
        fun[2][0]= 500;
        fun[2][1] = 700;
        fun[2][2] = 800;
        fun[2][3] = 900;
        fun[3][1] = 700;
        fun[3][2] = 800;
        fun[3][3] = 900;
//
//        for ( int i= fun.length-1;  i >=0;  i--) {
//            for ( int j = fun.length-1; j >=0; j--) {
//                System.out.println(fun[i][j]);
//            }
//        }

        for (int i=0; i<fun.length; i++){
            for (int j=0; j< fun.length; j++){
                System.out.print(fun[i][j]+"   ");
            }
            System.out.println();
        }

        System.out.println("______________________________");

        for (int i=fun.length-1; i>=0; i--){
            for (int j=fun.length-1; j>=0; j--){
                System.out.print(fun[i][j]+"   ");
            }
            System.out.println();
        }

    }
}