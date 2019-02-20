package QueueDinamisObject;
/** @author ALexxx */
public class ListNode {

    private Mahasiswa data;
    private ListNode next;
    private ListNode prev;

    public ListNode() {
    }

    public ListNode(Mahasiswa data) {
        this.data = data;
    }

    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getPrev() {
        return prev;
    }

}
