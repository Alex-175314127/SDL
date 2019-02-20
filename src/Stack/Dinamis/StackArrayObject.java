/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.Dinamis;

import DoubleListNodeObject.ListNodeOBJ;
import Stack.*;

/**
 *
 * @author basisc27ma
 */
public class StackArrayObject {
    private ListNodeOB head;
    private int front,size;
    private int[] data;
    
    public StackArrayObject(int sum){
       head = new ListNodeOB();
       head.setNext(head);
       head.setPrev(head);
    }

     public ListNodeOB addBefore(Mahasiswa e,ListNodeOB bantu){
        ListNodeOB baru = new ListNodeOB(e);
        baru.setNext(bantu);
        baru.setPrev(bantu.getPrev());
        bantu.setPrev(baru);
        baru.getPrev().setNext(baru);
        size ++;
        return baru;
    }
    
    public void Push(Mahasiswa f){
        addBefore(f ,head.getNext());
    }
     public ListNodeOB remove(ListNodeOB i){
        ListNodeOB del = i;
        del.getPrev().setNext(del.getNext());
        del.getNext().setPrev(del.getPrev());
        size--;
        return del;
    }
    public ListNodeOB pop(){     
        return remove(head.getPrev());
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
        String isi = " ";
        ListNodeOB str = head.getNext();
        while(str != head){
            isi += str.getData().getNama() + " "+str.getData().getNim()+"\n";
            str = str.getNext();
        }
        return isi;
    }
    
}
