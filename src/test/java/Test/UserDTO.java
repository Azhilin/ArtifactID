package Test;

/**
 * Created by azhilin on 24.01.2017.
 */
public class UserDTO {
    int id;
    String name;
    String surname;

    public UserDTO(int id, String name, String surname) {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
