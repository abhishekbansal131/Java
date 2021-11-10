package Wrapper_Classes;

/*Accept a integer number as Command line argument from the program and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.

        Sample Output:

        java  Test 20
        Given Number :20
        Binary equivalent :10100
        Octal equivalent :24
        Hexadecimal equivalent :14*/

public class Q2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        System.out.println("Given Number :"+a);
        System.out.println("Binary Equivalent :"+Integer.toBinaryString(a));
        System.out.println("Octal Equivalent :"+Integer.toOctalString(a));
        System.out.println("Hexadecimal Equivalent :"+Integer.toHexString(a));
    }
}
