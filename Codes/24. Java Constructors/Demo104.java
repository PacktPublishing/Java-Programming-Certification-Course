// Parameterized Constructor in Java
// Code by Studyopedia

class Rectangle {

    double length;
    double width;

    // Parameterized Constructor
    Rectangle(double len, double wid) {
        length = len;
        width = wid;
    }

    void display() {
        System.out.println("length: " + length + ", width: " + width);
    }
}

class Demo104 {
    public static void main(String[] args) {

        Rectangle rct1 = new Rectangle(5, 10);
        Rectangle rct2 = new Rectangle(8, 20);
        Rectangle rct3 = new Rectangle(10, 25);

        rct1.display();
        rct2.display();
        rct3.display();
    }
}
