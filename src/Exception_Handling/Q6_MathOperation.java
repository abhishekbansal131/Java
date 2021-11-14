package Exception_Handling;

/*Write a class MathOperation which takes 5 integers inputs from user. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

        Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/


import java.util.Scanner;

public class Q6_MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        try {
            for(int i=0; i<5; i++){
                arr[i]= sc.nextInt();
            }
            int sum=0;
            double av;
            for (int i=0; i<5; i++){
                sum += arr[i];
            }
            av = sum/5;
            System.out.println("Sum is "+ sum);
            System.out.println("Average is "+ av);
        }
        catch (ArithmeticException | NumberFormatException | NullPointerException | IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
