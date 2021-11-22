package MultiThreading;

/*Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6.
( Thread Control Mechanism concept)
 */

public class Q12 implements Runnable {
    public void run(){
        for(int i=1; i<=10; i++){
            if(i==6){
                try {
                Thread.sleep(5000);}
                catch (InterruptedException e){

                }
            }
            else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread obj2 = new Thread(new Q12());
        obj2.start();
    }
}
