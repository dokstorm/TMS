package entities;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Project_workers")
public class ProjectWorkerEntity implements Serializable {
    @EmbeddedId
    private ProjectWorkerKey key;

    public ProjectWorkerKey getKey() {
        return key;
    }

    public void setKey(ProjectWorkerKey key) {
        this.key = key;
    }

    @Embeddable
    public class ProjectWorkerKey  implements Serializable {
        protected Integer project_id;
        protected Integer user_id;

        public ProjectWorkerKey(Integer project_id, Integer user_id) {
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
            ProjectWorkerKey that = (ProjectWorkerKey) o;
            return Objects.equals(project_id, that.project_id) &&
                    Objects.equals(user_id, that.user_id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(project_id, user_id);
        }
    }
}
