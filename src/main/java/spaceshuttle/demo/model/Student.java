package spaceshuttle.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@DiscriminatorValue("student")
public class Student extends User {
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "class_student", joinColumns = @JoinColumn(name = "class_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))

    private Set<OnlineClass> onlineClasses;

    public Student() {
    }

    public Set<OnlineClass> getOnlineClasses() {
        return onlineClasses;
    }

    public void setOnlineClasses(Set<OnlineClass> onlineClasses) {
        this.onlineClasses = onlineClasses;
    }
}
