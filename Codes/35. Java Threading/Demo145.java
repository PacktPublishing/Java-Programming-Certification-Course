// Create a Thread by extending the Thread class
// Code by Studyopedia

class Demo145 extends Thread {

    public void run() {
        System.out.println("The thread is running");
    }

    public static void main(String[] args) {
        
        // Creating a new thread object
        Demo145 t = new Demo145();
        t.start(); // start the thread
    }
}