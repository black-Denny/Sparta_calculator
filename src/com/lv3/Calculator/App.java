package com.lv3.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1; int num2;
        ArithmeticCalculator ac = new ArithmeticCalculator();


        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요:");
                ac.input1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요:");
                ac.input2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                ac.operator = sc.next().charAt(0);

                System.out.println("결과 : " + ac.execute());

                System.out.print("조회 하시겠습니까? (Y/N) : ");
                String answer = sc.next();
                if(answer.equals("Y")) {
                    System.out.print("조회할 숫자를 입력하세요: ");
                    int num3 = sc.nextInt();
                    ac.search(num3);
                } else if(answer.equals("N")) {
                    continue;
                }


            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("사칙연산 기호를 입력하세요.");
                continue;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌수없어요.");
                continue;
            }

        }
    }
}




