/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.theoreticalexercise.view;

import ec.edu.espe.theoreticalexercise.model.A;
import ec.edu.espe.theoreticalexercise.model.B;
import ec.edu.espe.theoreticalexercise.model.C;
import ec.edu.espe.theoreticalexercise.model.D;
import ec.edu.espe.theoreticalexercise.model.E;
import ec.edu.espe.theoreticalexercise.model.F;
import ec.edu.espe.theoreticalexercise.model.H;
import ec.edu.espe.theoreticalexercise.model.I;
import ec.edu.espe.theoreticalexercise.model.J;
import ec.edu.espe.theoreticalexercise.model.K;
import java.util.ArrayList;

/**
 *
 * @author Darian M. Martinez ESPE DCCO
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println("============Darian M. Martinez ESPE DCCO============");

        ArrayList<K> ks = new ArrayList();
        for (int i = 0; i < 5; i++) {
            ks.add(new K(i));
        }

        J js[] = new J[1];
        
        H h = new H(new I(5), 2, 3);
        
        F fs[] = new F[4];
        fs[0] = h;
        fs[1] = h;
        fs[2] = h;
        fs[3] = h;
        for(F fss : fs){
            System.out.println(fss);
        }
        
        E e = new E(fs, 2, 2, 2, 2, ks, js);
        
        C c = new C(fs, 2, 6);
        
        D d = new D(fs, 2, 6);

        ArrayList<B> bs = new ArrayList();
        for (int i = 0; i < 5; i++) {
            bs.add(new B(fs, i, i));
        }
        System.out.println(c);
        B b = new B(fs,1,1);
        System.out.println(b.toString());
        B b1 = new E(fs, 2, 2, 2, 4, ks, js);
        System.out.println(b1.toString());
        
        A as[] = new A[4];
        A a1 = new A(bs);
        A a2 = new A(bs);
        A a3 = new A(bs);
        A a4 = new A(bs);

        as[0] = a1;
        as[1] = a2;
        as[2] = a3;
        as[3] = a4;

        for (A ass : as) {
            System.out.println(ass.toString());
        }
        System.out.println("\n");
        System.out.println("===============METHODS=================");
        e.m1();
        h.m();
        h.m(2);
        h.m(3.0F);
        c.m1();
        d.m1();
        
    } 
}
