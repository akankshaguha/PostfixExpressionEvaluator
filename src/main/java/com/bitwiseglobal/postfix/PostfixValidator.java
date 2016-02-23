package com.bitwiseglobal.postfix;

/**
 * Created by balajeev on 2/22/2016.
 */
public class PostfixValidator {

    public boolean isSpacePresent(String expression ) {

        int count=0;

        for(char c: expression.toCharArray())
        {
            if(c == ' ')
            {
                count++;
            }
        }

        return(count>0);
    }

    public static boolean isProperCombination(String expression) {

        int operatorCount=0,operandCount=0;

        for(char c : expression.toCharArray())
        {
            if(Character.isDigit(c))
            {
                operandCount++;
            }

            else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ||  c=='^')
            {
                operatorCount++;
            }
        }

        return(operatorCount == operandCount-1);
    }

    public boolean isValidWithSymbols(String expression) {

        boolean validity=false;
        for(char c : expression.toCharArray())
        {
            if(Character.isDigit(c) || c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ||  c =='^' || c == ' '  )
            {
                validity=true;
            }
            else
            {
                validity=false;
                break;
            }
        }

        return validity;
    }

    public boolean isValidLength(String expression) {

        int count=0;
        for(char c : expression.toCharArray())
        {
            if(Character.isDigit(c) || c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ||  c=='^' )
            {
                count++;
            }
        }

        return (count>0);
    }

    public boolean isThresholdManaged(String expression) {

        int operatorCount=0,operandCount=0;

        for(char c : expression.toCharArray())
        {
            if(Character.isDigit(c))
            {
                operandCount++;
            }

            else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ||  c=='^')
            {
                operatorCount++;
            }
        }
        return (operatorCount >=1 && operandCount>=2);
    }

    public boolean validate(String expression) {

        boolean b1 = isSpacePresent(expression);
        boolean b2 = isThresholdManaged(expression);
        boolean b3 = isValidLength(expression);
        boolean b4 = isValidWithSymbols(expression);

        return (b1 && b2 && b3 && b4);
    }
}
