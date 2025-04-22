package com.lv2.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        float result;

        final String exit = "exit";

        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요:");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요:");
                int num2 = sc.nextInt();
                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0);

                result = calculator.execute(num1, num2, operator);

                if (Float.isNaN(result))
                    continue;
                System.out.println("결과값 : " + result);

                System.out.print("종료하시겠습니까? (Exit / Continue)");
                String exitInput = sc.next();
                if (exitInput.equals(exit)) {
                    System.out.print("종료");
                    return;
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
                continue;
            }
        }

    }
}
