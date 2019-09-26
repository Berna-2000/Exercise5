/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5;

/**
 *
 * @author ferolinma_cis21035
 */
public class Exercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape sh = new Shape();
        sh.setColor("red");
        sh.setFilled(false);
        System.out.println(sh.toString());
        Circle c = new Circle();
        System.out.println(c.toString());
        Rectangle r = new Rectangle(1.0, 1.0);
        System.out.println(r.toString());
        Square s = new Square ();
        s.setSide(1.0);
        System.out.println(s.getSide());
        System.out.println(s.toString());
    }
    
}
