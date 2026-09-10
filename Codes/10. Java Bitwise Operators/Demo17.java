// Bitwise NOT operator in Java
// Code by Studyopedia

class Demo17 {
    public static void main(String[] args) {
        int a = 6; // 110
        int res = ~a;

        // The binary corresponds to -7 in decimal (two's compliment representation)
        // Bitwise NOT flips all the bits, then interprets as signed 32-bit integer
        System.out.println(res);
    }
}
