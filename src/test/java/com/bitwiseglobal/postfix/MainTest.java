package com.bitwiseglobal.postfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by balajeev on 2/23/2016.
 */
public class MainTest {

    @Test

    public void itShouldBeAbleToEvaluateThePostfixExpression()

    {
        Main main=new Main();
      assertEquals(20,main.inputString("17 3 +"));
    }
}
