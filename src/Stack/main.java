/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisc27ma
 */
public class main {
    public static void main(String[] args) {
        StackArray s = new StackArray(4);
        s.push(1);
        s.push(8);    
        s.push(13);
        s.pop();
        s.push(99);
        
        System.out.println(" "+s.toString());
    }
}
