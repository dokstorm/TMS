package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Tasks")
public class TaskEntity implements Serializable {
    @Id
    @Column(name = "task_id")
    @GeneratedValue
    private Integer id;

    @Column(name = "task_name", length = 70, nullable = false)
    private String name;

    @Column(name = "task_priority", length = 20, nullable = false)
    private String priority;

    @Column(name = "task_status", length = 20)
    private String status;

    @Column(name = "task_description", length = 140)
    private String description;

    @Column(name = "task_attachments")
    private byte[] attachments;

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

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
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

    public byte[] getAttachments() {
        return attachments;
    }

    public void setAttachments(byte[] attachments) {
        this.attachments = attachments;
    }
}
