package entities;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Project_managers")
public class ProjectManagerEntity implements Serializable {
    @EmbeddedId
    private ProjectManagerKey key;

    public ProjectManagerKey getKey() {
        return key;
    }

    public void setKey(ProjectManagerKey key) {
        this.key = key;
    }

    @Embeddable
    public class ProjectManagerKey  implements Serializable {
        protected Integer project_id;
        protected Integer user_id;

        public ProjectManagerKey(Integer project_id, Integer user_id) {
            this.project_id = project_id;
            this.user_id = user_id;
        }

        public Integer getProject_id() {
            return project_id;
        }

        public void setProject_id(Integer project_id) {
            this.project_id = project_id;
        }

        public Integer getUser_id() {
            return user_id;
        }

        public void setUser_id(Integer user_id) {
            this.user_id = user_id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ProjectManagerKey that = (ProjectManagerKey) o;
            return Objects.equals(project_id, that.project_id) &&
                    Objects.equals(user_id, that.user_id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(project_id, user_id);
        }
    }
}
