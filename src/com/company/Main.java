package com.company;
import java.util.*;

public class Main {

    public static boolean IsEven(int number)
    {
        if (number % 2 == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Enter an integer");
        num = scan.nextInt();

        if (IsEven(num))
        {
            System.out.println(num + " is even.");
        }
        else
        {
            System.out.println(num + " is odd");
        }
    }
}
