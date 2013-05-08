
package eapli.expensemanager.model;

import javax.persistence.Entity;

/**
 *
 * @author i110422
 */

@Entity
public class IncomeType extends MovementType {
    
    public IncomeType() {
    }
    
    public IncomeType(String description) {
        super(description);
    }
    
              
    @Override
    public String toString() {
        return "Income Type: "  + super.toString();
    }
}
