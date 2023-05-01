package com.bridgelabz.Queue;

import java.util.LinkedList;

public class Queue <T>{

        LinkedList<T> linkedList;

        public Queue() {
            this.linkedList = new LinkedList<>();
        }

        public void enqueu(T key) {
            linkedList.add(key);
        }
        public void print() {
            //linkedList.print();
        }

    }
