package com.bitwiseglobal.strategy;

/**
 * Created by balajeev on 2/23/2016.
 */
public class PowerStrategy implements ArithmeticStrategy {
    @Override
    public int operate(int operand2,int operand1) {
        return (int) Math.pow(operand1,operand2);
    }
}
