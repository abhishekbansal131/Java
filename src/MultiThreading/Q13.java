package MultiThreading;

/*Create three threads- with different priorities – MAX, MIN, NORM- and start the threads at the same time. Observe the
completion of the threads. (Thread priorities concept)*/


public class Q13{
    public static void main(String[] args) {

        //Here I have used the concept of Anonymous class.

        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Thread t1");
            }
        };
        t1.setPriority(1);  //Setting priority as Min
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("Thread t2");
            }
        };
        t2.setPriority(5);  // Setting priority as Norm
        Thread t3 = new Thread(){
            public void run(){
                System.out.println("Thread t3");
            }
        };
        t3.setPriority(10);  //Setting priority as Max

        t1.start();
        t2.start();
        t3.start();
    }
}
