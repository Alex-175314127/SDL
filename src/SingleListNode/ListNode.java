/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleListNode;

/**
 *
 * @author basisc27ma
 */
public class ListNode {
    private int data;
    private ListNode next;

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next){
        this.data =data;
        this.next = next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    
    
}
