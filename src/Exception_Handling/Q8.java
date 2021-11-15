package Exception_Handling;

/*Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and
 that the age entered is >=18 and < 60.
 Display proper error messages.
The program must exit gracefully after displaying the error message in case the arguments passed are not proper.*/

class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
public class Q8 {
    public void age(int age) throws InvalidAgeException{
        if(age<18 | age>60){
            System.out.println("Not Allowed to vote");
        }
        else{
            System.out.println("You can vote");
        }
    }
 }
 class Main2{
     public static void main(String[] args) {
         Q8 obj = new Q8();
         String name = args[0];
         Integer age = Integer.parseInt(args[1]);
         try{
             obj.age(age);
         }
         catch (InvalidAgeException e){
             System.out.println(e);
         }
     }
 }
