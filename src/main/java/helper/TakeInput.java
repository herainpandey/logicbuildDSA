package helper;

import java.util.Scanner;

public class TakeInput {
     Scanner scn = new Scanner(System.in);

    public int scanInteger(){
        return scn.nextInt();
    }

    public  String scanString(){
        return scn.next();
    }
}
