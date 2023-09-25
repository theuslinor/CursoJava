package com.theuslino.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    BigDecimal principal;
    BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int numberOfYear) {
        //Total Value = principal + principal * interest * numberOfYear
        BigDecimal numberOfYearBigDecimal = new BigDecimal(numberOfYear);

        return principal.add(principal.multiply(interest).multiply(BigDecimal.valueOf(numberOfYear)));
    }
}
