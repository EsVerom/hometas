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
        System.out.println("Please enter a five-digit number");
        int instertNum=in.nextInt();
        while ( instertNum < 10000 || instertNum > 99999){
            System.out.println("Please enter again a five-digit number");
            instertNum=in.nextInt();
        }
        System.out.println("Your number = " + instertNum);
        int lastNum = instertNum % 10;
        int firstNum = instertNum / 10000;
        System.out.println("First digit = " + firstNum + "; Last digit = " + lastNum );

        if (lastNum == firstNum) {
            int secondLastNum = (instertNum % 100) / 10;
            int secondNum = (instertNum / 1000) % 10;
            System.out.println("Second digit = " + secondNum + "; Pre Last digit = " + secondLastNum);
            if (secondNum == secondLastNum) {
                System.out.println("Congratulations, your number is palindrome!");
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
