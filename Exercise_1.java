
public class Exercise_1 {
    public static void main(String[] args) {
       int[][] array = { 
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 },
             { 1, 2, 3, 4, 5, 6, 7 }, 
            };
       int k, i, j;
       for (i = 0; i < 7; i++) {
          for (j = 0; j < 7; j++){
             for (k = 0; k < 7; k++){ 
                if (j+k == i) {
                   System.out.print(array[k][j] + " ");
                }
 
             }
 
          }
 
          System.out.println();
       }
    }
 }
