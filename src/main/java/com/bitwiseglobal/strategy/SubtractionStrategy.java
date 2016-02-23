package com.bitwiseglobal.strategy;

/**
 * Created by balajeev on 2/23/2016.
 */
public class SubtractionStrategy implements ArithmeticStrategy {
    @Override
    public int operate(int operand2,int operand1) {
        return (operand1-operand2);
    }
}
