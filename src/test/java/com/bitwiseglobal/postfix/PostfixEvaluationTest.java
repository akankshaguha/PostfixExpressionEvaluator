package com.bitwiseglobal.postfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by balajeev on 2/22/2016.
 */
public class PostfixEvaluationTest {

    @Test

    public void itshouldEvaluateTheValidPostfixExpression()
    {



        PostfixEvaluator evaluator=new PostfixEvaluator();


        assertEquals(9, evaluator.calculate("17 10 + 3 * 9 /"));
    }



}
