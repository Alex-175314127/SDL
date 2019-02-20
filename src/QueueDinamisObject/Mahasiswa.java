package QueueDinamisObject;
/** @author Damai */
public class Mahasiswa implements Comparable {

    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public int compareTo(Object o) {
        Mahasiswa key = (Mahasiswa) o;
        if (this.nama == key.getNama()) {
            return 0;
        } else if (this.nama.compareTo(key.getNama()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
