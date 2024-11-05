package lv.rvt;

import java.util.*;
public class App 
{
    public static void main( String[] args ) {

        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

    }

} 