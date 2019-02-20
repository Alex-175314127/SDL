/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNodeObject;

import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 *
 * @author basisc27la
 */
public class LinkedListOBJ {
  private ListNodeOBJ head;
  private int size;

    public LinkedListOBJ() {
        head = new ListNodeOBJ();
        head.setNext(head);
        head.setPrev(head);
    }

    public int getSize() {
        return size;
    }

    public ListNodeOBJ getHead() {
        return head;
    }

    public void setHead(ListNodeOBJ head) {
        this.head = head;
    }
 
    public boolean isEmpty(){
        if (head.getNext() != null && head.getPrev() != null) {
            return false;
        }else{
            return true;
        }
    }
    public ListNodeOBJ addBefore(Mahasiswa e,ListNodeOBJ bantu){
        ListNodeOBJ baru = new ListNodeOBJ(e);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size ++;
        return baru;
    }
    public void addFirst(Mahasiswa f){
        addBefore(f, head.getNext());
    }
    public void addLast(Mahasiswa l){
        addBefore(l, head);
    }
    @Override
    public String toString(){
        String isi = " ";
        ListNodeOBJ str = head.getNext();
        while(str != head){
            isi += str.getData().getNim() + " ";
            str = str.getNext();
        }
        return isi;
    }
    public int Search(String key){
        ListNodeOBJ x = head.getNext(); 
       int  index = 0;
        while (x != head) {
            if (key == x.getData().getNama()) {
                return 0;
            }else{
                x = x.getNext();
                index++;            
            }
        }return -1;
    }
    public ListNodeOBJ remove(ListNodeOBJ i){
        ListNodeOBJ del = i;
        del.getPrev().setNext(del.getNext());
        del.getNext().setPrev(del.getPrev());
        size--;
        return del;
    }
    
    public ListNodeOBJ removeFirst(){
        return remove(head.getNext());
    }
    
    public ListNodeOBJ removeLast(){
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
    
    public ListNodeOBJ removeMid(Mahasiswa key){
        ListNodeOBJ del = head.getNext();
        int mid = size/2;
        for (int i = 0; i < mid; i++) {
            del = del.getNext();
        }
        return remove(del);
    }
}
