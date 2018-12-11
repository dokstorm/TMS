package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Bugs")
public class BugEntity implements Serializable {
    @Id
    @Column(name = "bug_id")
    @GeneratedValue
    private Integer id;

    //project_id

    @Column(name = "bug_name", nullable = false, length = 70)
    private String name;

    @Column(name = "bug_priority", length = 20, nullable = false)
    private String priority;

    @Column(name = "bug_status", length = 20)
    private String status;

    @Column(name = "bug_enviroment", length = 100)
    private String enviroment;

    @Column(name = "bug_description", length = 140)
    private String description;

    @Column(name = "bug_steps_to_reproduce", length = 140)
    private String stepsToReproduce;

    @Column(name = "bug_actual_result", length = 100)
    private String actualResult;

    @Column(name = "bug_expected_result", length = 100)
    private String expectedResult;

    @Column(name = "bug_source_of_expectations", length = 100)
    private String sourceOfExpectations;

    @Column(name = "bug_reproduction", length = 140)
    private String reproduction;

    @Column(name = "bug_attachments")
    private byte[] attachments;
}
