/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNode;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author basisc27la
 */
public class LinkedList {
  private ListNode head;
  private int size;

    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
    }

    public int getSize() {
        return size;
    }
 
    public boolean isEmpty(){
        if (head.getNext() != null && head.getPrev() != null) {
            return false;
        }else{
            return true;
        }
    }
    public ListNode addBefore(int e,ListNode bantu){
        ListNode baru = new ListNode(e);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size ++;
        return baru;
    }
    public void addFirst(int f){
        addBefore(f, head.getNext());
    }
    public void addLast(int l){
        addBefore(l, head);
    }
    @Override
    public String toString(){
        String isi = " ";
        ListNode str = head.getNext();
        while(str != head){
            isi += str.getData() + " ";
            str = str.getNext();
        }
        return isi;
    }
    public int Search(int key){
        ListNode x = head.getNext(); 
       int  index = 0;
        while (x != head) {
            if (key == x.getData()) {
                return 0;
            }else{
                x = x.getNext();
                index++;            
            }
        }return -1;
    }
    public ListNode remove(ListNode i){
        ListNode del = i;
        del.getPrev().setNext(del.getNext());
        del.getNext().setPrev(del.getPrev());
        size--;
        return del;
    }
    
    public ListNode removeFirst(){
        return remove(head.getNext());
    }
    
    public ListNode removeLast(){
        return remove(head.getPrev());
    }
    
//    public ListNode removeMid(int key){
//        ListNode n = head.getNext();
//        while (n != head) {
//            if (n.getData() == key) {
//                return remove(n);
//            }
//            n = n.getNext();
//        }
//        return null;
//    }
    
    public ListNode removeMid(int key){
        ListNode del = head.getNext();
        int mid = size/2;
        for (int i = 0; i < mid; i++) {
            del = del.getNext();
        }
        return remove(del);
    }
}
