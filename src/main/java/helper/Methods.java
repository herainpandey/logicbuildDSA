package helper;

public class Methods {

    public int convertfive(int num) {
        int temp = num;
        int result =0;

        int decimalPlace =1;

        if(num ==0){
            result +=(5*decimalPlace);
        }

        while(num >0){
            if(num%10==0){
                result +=(5*decimalPlace);
            }
            num /= 10;
            decimalPlace *=10;
        }
        return temp+result;
    }


}
