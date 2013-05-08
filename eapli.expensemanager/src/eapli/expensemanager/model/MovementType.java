
package eapli.expensemanager.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class MovementType implements Serializable {
    @Id
    private String description;

    public MovementType(){
    }
    
    public MovementType(String description) {
        if (description == null) {
            throw new IllegalArgumentException();
        }
        this.description = description;
    }

    public String getId() {
        return description;
    }

    public String toString() {
        return description;
    }
}
