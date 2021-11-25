package MultiThreading;

public class Q14 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                for(int i=1; i<=20; i++){
                    if(i%2==1){
                        System.out.println(i);
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for(int i=1; i<=20; i++){
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
            }
        };
        try{
        t1.start();
        t1.join();
        t2.start();}
        catch (InterruptedException e){
            System.out.println(e);
        }

    }
}
