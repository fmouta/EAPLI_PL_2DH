/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author i110422
 */
public class IncomeType 
{
    private String description;
    public IncomeType(String description)
    {
        if(description == null)        
            throw new IllegalArgumentException();
        this.description = description;
    }
    public String toString()
    {
        return description;
    }
}
