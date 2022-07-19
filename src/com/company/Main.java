package com.company;
import java.util.Scanner;

public class Main {

     public static void main (String[] args){

         Scanner read = new Scanner(System.in);

        byte num1;
        byte num2;
        String operator;

        System.out.print("Введите пример: ");

        num1 = read.nextByte();
        operator = read.next();
        num2 = read.nextByte();

         if (num1 < 0){
             System.out.println("Введенное число " + num1 + " отрицательное");
         }
         else if  (num1 >= 11) {
             System.out.println("Введенное число " + num1 + " больше 10");
         }
         else if (num2 < 0) {
             System.out.println("Введенное число " + num2 + " отрицательное");
         }
         else if (num2 >= 11) {
             System.out.println("Введенное число " + num2 + " больше 10");
         }

        if (operator.equals("*")){
            System.out.println("= " + (num1 * num2));
        }
        if (operator.equals("/")){
            System.out.println("= " + (num1 / num2));
        }
        if (operator.equals("+")){
            System.out.println("= " + (num1 + num2));
        }
        if (operator.equals("-")){
            System.out.println("= " + (num1 - num2));

        }
    }
}
