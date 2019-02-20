/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisc27
 */
public class Main {
    public static void main(String[] args) {
        int max = 5;
        int[] antri = {1,max};
        Queue q = new Queue(4);
        q.enqueue(35);
        q.enqueue(67);
        q.enqueue(90);
        q.dequeue();
        q.enqueue(50);
        
        System.out.println(" "+q.toString());
    }
}
