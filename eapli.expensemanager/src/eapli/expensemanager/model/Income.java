
package eapli.expensemanager.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.CascadeType;

/**
 *
 * @author i110422
 */
@Entity
public class Income extends Movement {

    @ManyToOne(cascade = CascadeType.MERGE)
    private IncomeType incomeType;

    public Income() {
    }

    public Income(String description, Date dateOccurred, BigDecimal amount, IncomeType type) {
        super(description, dateOccurred, amount);
        this.incomeType = type;
    }
}
