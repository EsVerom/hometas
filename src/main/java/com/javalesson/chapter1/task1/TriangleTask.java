package com.javalesson.chapter1.task1;

import java.util.Scanner;

/**
 *  Напишите программу которая принимает 3 числовых значения и проверяет, могут ли они быть
 *  сторонами треугольника.
 *  Для ввода значений с консоли Вам понадобится класс Scanner.
 *  <code>Scanner scanner = new Scanner(System.in);</code>
 *  <code>scanner.nextInt();</code>
 */
public class TriangleTask {

    public static void main(String[] args) {
        System.out.println("Please enter three sides of a triangle");
        Scanner in = new Scanner(System.in);
// Enter sides
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        //Check the biggest side

        int biggest = 0;
        int sum = 0 ;
        if (a > b) {
            biggest = a;
            sum = c + b;
        }
        else if (b>c){
            biggest = b;
            sum = c + a;
        }
        else if (c > a) {
            biggest = c;
            sum = a + b;
        }
//        System.out.println("The longest side is " + biggest);

        //Check that summ of other sides less than biggest side

        if (a < 1 || b < 1 || c < 1){
            System.out.println("Side cannot be less 1");
        }
        else if (sum > biggest) {
            System.out.println("Congratulations! You can make a triangle with " + a + " " + b + " " + c);
        }
        else {
            System.out.println("Sorry, but one side is so big that you can't make a triangle");
        }
    }
}
