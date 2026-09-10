// Two-Dimensional (2D) Array in Java
// Example 1 with 2x3 matrix
// Code by Studyopedia

class Demo47 {
    public static void main(String[] args) {

        int i, j, k = 0;
        int[][] result = new int[2][3];

        for(i=0; i < 2; i++) {          // i = 0, j = 0, k = 0, result[0][0] = 0
            for(j=0; j < 3; j++) {      // i = 0, j = 1, k = 1, result[0][1] = 1
                result[i][j] = k;       // i = 0, j = 2, k = 2, result[0][2] = 2
                k++;
            }
        }

        for(i=0; i < 2; i++) {
            for(j=0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}