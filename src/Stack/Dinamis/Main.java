/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack.Dinamis;

/**
 *
 * @author basisc27ma
 */
public class Main {

    public static void main(String[] args) {
        StackArrayObject so = new StackArrayObject(4);
        Mahasiswa[] data = {new Mahasiswa("Doraemon", 150001),
            new Mahasiswa(" Sponegbob", 150002),
            new Mahasiswa(" Mr.Bean", 150003),
            new Mahasiswa("Squidward", 170004)};
        so.Push(data[0]);
        so.Push(data[1]);
        so.Push(data[2]);
        so.Push(data[3]);
        so.pop();

        System.out.println(so.toString());
    }
}
