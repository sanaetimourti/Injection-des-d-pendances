package net.timourti.pre;

import net.timourti.dao.DaoImpl;
import net.timourti.metier.MetierImpl;
import net.timourti.net.timourti.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier = new MetierImpl(d);
        metier.setDao(d);// injection via setter
        System.out.println("Res"+metier.calcul());
    }
}
