package net.timourti.net.timourti.ext;

import net.timourti.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capture");
        double t =12;
        return t;

    }
}
