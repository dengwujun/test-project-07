package com.donggua.test;

import java.util.Arrays;

public class File01 {

    public static void main(String[] args) {

        //char[] sc = str.toCharArray()和Arrays.sort(sc)获得有序的sc

        String str = "eat";
        char[] sc = str.toCharArray();
        Arrays.sort(sc);

        System.out.println(sc);

    }

}
