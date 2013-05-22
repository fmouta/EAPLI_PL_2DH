
package eapli.expensemanager.model;

import eapli.expensemanager.persistence.IPaymentMeansRepository;
import eapli.expensemanager.persistence.PersistenceFactory;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author 1111314, 1111407
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PaymentMeans implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void save() {
        IPaymentMeansRepository repo = PersistenceFactory.
                buildPersistenceFactory().paymentMeansRepository();
        repo.save(this);
    }

    public static List<PaymentMeans> loadAll() {
        IPaymentMeansRepository repo = PersistenceFactory.
                buildPersistenceFactory().paymentMeansRepository();
        return repo.all();
    }
    
    public abstract String getDescription() ;
}
