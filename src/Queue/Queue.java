/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisc27
 */
public class Queue {
    private int front,rear,size;
    private int[] data;

    public Queue(int xData) {
        this.front=0;
        this.rear =0;
        this.size=0;
        this.data = new int [xData];
    }
    
    public void enqueue(int input){
        if(!isFull()){
            data[rear] = input;
            rear++;
            size++;
        }else{
            System.out.println("Queue is Full");
        }     
    }
    public int dequeue(){
        if (!isEmpty()) {
            front++;
            size--;
        }
        return 0;
    }

    public int getSize() {
        return size;
    }
    
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
        }
    
    public boolean isFull(){
        if(rear == data.length){
            return true;
        }
    return false;
}
    
    @Override
    public String toString(){
        String show =" ";
        for (int i = front; i < rear; i++) {
           show += data[i]+ " ";
        }
        return show;   
    }
}
