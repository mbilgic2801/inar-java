package week10;



import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate_10_14 {
    int year;
    int month;
    int day;

    public MyDate_10_14() {

        GregorianCalendar date=new GregorianCalendar();
        this.year=date.get(GregorianCalendar.YEAR);
        this.month=date.get(GregorianCalendar.MONTH)+1;
        this.day=date.get(GregorianCalendar.DAY_OF_MONTH);


    }
  public MyDate_10_14(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
  }
  public MyDate_10_14(long elapsedTime){
      GregorianCalendar date=new GregorianCalendar();
      Date date2=new Date(elapsedTime);
      date.setTime(date2);
      this.year=date.get(GregorianCalendar.YEAR);
      this.month=date.get(GregorianCalendar.MONTH)+1;
      this.day=date.get(GregorianCalendar.DAY_OF_MONTH);
  }
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setDate(long elapsedTime){
        GregorianCalendar date=new GregorianCalendar();
        Date date2=new Date(elapsedTime);
        date.setTime(date2);
        this.year=date.get(GregorianCalendar.YEAR);
        this.month=date.get(GregorianCalendar.MONTH)+1;
        this.day=date.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public String toString(){
        return ((day<10)?("0"+day):day)+"/"+((month<10)?("0"+month):month)+"/"+year;
    }
}
