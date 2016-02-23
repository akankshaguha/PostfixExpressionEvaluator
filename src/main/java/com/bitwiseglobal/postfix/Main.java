package com.bitwiseglobal.postfix;

/**
 * Created by balajeev on 2/23/2016.
 */
public class Main {

    int result;
    public int inputString(String expression) {

        varifyInput(expression);
        return result;
    }

    private void varifyInput(String expression) {

        PostfixValidator validator = new PostfixValidator();
        boolean valid=validator.validate(expression);
        validateInput(expression, valid);
    }

    private void validateInput(String expression, boolean valid) {
        if (valid) {
            result = evaluatePostfix(expression);

        } else {

            throw new InvalidInputException();

        }
    }


    private int evaluatePostfix(String expression) {

        PostfixEvaluator evaluater=new PostfixEvaluator();
        return(evaluater.calculate(expression));
    }

    private class InvalidInputException extends RuntimeException {
    }
}