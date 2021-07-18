package ProgPractice;

import helper.*;
import org.testng.annotations.Test;

public class ArraysPractice extends TakeInput {
    Methods m1 = new Methods();

    @Test
    public void replaceZeroToFive(){
        int num = 1005; //scanInteger();
        System.out.println("Before "+num);
        int afternum = m1.convertfive(num);
        System.out.println("After "+afternum);
    }
}
