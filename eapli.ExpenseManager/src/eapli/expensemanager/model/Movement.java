
package eapli.expensemanager.model;

import eapli.util.DateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Movement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOcurred;

    public Movement() {
    }
    
    public Movement(String description, Date dateOccurred, BigDecimal amount) {
        if (description == null || dateOccurred == null || amount == null) {
            throw new IllegalArgumentException();
        }
        // cannot record a negative or zero EUR movement
        if (amount.signum() == -1 || amount.signum() == 0) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.dateOcurred = dateOccurred;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public Date getDate() {
        return dateOcurred;
    }    
    
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return " Id=" + id + " description=" + description 
                + " date=" + dateOcurredToString() + " amount=" + amount;
    }  
    
    private String dateOcurredToString() {
        return DateTime.dateToCalendar(dateOcurred).get(Calendar.DAY_OF_MONTH)
                + "/"
                + DateTime.dateToCalendar(dateOcurred).get(Calendar.MONTH)
                + "/"
                + DateTime.dateToCalendar(dateOcurred).get(Calendar.YEAR);
    }
}
