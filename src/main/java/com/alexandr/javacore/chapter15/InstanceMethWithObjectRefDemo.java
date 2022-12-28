package com.alexandr.javacore.chapter15;

import static com.alexandr.javacore.constants.CustomConstants.TEST_2_ARRAY_WEEK_DAY_HIGHS_TEMP;
import static com.alexandr.javacore.constants.CustomConstants.TEST_ARRAY_WEEK_DAY_HIGHS_TEMP;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc2<T> f, T v){
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (f.func(vals[i], v)) count++;
        return count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = TEST_ARRAY_WEEK_DAY_HIGHS_TEMP;
        MyFunc2<HighTemp> sameTemp = (v1, v2) -> v1.getHighTemp() == v2.getHighTemp();
        MyFunc2<HighTemp> lessThanTemp = (v1, v2) -> v1.getHighTemp() < v2.getHighTemp();

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Days When max temp was 89: " + count);

        count = counter(weekDayHighs, sameTemp, new HighTemp(89));
        System.out.println("Days When max temp was 89: " + count);

        HighTemp[] weekDayHighs2 = TEST_2_ARRAY_WEEK_DAY_HIGHS_TEMP;

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
        System.out.println("Days When max temp was 12: " + count);

        count = counter(weekDayHighs2, sameTemp, new HighTemp(12));
        System.out.println("Days When max temp was 12: " + count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Days When max temp was 89 less: " + count);

        count = counter(weekDayHighs, lessThanTemp, new HighTemp(89));
        System.out.println("Days When max temp was 89 less: " + count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
        System.out.println("Days When max temp was 19 less: " + count);

        count = counter(weekDayHighs2, lessThanTemp, new HighTemp(19));
        System.out.println("Days When max temp was 19 less: " + count);
    }
}
