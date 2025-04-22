package com.lv3.Calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArithmeticCalculator {

    int input1;
    int input2;
    int result;
    char operator;
    ArrayList<Integer> list = new ArrayList();

    public ArithmeticCalculator(){};

    public ArithmeticCalculator(int input1, int input2, char operator) {
        this.input1 = input1;
        this.input2 = input2;
        this.operator = operator;
    }

    public int execute() {

        switch (operator) {
            case '+':
                result = OperatorType.PLUS.calculate(input1, input2);
                list.add(result);
                return result;

            case '-':
                result = OperatorType.MINUS.calculate(input1, input2);
                list.add(result);
                return result;

            case '*':
                result =OperatorType.MULTIPLE.calculate(input1, input2);
                list.add(result);
                return result;

            case '/':
                result =OperatorType.DIVIDE.calculate(input1, input2);
                list.add(result);
                return result;

            default:
                throw new IllegalArgumentException();

        }
    }

    public void search(int input){
        List<Integer> tempList = list.stream().filter(num -> input < num ).collect(Collectors.toList());
        System.out.println("List : " + tempList);
    }

}



