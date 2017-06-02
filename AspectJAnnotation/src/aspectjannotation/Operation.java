/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aspectjannotation;

/**
 *
 * @author Mac
 */
public class Operation {

    public void msg() {
        System.out.println("msg method invoked");
    }

    public int m() {
        System.out.println("m method invoked");
        return 2;
    }

    public int k() {
        System.out.println("k method invoked");
        return 3;
    }
}
