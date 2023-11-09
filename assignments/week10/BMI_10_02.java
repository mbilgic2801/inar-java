package week10;

public class BMI_10_02 {
    String name;
    String resultOfBMI;
    double BMI;
    int age;
    double weight;
    double height;
    void determineBMI(){
        if(BMI<18.5){
            this.resultOfBMI="Underweight";
        }
        else if(BMI<25){
            this.resultOfBMI="Normal weight";
        }
        else if(BMI<30){
            this.resultOfBMI="Overweight";
        }
        else{
            this.resultOfBMI="obese";
        }
    }
    public String toString(){
        return "Name: "+name+"\nBMI : "+String.format("%.1f",BMI)+" "+resultOfBMI;
    }
    public BMI_10_02(String name,int age,double weight,double feet,double inches){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=((12*feet+inches)*(2.54/100));
        this.BMI=this.weight/(this.height*this.height);
        determineBMI();
    }
    public BMI_10_02(String name,int age,double weight,double centimetre){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=centimetre/100;
        this.BMI=this.weight/(this.height*this.height);
        determineBMI();
    }
}
