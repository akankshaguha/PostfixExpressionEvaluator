package com.bitwiseglobal.postfix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by balajeev on 2/22/2016.
 */
public class PostfixValidationTest {

    @Test

    public void itShouldNotAllowEmptyInputToBeProcessed()
    {
        PostfixValidator validator=new PostfixValidator();
        assertTrue(validator.isValidLength("1 2 3 + * #"));
    }



    @Test

    public void itMustCheckTheValidityOfOperatorsAndOperands()
    {
        PostfixValidator validator=new PostfixValidator();
        assertTrue(validator.isValidWithSymbols("1 2 3 + *"));
    }

    @Test

    public void itMustCheckThePresenceOfSpacesInThePostfixExpression()
    {
        PostfixValidator validator=new PostfixValidator();
        assertTrue(validator.isSpacePresent("1 2 3 + *"));
    }

    @Test

    public void itMustHaveValidNumbersOfOperatorsAndOperands()

    {
        PostfixValidator validator=new PostfixValidator();
        assertTrue(PostfixValidator.isProperCombination("1 2 3 + *"));
    }

    @Test

    public void itMustVarifyTheMinimumAllowedNumbersOfOperatorsAndOperands()
    {
        PostfixValidator validator=new PostfixValidator();
        assertTrue(validator.isThresholdManaged("1 2 3 + * #"));
    }

}
