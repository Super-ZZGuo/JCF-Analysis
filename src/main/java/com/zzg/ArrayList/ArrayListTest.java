package com.zzg.ArrayList;/*
@date 2021/11/18 - 4:04 下午
*/


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zzg
 */
public class ArrayListTest {
    public static void main(String[] args) {

    }

    @Test
    public void ArrayListTest2(){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < 1000005; i++){
            arr.add(i);
        }
        System.out.println("获取的结果是" + arr.get(1000000));
    }

    @Test
    public void ArrayLIstTest3(){

        ArrayList<Object> list1 = new ArrayList<Object>();
        final int N1 = 20000000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N1; i++) {
            list1.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用ensureCapacity方法前："+(endTime - startTime));


        ArrayList<Object> list2 = new ArrayList<Object>();
        final int N2 = 20000000;
        list2 = new ArrayList<Object>();
        long startTime1 = System.currentTimeMillis();
        list2.ensureCapacity(N2);
        for (int i = 0; i < N2; i++) {
            list2.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));
    }
}
