package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Projects")
public class ProjectEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "project_id")
    private Integer id;

    @Column(name = "project_name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
