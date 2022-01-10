package com.my.examples.synchronize;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class Solution {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        service.submit(new LineAppender("A"));
        service.submit(new LineAppender("Z"));
        service.shutdown();
        log.info("Result builder line: {}", LineAppender.getResult());
    }
}
