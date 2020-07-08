package com.teste;

import org.junit.Test;

import java.util.ArrayList;

public class ExceptionTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void empty(){
        new ArrayList<Object>().get(234);
    }
}
