package net.timourti.ext;

import net.timourti.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capture");
        double t =12;
        return t;

    }
}
