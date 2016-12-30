/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures.queues;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author rajsharma
 */
public class QueueUsingStack {
    public static Stack<Integer> inbox = new Stack<Integer>();
    public static Stack<Integer> outbox = new Stack<Integer>();
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i < N; i++){
            int q = sc.nextInt();
            if(q == 1){
                int value = sc.nextInt();
                enqueue(value);
            }
            if(q == 2){
                dequeue();
            }
            if(q == 3){
                System.out.println(peek());
            }
        }
    }
    
    public static void enqueue(int item){
        inbox.push(item);
    }
    
    public static int dequeue(){
        if(outbox.empty()){
            while(!inbox.empty()){
                outbox.push(inbox.pop());
            }
            return outbox.pop();
        }
        return outbox.pop();
    }
    
    public static int peek(){
        if(outbox.empty()){
            while(!inbox.empty()){
                outbox.push(inbox.pop());
            }
            return outbox.pop();
        }
        return outbox.pop();
    }
}
