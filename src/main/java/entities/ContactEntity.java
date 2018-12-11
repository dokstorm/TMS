package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Contacts")
public class ContactEntity implements Serializable {
    //класс - составной ключ
    @EmbeddedId
    private ContactKey key;

    public ContactKey getKey() {
        return key;
    }

    public void setKey(ContactKey key) {
        this.key = key;
    }

    @Embeddable
    public class ContactKey implements Serializable {
        protected Integer contact_id;
        protected Integer user_id;

        public ContactKey(Integer contact_id, Integer user_id) {
            this.contact_id = contact_id;
            this.user_id = user_id;
        }

        public Integer getContact_id() {
            return contact_id;
        }

        public void setContact_id(Integer contact_id) {
            this.contact_id = contact_id;
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
            ContactKey that = (ContactKey) o;
            return Objects.equals(contact_id, that.contact_id) &&
                    Objects.equals(user_id, that.user_id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(contact_id, user_id);
        }
    }
}
