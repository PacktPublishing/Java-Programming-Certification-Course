// Two-Dimensional (2D) Array in Java
// Example 2 with 3x3 matrix
// Code by Studyopedia

class Demo48 {
    public static void main(String[] args) {

        int i, j, k = 0;
        int[][] result = new int[3][3];

        for(i=0; i < 3; i++) {
            for(j=0; j < 3; j++) {
                result[i][j] = k;  // result[0][0] = 0, result[0][1] = 1
                k++;
            }
        }

        for(i=0; i < 3; i++) {
            for(j=0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
