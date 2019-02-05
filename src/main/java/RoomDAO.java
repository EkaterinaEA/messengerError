import javax.persistence.EntityManager;

public class RoomDAO extends EntityDAO{

    public RoomDAO(EntityManager manager) {
        super(manager);
    }

    public Room createRoom(String roomTitle, String country, String region){
        Room room = new Room(roomTitle, country, region);
        getManager().getTransaction().begin();
        getManager().persist(room);
        getManager().getTransaction().commit();
        return room;
    }

    public Room selectRoom(String roomTitle){
        return getManager().createNamedQuery("selectRoom", Room.class)
                .setParameter("roomTitle", roomTitle)
                .getSingleResult();
    }

}
