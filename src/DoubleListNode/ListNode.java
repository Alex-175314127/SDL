/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNode;

/**
 *
 * @author basisc27la
 */
public class ListNode {
    private int data;
    private ListNode next,prev;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data =data;
        this.next = null;
        this.prev = null;
    }
    
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}
