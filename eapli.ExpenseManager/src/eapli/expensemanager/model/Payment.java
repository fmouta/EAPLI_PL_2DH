package eapli.expensemanager.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Payment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private PaymentMeans paymentMeans;
    
    public Payment() {
    }
    
    public Payment(PaymentMeans paymentMeans) {
        this.paymentMeans = paymentMeans;
    }

    public Long getId() {
        return id;
    }




}
