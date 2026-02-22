package net.timourti.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de donnees");
        double t =34;
        return t;
    }
}
