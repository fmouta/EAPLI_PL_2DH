package eapli.expensemanager.persistence;


import eapli.expensemanager.ExpenseManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceFactory {
    
       public static IRepositoryFactory buildPersistenceFactory() {

        String factoryClassName = ExpenseManager.getApplicationProperties().getProperty("persistence.repositoryFactory");
        try {
            return (IRepositoryFactory) Class.forName(factoryClassName).newInstance();
        } catch (Exception ex) {
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
