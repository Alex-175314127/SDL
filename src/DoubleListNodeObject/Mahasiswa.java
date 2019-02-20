/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleListNodeObject;

/**
 *
 * @author basisc27
 */
public class Mahasiswa {
     private String nama;
    private int nim;

    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public int compareTo(Object o) {
        Mahasiswa key = (Mahasiswa) o;

        if (this.nim == key.getNim()) {
            return 0;
        } else if (this.nim > key.getNim()) {
            return 1;
        } else {
            return -1;
        }
        
//        if (this.nama.compareTo(key.getNama()) == 0) {
//            return 0;
//        }else if(this.nama.compareTo(key.getNama()) > 0){
//            return 1;
//        }else{
//            return -1;
//        }
    }
}
