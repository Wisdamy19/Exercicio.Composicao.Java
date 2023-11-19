package Exerc01;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valueHour;
    private double hours;

    public HourContract(Date date, double valueHour, double hours) {
        this.date = date;
        this.valueHour = valueHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValueHour() {
        return valueHour;
    }

    public void setValueHour(double valueHour) {
        this.valueHour = valueHour;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    public double totalValue(){
        return valueHour * hours;
    }
}
