import javax.persistence.EntityManager;

public class EntityDAO {

    private EntityManager manager;

    public EntityDAO(EntityManager manager) {
        this.manager = manager;
    }

    public EntityManager getManager() {
        return manager;
    }

    public void setManager(EntityManager manager) {
        this.manager = manager;
    }
}
