package com.bitwiseglobal.strategy;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by balajeev on 2/23/2016.
 */
public class Context {


    static Map<String,ArithmeticStrategy> strategies =
            new HashMap<String,ArithmeticStrategy>();




    public  Context()
    {
        strategies.put("+", new AdditionStrategy() );
        strategies.put("-", new SubtractionStrategy());
        strategies.put("*", new MultiplicationStrategy());
        strategies.put("/", new DivisionStrategy());
        strategies.put("%",new ModStrategy());
        strategies.put("^", new PowerStrategy());

    }


    public int doAlgorithm(String operator, Integer operand2, Integer operand1) {

        return(strategies.get(operator).operate(operand2,operand1));
    }
}





