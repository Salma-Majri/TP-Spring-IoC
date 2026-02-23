package ext;
import dao.IDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("d2")
@Repository("d2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs ....");
        double t = 12;
        return t;
    }
}