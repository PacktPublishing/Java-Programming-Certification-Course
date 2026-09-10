// Create an Enum in a Class in Java, and display the ordinal values
// Code by Studyopedia

class Demo113 {

    enum Directions {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public static void main(String[] args) {
        // Enum variables
        Directions d1, d2, d3, d4;

        // Assign the value to Enum variables
        d1 = Directions.NORTH;
        d2 = Directions.SOUTH;
        d3 = Directions.EAST;
        d4 = Directions.WEST;

        // Print
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);

        // Display the enum item name with the ordinal values
        // name() returns the exact name of the enum constant as declared
        // ordinal() returns the position index
        for (Directions d : Directions.values()) {
            System.out.println("Name = " + d.name() + ", Ordinal = " + d.ordinal());
        }
    }
}
