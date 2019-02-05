

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Cl")

public class Client extends User{

    @ManyToOne
    private Room room;

    public Client() {
    }

    public Client(String login) {
        setLogin(login);
    }
}
