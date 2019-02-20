/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNodeObject;

/**
 *
 * @author basisc27la
 */
public class Main {

    public static void main(String[] args) {
        LinkedListOBJ x = new LinkedListOBJ();
//        Mahasiswa mhs = new Mahasiswa("joni", 176642);
//        Mahasiswa mhs2 =new M
        Mahasiswa[] data = {new Mahasiswa("Budi", 1756001),
            new Mahasiswa("Redy", 1756009),
            new Mahasiswa("Frida", 1756007),
            new Mahasiswa("Aldy", 1756004),
            new Mahasiswa("joni", 1756007)};

        Mahasiswa key = new Mahasiswa("Aldy",1756004);
//        Mahasiswa key= (data[3]);

        x.addFirst(data[1]);
        x.addLast(data[0]);
        x.addLast(data[2]);
        x.addFirst(data[3]);
        x.addLast(data[4]);

//        x.removeFirst();
//        x.removeLast();    
//        x.removeMid(data[2]);

        
            System.out.println(" " + x.toString());
        System.out.println("banyak data : " + x.getSize());


        if (x.Search(key.getNama()) != -1) {
            System.out.println("data ada");
        } else {
            System.out.println("data tidak ada");
        }
    }
}
