package com.bitwiseglobal.postfix;

import com.bitwiseglobal.strategy.Context;

import java.util.Stack;

/**
 * Created by balajeev on 2/22/2016.
 */
public class PostfixEvaluator {

    int result;


    public int calculate(String expression) {

        String[] line=expression.split(" ");
        operateStack(line);
        return result;
    }


    private void operateStack(String[] line) {
        Stack<Integer> elements = new Stack<Integer>();

        for (String s : line) {

            filterString(elements, s);

        }
    }

    private void filterString(Stack<Integer> elements, String s) {
        if (s.matches("-?\\d+(.\\d+)?"))
         {
            elements.push(Integer.parseInt(s));
        }

        else

        {
            Context context=new Context();
            result = context.doAlgorithm(s, elements.pop(), elements.pop());
            elements.push(result);
        }
    }

}




