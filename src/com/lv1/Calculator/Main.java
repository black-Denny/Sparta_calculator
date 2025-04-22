package com.lv1.Calculator;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float input1;
        float input2;
        float result;
        final String exit = "exit";

        while (true) {
            System.out.print("첫 번쨰 숫자 : ");
            input1 = scanner.nextFloat();
            System.out.print("두 번쨰 숫자 : ");
            input2 = scanner.nextFloat();
            System.out.print("사칙 연산기호 : ");
            String operator = scanner.next();

            switch (operator.charAt(0)) {

                case '+':
                    result = input1 + input2;
                    System.out.println("결과값 : " + result);
                    break;

                case '-':
                    result = input1 - input2;
                    System.out.println("결과값 : " + result);
                    break;

                case '*':
                    result = input1 * input2;
                    System.out.println("결과값 : " + result);
                    break;

                case '/':
                    if (input2 == 0) {
                        System.out.println("분모에 0이 올 수 없습니다.");
                        continue;
                    }
                    result = input1 / input2;
                    System.out.println("결과값 : " + result);
                    break;

                default:
                    System.out.println("사칙 연산 기호중 하나 입력.");
                    continue;
            }

            System.out.print("종료하시겠습니까? (Exit / Continue)");
            String exitInput = scanner.next();
            if (exitInput.equals(exit)) {
                System.out.print("종료");
                return;
            }
        }
    }

}

