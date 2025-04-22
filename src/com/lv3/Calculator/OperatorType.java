package com.lv3.Calculator;

public enum OperatorType {

    PLUS("+"){
        @Override
        public int calculate(int input1, int input2){
            return input2+input1;
        }
    },
    MINUS("-"){
        @Override
        public int calculate(int input1, int input2) {
            return input1-input2;
        }
    },
    MULTIPLE("*"){
        @Override
        public int calculate(int input1, int input2) {
            return input1*input2;
        }
    },
    DIVIDE("/"){
        @Override
        public int calculate(int input1, int input2) {
            if (input2 == 0)
                    throw new ArithmeticException();
            return input1/input2;
        }
    };

    private final String operator;

    OperatorType (String operator){
        this.operator = operator;
    }

    String getOperator() {
        return this.operator;
    }

    public abstract int calculate(int input1, int input2);

}
