package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//@Component("d")
@Repository("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double temp = 23;
        return temp;
    }
}