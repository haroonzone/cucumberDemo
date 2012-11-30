package com.pragmaticqa.calculator;

public class Calculator {

    Number x,y ;

    public Number add(Number x, Number y){
        return x.doubleValue() + y.doubleValue();
    }

    public Number subtract(Number x, Number y){
        return x.doubleValue() - y.doubleValue();
    }

    public Number multiply(Number x, Number y){
        return x.doubleValue() * y.doubleValue();
    }

    public Number divide(Number x, Number y){
        return x.doubleValue() / y.doubleValue();
    }
}
