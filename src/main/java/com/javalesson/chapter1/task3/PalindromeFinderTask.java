package com.javalesson.chapter1.task3;


import java.util.Scanner;

/**
 * Напишите программу которая  проверяет введенное с клавиатуры число и говорит
 * является ли данное число палиндромом.
 * Палиндром - это число которое читается одинаково и спереди назад и сзади наперед.
 * Примеры 12321, 45654, 787 и т.д.
 *
 * Дополнительное условие: программа принимает только числа длинной 5 знаков.
 * В случае если было введено число длинной != 5, программа должна выполнить еще
 * одно прохождение цикла и попросить снова ввести значение с клавиатуры.
 * У данной задачи есть разные варианты решения.
 * 1) С помощью конвертации чисел в строки и обратно.
 * 2) Решение с помощью щю использования остатка от деления на 10.
 *
 * Вам нужно выполнить задания двумя способами.
 */
public class PalindromeFinderTask {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a five-digit palindrome number");
        int insertNum=in.nextInt();
        while ( insertNum < 10000 || insertNum > 99999){
            System.out.println("Please enter again a five-digit palindrome number");
            insertNum=in.nextInt();
        }
        System.out.println("Your number = " + insertNum);
        int lastNum = insertNum % 10;
        int firstNum = insertNum / 10000;
        System.out.println("First digit = " + firstNum + "; Last digit = " + lastNum );

        if (lastNum == firstNum) {
            int secondLastNum = (insertNum % 100) / 10;
            int secondNum = (insertNum / 1000) % 10;
            System.out.println("Second digit = " + secondNum + "; Pre Last digit = " + secondLastNum);
            if (secondNum == secondLastNum) {
                System.out.println("Congratulations, your number" + insertNum + "is palindrome!");
            }
            else {
                System.out.println("Sorry but your number is not palindrome");
            }
        }
        else {
            System.out.println("Sorry but your number is not palindrome");
        }

    }
}
