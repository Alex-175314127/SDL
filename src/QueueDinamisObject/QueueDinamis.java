
package QueueDinamisObject;
/** @author Alexander Adam */
public class QueueDinamis {

    private ListNode antrian, head = null;
    private int size;

    public QueueDinamis() {
        antrian = new ListNode();
        antrian.setNext(antrian);
        antrian.setPrev(antrian);
    }

    public void enqueue(Mahasiswa elemen) {
        addLast(elemen);
    }

    public void addLast(Mahasiswa elemen) {
        ListNode baru = new ListNode(elemen);
        if (isEmpty()) {
            head = baru;
            head.setNext(head);
            head.setPrev(head);
        } else {
            baru.setNext(head);
            baru.setPrev(head.getPrev());
            head.getPrev().setNext(baru);
            head.setPrev(baru);
        }
        size++;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }

    public void dequeue() {
        removeFirst();
    }

    public void removeFirst() {
        ListNode bantu = head;
        if (!isEmpty()) {
            if (size == 1) {
                head = null;
            } else {
                head = head.getNext();
                head.setPrev(bantu.getPrev());
                bantu.getPrev().setNext(head);
            }
            size--;
        }
    }

    @Override
    public String toString() {
        String isi = " ";
        if (!isEmpty()) {
            ListNode pointer = head;
            isi = isi + pointer.getData().getNama();
            pointer = pointer.getNext();
            while (pointer != head) {
                isi += ", " + pointer.getData().getNama();
                pointer = pointer.getNext();
            }
        }
        return isi;
    }

}
