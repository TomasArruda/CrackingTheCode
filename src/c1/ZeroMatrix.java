package c1;

import java.util.ArrayList;

public class ZeroMatrix {

    public static int[][] zeroMatrix(int[][] matrix){
        ArrayList<int[]> zerosCoordinates = new ArrayList<>();

        for(int i = 0 ; i < matrix.length; i++) {
            for(int e = 0 ; e < matrix[0].length; e++) {
                if(matrix[i][e] == 0) {
                    int[] coordinates = {i,e};
                    zerosCoordinates.add(coordinates);
                }
            }
        }


        for(int i = 0 ; i < zerosCoordinates.size(); i++) {
            int[] coordinates = zerosCoordinates.get(i);
            for(int w = 0 ; w < matrix[0].length; w++) {
                matrix[coordinates[0]][w] = 0;
            }

            for(int l = 0 ; l < matrix.length; l++) {
                matrix[l][coordinates[1]] = 0;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for(int i = 0 ; i < matrix.length; i++) {
            for(int e = 0 ; e < matrix[0].length; e++) {
                System.out.print(matrix[i][e]);
            }
            System.out.print('\n');
        }
    }

    public static void main(String args[]){
        int[][] matrix = { {1,2,3,4}, {1,2,3,4}, {1,0,3,4}, {4,3,2,3}, {4,3,2,0} };

        printMatrix(matrix);
        System.out.print('\n');
        printMatrix(zeroMatrix(matrix));
    }
}
