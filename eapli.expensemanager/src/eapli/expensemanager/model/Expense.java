package eapli.expensemanager.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;


@Entity
public class Expense extends Movement {
    @ManyToOne(cascade = CascadeType.MERGE)
    private ExpenseType expenseType;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Payment payment;
    
    public Expense() {
    }
    
    public Expense(ExpenseType type, String description, Date dateOccurred,
            BigDecimal amount, Payment payment) {
        super(description, dateOccurred, amount);
        if (type == null ) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative or zero EUR movement
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.expenseType = type;
        this.payment = payment;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }
    
    @Override
    public String toString() {
        return "Expense: " + super.toString() + " " + expenseType;
    }
}
