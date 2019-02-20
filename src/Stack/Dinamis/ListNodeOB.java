/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.Dinamis;

import DoubleListNodeObject.*;

/**
 *
 * @author basisc27la
 */
public class ListNodeOB {
    private Mahasiswa data;
    private ListNodeOB next,prev;

    public ListNodeOB() {
    }

    public ListNodeOB(Mahasiswa data) {
        this.data =data;
        this.next = null;
        this.prev = null;
    }
    
    public Mahasiswa getData() {
        return data;
    }

    public void setData(Mahasiswa data) {
        this.data = data;
    }

    public ListNodeOB getNext() {
        return next;
    }

    public void setNext(ListNodeOB next) {
        this.next = next;
    }

    public ListNodeOB getPrev() {
        return prev;
    }

    public void setPrev(ListNodeOB prev) {
        this.prev = prev;
    }
}
