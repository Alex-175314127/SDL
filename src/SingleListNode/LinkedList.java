/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleListNode;

/**
 *
 * @author basisc27ma
 */
public class LinkedList {

    private ListNode firstNode;
    private ListNode lastNode;
    private int size;

    LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }

    public LinkedList(int size) {
        this.size = size;
    }

    public void addFirst(int f) {
        ListNode baru = new ListNode(f);
        if (isEmpty()) {
            firstNode = baru;
            lastNode = baru;
        } else {
            baru.setNext(firstNode);
            firstNode = baru;
        }
        size++;
    }

    public void addLast(int l) {
        ListNode baru = new ListNode(l);
        if (isEmpty()) {
            lastNode = baru;
            firstNode = baru;
        } else {
            lastNode.setNext(baru);
            lastNode = baru;
        }
        size++;
    }

    public ListNode removeLast() {
        if (!isEmpty() || firstNode != null) {
            ListNode bantu = firstNode;
            while (bantu.getNext() != lastNode) {
                bantu = bantu.getNext();
            }
            lastNode = bantu;
            bantu=bantu.getNext();
            lastNode.setNext(null);
            size--;
            return bantu;
        } else {
            return null;
        }
    }
public ListNode removeFirst(){
    if (firstNode != null) {
        ListNode bantu = firstNode;
        firstNode = firstNode.getNext();
        size--;
        return bantu;
    }else{
        return null;
    }
}
    public boolean isEmpty() {
        if (firstNode != null && lastNode != null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String isi = " ";
        ListNode pointer = firstNode;
        while (pointer != null) {
            isi += pointer.getData() + " ";
            pointer = pointer.getNext();
        }
        return isi;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
