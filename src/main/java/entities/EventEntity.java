package entities;

import javax.persistence.*;

@Entity
@Table(name = "PEvents")
public class EventEntity {
    @Id
    @Column(name = "event_id")
    @GeneratedValue
    private Integer id;

    //prject_id

    @Column(name = "event_name", length = 70, nullable = false)
    private String name;

    @Column(name = "event_status", length = 20)
    private String status;

    @Column(name = "event_description", length = 140)
    private String description;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
