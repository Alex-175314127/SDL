/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleListNode;

/**
 *
 * @author basisc27ma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList daftar = new LinkedList();
        daftar.addFirst(23);
        daftar.addFirst(67);
        daftar.addFirst(78);
        daftar.addLast(89);
        daftar.addLast(90);
        
        daftar.removeLast();
        System.out.println(" : "+daftar.toString());
        System.out.println("size : "+daftar.getSize());
        
////        LinkedList daftar1 = new LinkedList();
//        daftar.addLast(56);
//        daftar.addLast(51);
//        daftar.addLast(12);
//        daftar.addLast(24);
//        System.out.println(daftar.toString1());
//        System.out.println(" size : "+daftar.getSize());
    }
}
