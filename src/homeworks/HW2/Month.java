package homeworks.HW2;


import com.sun.javaws.exceptions.InvalidArgumentException;

import java.security.InvalidParameterException;

/**
 * Created by Vahag on 3/30/2017.
 */
public class Month {
    int monthNumber;

    public Month(){
        monthNumber = 1;
    }

    public Month(int monthNumber) throws InvalidParameterException{
        if(monthNumber < 1 || monthNumber > 12){
            throw new InvalidParameterException();
        }else{
            this.monthNumber = monthNumber;
        }
    }

    public Month(String month) throws InvalidParameterException {
        switch (month){
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
            default: throw new InvalidParameterException();
        }
    }

    public void setMonthNumber(int monthNumber) throws InvalidParameterException  {
        if(monthNumber < 1 || monthNumber > 12){
            throw new InvalidParameterException();
        }else{
            this.monthNumber = monthNumber;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        int monthNum = this.monthNumber;
        switch (monthNum){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }

    @Override
    public String toString() {
        return getMonthName();
    }

    public boolean equals(Month month) {
        return monthNumber == month.monthNumber ? true : false;
    }

    public boolean greaterThan(Month month){
        return monthNumber > month.monthNumber ? true : false;
    }

    public boolean lessThan(Month month){
        return monthNumber < month.monthNumber ? true : false;
    }
}
