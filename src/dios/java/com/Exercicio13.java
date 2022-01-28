package dios.java.com;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, num1, num2, calc;
        System.out.print("INFORME UM NÚMERO1: ");
        num1 = scan.nextInt();
        System.out.print("INFORME UM NÚMERO2: ");
        num2 = scan.nextInt();
        calc = num1;
        for (i = 1; i < num2; i++) {
            num1 = num1*calc;
        }
        System.out.println(calc +"^" + num2+" = " + num1);
    }
}