// super keyword to access parent class variables
// Code by Studyopedia

class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;

    void show() {
        System.out.println("Parent num = " + super.num);
        System.out.println("Child num = " + num);
    }
}
class Demo144 {
    public static void main() {
        Child c = new Child();
        c.show();
    }
}
