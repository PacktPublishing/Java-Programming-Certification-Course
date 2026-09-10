// Create a Thread by implementing the Runnable interface
// Code by Studyopedia

// Runnable is an interface that represents a task to be executed by a thread
// It defines an abstract method run() that contains the code which runs concurrently

// Runnable is preferred over extending Thread because it allows a class to extend another class
// while concurrently running the task
class Demo146 implements Runnable {

    public void run() {
        System.out.println("The thread is running");
    }

    public static void main(String[] args) {
        Demo146 d = new Demo146();
        Thread t = new Thread(d);

        t.start();
    }
}