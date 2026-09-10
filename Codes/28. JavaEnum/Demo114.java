// Create a custom function in Enum
// Code by Studyopedia

class Demo114 {
    enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST;

        void display() {
            System.out.println("Name = " + this.name() + ", Ordinal = " + this.ordinal());
        }
    }

    public static void main(String[] args) {

        Directions d1, d2, d3, d4;

        // Assign the value to Enum variables
        d1 = Directions.NORTH;
        d2 = Directions.SOUTH;
        d3 = Directions.EAST;
        d4 = Directions.WEST;

        // Use display()
        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}
