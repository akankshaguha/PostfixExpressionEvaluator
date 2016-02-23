package com.bitwiseglobal.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by balajeev on 2/23/2016.
 */
public class ArithmeticStrategyTest {



    @Test

    public void itShouldReturnCorrectAdditionResult()
    {
        AdditionStrategy strategy=new AdditionStrategy();
        assertEquals(7,strategy.operate(5,2));
    }

    @Test

    public void itShouldReturnCorrectSubtractionResult()
    {
        SubtractionStrategy strategy=new SubtractionStrategy();
        assertEquals(5,strategy.operate(5,10));
    }

    @Test

    public void itShouldReturnCorrectMultiplicationResult()
    {
        MultiplicationStrategy strategy=new MultiplicationStrategy();
        assertEquals(10,strategy.operate(5,2));
    }

    @Test

    public void itShouldReturnCorrectDivisionResult()
    {
        DivisionStrategy strategy=new DivisionStrategy();
        assertEquals(5,strategy.operate(6,30));
    }

    @Test

    public void itShouldReturnCorrectModulusResult()

    {
        ModStrategy strategy=new ModStrategy();
        assertEquals(6,strategy.operate(12,30));
    }

    @Test

    public void itShouldReturnCorrectPowerResult()

    {
        PowerStrategy strategy=new PowerStrategy();
        assertEquals(9,strategy.operate(2,3));
    }

    @Test


    public void itMustCallAndEvaluateUsingCorrectStrategy()

    {
        Context context=new Context();
        assertEquals(9,context.doAlgorithm("+",3,6));

    }


}
