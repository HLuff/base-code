package com.example.生产者消费者;

public interface AbstractStorage {
    void consume(int num);
    void produce(int num);
}