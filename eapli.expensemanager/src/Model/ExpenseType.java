/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i111623
 */
public class ExpenseType {
    private String description;

    public ExpenseType() {
        
    }

    public ExpenseType(String description) {
        this.description = description;
    }
    
    public String getDescription(){
        return description;
    }
    
     public String toString()
    {
        return description;
    }
}
