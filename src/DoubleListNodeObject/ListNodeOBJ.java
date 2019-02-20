/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNodeObject;

/**
 *
 * @author basisc27la
 */
public class ListNodeOBJ {
    private Mahasiswa data;
    private ListNodeOBJ next,prev;

    public ListNodeOBJ() {
    }

    public ListNodeOBJ(Mahasiswa data) {
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

    public ListNodeOBJ getNext() {
        return next;
    }

    public void setNext(ListNodeOBJ next) {
        this.next = next;
    }

    public ListNodeOBJ getPrev() {
        return prev;
    }

    public void setPrev(ListNodeOBJ prev) {
        this.prev = prev;
    }
}
