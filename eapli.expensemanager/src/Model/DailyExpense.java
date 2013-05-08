package Model;

import java.math.BigDecimal;

public class DailyExpense {
    private int day;
    private int month;
    private int year;
    private BigDecimal value;
    
    public DailyExpense(int day,int month,int year,BigDecimal value){
        this.day=day;
        this.month=month;
        this.year=year;
        this.value=value;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public BigDecimal getValue(){
        return value;
    }
    
    public boolean equals(DailyExpense test){
        if(test.getDay() == this.getDay() && test.getMonth() == this.getMonth() && test.getYear() == this.getYear() && test.getValue().equals(this.getValue())){
            return true;
        }else{
            return false;
        }
    }

    public void addValue(BigDecimal amount) {
        value.add(amount);
    }
}