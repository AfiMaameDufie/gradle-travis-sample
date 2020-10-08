package io.turntabl;

//So basically, this is a class called Numbers and it returns a boolean value based on the arguments passed to it.

public class Numbers {
    public static boolean isGreaterThanZeroAndLessThanAThousand(int i){
        return greaterThanZero(i) && lessThanAThousand(i);
    }
           
    private static boolean greaterThanZero(int i){
        return i > 0;
    }

    private static boolean lessThanAThousand(int i){
        return i < 1000;
    }
}
