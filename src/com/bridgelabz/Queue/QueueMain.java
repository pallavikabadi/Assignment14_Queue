package com.bridgelabz.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.print();
        System.out.println();
        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.dequeue();
            queue.print();
            System.out.println();
        }
    }
}
