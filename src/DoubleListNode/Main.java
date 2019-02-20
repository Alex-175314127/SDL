/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNode;

/**
 *
 * @author basisc27la
 */
public class Main {
    public static void main(String[] args) {
        LinkedList x = new LinkedList();             
        int key =20;          
        x.addFirst(4);
        x.addLast(36);
        x.addLast(20);
        x.addFirst(56);
        x.addLast(9);        
//        x.removeFirst();
//        x.removeLast();    
//        x.removeMid(56);    
        System.out.println(" "+x.toString());
        System.out.println("banyak data : "+x.getSize());       
        if (x.Search(key) != -1) {
            System.out.println("data ada");
        }else{
            System.out.println("data tidak ada");
        }
    }
}
