package com.strings;


import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {

    PrimeNumber primeNumber = new PrimeNumber();

    @Test
    public void isNumberPrime(){

        //given
        int num =7;

        //when
        boolean result = primeNumber.isPrime(num);

        //then
        Assert.assertTrue(result);
    }

    @Test
    public void isNotPrimeNumber(){

        //given
        int num =8;

        //when
        boolean result = primeNumber.isPrime(num);

        //then
        Assert.assertFalse(result);
    }
}
