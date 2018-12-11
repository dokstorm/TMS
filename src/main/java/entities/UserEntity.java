package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class UserEntity implements Serializable {
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "user_login", nullable = false, unique = true, length = 35)
    private String login;

    @Column(name = "user_password", nullable = false, length = 35)
    private String password;

    @Column(name = "user_name", nullable = false, length = 50)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
