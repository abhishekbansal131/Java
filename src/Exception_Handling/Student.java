package Exception_Handling;

import java.util.Scanner;

/*A program to demonstrate custom exceptions. Create a com.myname.stuent.Student class with three private fields name,
rollNo, & CPI. Create Getter and Setter for all the fields, override the public String toString() method of Object class,
to represent Student objects as String. Create a com.myname.main.StudentMain class which is the implementation class
 contains main method and a search() method. main method will create a list of students i.e array and initialize each
 objects by taking input from user using java.util.Scanner class. This method will also call search method and print the
 result. search() method will accept two arguments first is Student[] list and int rollNo. This method will return Student
  object if rollNo matches with any of the Student object or else it will throw an user defined exception
  InvalidStudentException. com.myname.exception.InvalidStudentException is a class which extends java.lang.Exception
  class and have one parameterized constructor which accept an argument String message.
 */

 class InvalidStudentException extends Exception {
    public InvalidStudentException(String str) {
        super(str);
    }
}

public class Student {
    private String name;
    private int rollno;
    private double cpi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", rollno=" + rollno + ", cpi=" + cpi + '}';
    }
}

class StuMain {

    public Student search(Student[] arr, int rollno) throws InvalidStudentException {
        Student obj = null;
        for (Student student : arr) {
            if (student.getRollno() == rollno) {
                obj = student;
                break;
            }
        }
        if (obj == null) {
            throw new InvalidStudentException("student not found");
        }
        else
        return obj;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int size = sc.nextInt();
        sc.nextLine();
        Student arr[] = new Student[size];
        System.out.println("Enter the list of students");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.println("Enter the name of "+i+" Student");
            arr[i].setName(sc.nextLine());
            System.out.println("Enter the rollno of "+i+" Student");
            arr[i].setRollno(sc.nextInt());
            System.out.println("Enter the cpi of "+i+" Student");
            arr[i].setCpi(sc.nextDouble());
            sc.nextLine();
        }
        try {
            StuMain obj = new StuMain();
            System.out.println("Enter roll no to get student result");
            System.out.println(obj.search(arr, sc.nextInt()));
        } catch (InvalidStudentException e) {
            System.out.println(e);
        }
    }
}

