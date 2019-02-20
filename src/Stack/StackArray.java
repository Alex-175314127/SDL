/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisc27ma
 */
public class StackArray {
    private int front,size;
    private int[] data;
    
    public StackArray(int sum){
        this.data = new int[sum];
        this.size = 0;
        this.front = -1;
    }

    public boolean push(int input){
        if (data.length != size) {
            
            size ++;
            front++;
            data[front] = input;
        }      
        return false;
    }
    
    public void pop(){
        if (isEmpty() != true) {
            data[data.length - 1] = 0;
             front --;
             size--;
        }        
    }
    
    public boolean isEmpty(){
        if (front == -1) {
            return true;
        }
        return false;
    }
    
    public boolean isFull(){
        if (size == data.length) {
            return true;
        }
        return false;
    }
    public int getSize() {
        return size;
    }  
    
    @Override
    public String toString(){
        String str = " ";
        for (int i = front; i >= 0; i--) {
            str += data[i] + " ";
        }
        return str;
    }
}
