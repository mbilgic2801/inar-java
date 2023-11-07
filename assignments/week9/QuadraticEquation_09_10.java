package week9;

public class QuadraticEquation_09_10 {
    private double a;
    private double b;
    private double c;
    QuadraticEquation_09_10(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void solution(){
        if(getDiscriminant()>0){
            System.out.printf("The equation has two roots %.3f and %.3f",getRoot1(),getRoot2());
        }
        else if(getDiscriminant()==0){
            System.out.printf("The equation has one root %.3f",getRoot1());
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
    double getDiscriminant(){
        return b*b-4*a*c;
    }
    double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    double getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
