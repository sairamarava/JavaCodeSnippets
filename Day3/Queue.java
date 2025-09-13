import java.util.*;
public class Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder()); //add revrse order in to implement greedy watchman
        PriorityQueue<Integer>regularLowestPriorQueue=new PriorityQueue<>();
        queue.offer(20); //else priority queue wth smallest ele will be remmved
        queue.offer(30);
        queue.offer(100);
        queue.offer(10);
        queue.offer(70);
        queue.offer(60);
        queue.offer(50);
        queue.offer(90);
        System.out.println(queue.size()+"queue size");
        while(!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
        LL();
        Stack();
    }
    static  void LL(){
        LinkedList<String> ll=new LinkedList<>();
        ll.offer("sairm");
        ll.offer("James");
        ll.offer("Zayn");
        while(!ll.isEmpty()) System.out.print(ll.poll()+" ");
    }
    static void Stack(){
        Stack<Character> stack=new Stack<>();
        for(char ch:"madanapalli".toCharArray()) stack.push(ch);
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        System.out.println("Stack"+stack.size());
        while(!stack.isEmpty()) System.out.print(stack.pop()+"");
    }
}
