package com.lv2.Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    private ArrayList<Float> resultList = new ArrayList<>();
    private float result;

    float execute(int input1, int input2, char operator) {

        switch (operator) {
            case '+':
                result = input1 + input2;
                resultList.add(result);
                return result;

            case '-':
                result = input1 - input2;
                resultList.add(result);
                return result;

            case '*':
                result = input1 * input2;
                resultList.add(result);
                return result;

            case '/':
                if (input2 == 0) {
                    System.out.println("분모에 0이 올 수 없습니다.");
                    return Float.NaN;
                }
                result = input1 / input2;
                resultList.add(result);
                return result;

            default:
                System.out.println("사칙 연산 기호중 하나 입력.");
                return Float.NaN;
        }
    }

    void deleteListData() {
        resultList.remove(0);
    }
}
