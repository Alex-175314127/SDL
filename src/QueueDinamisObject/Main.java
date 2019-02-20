package QueueDinamisObject;
/** @author Alexxx */
public class Main {

    public static void main(String[] args) {
        QueueDinamis q = new QueueDinamis();
        Mahasiswa[] data = {
            new Mahasiswa("squidward"), 
            new Mahasiswa("spongebob"), 
            new Mahasiswa("patrick"), 
            new Mahasiswa("plankton"),
            new Mahasiswa("mr.krabs")}; 
  
        q.enqueue(data[0]);
        q.enqueue(data[1]);
        q.enqueue(data[2]);
        q.enqueue(data[3]);            
        q.dequeue();
        q.enqueue(data[4]);
        
        System.out.println("Hasil emqueue dan dequeue : "+q.toString());
        System.out.println();
    }
}
