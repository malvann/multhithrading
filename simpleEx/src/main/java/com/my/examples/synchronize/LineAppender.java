package com.my.examples.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineAppender implements Runnable {
    private static final List<String> sList = Collections.synchronizedList(new ArrayList<>());
    private final String letter;

    LineAppender(String letter) {
        this.letter = letter;
    }

    @Override
    public void run() {
        int n = 0;
        do {
            sList.add(letter);
            n++;
        } while (n < 5);
    }

    public static String getResult() {
        return sList.toString();
    }
}
