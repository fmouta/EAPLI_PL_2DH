
package eapli.expensemanager.model;

import javax.persistence.Entity;

/**
 *
 * @author i111623
 */

@Entity
public class ExpenseType extends MovementType {
    
    public ExpenseType() {
    }
    
    public ExpenseType(String description) {
        super(description);
    }
          
    @Override
    public String toString() {
        return "Expense Type: "  + super.toString();
    }
}
