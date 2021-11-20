package MultiThreading;

/*Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names.*/

public class Q10 implements Runnable{
    @Override
    public void run(){

    }

    public static void main(String[] args) {
        Q10 obj = new Q10();
        Thread obj2 = new Thread(obj,"Scooby"); //Assigning name to the first thread
        Thread obj3 = new Thread(obj,"Shaggy");
        System.out.println("Name of first thread is "+ obj2.getName());
        System.out.println("Name of secon thread is "+ obj3.getName());
    }
}
