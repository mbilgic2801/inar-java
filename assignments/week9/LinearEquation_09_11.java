package week9;

public class LinearEquation_09_11 {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    void solution(){
        if(isSolvable()){
            System.out.printf("X is %.1f and y is %.1f",getX(),getY());
        }
        else {
            System.out.println("The equation has no solution");
        }
    }

    boolean isSolvable(){
        return (a*d-b-c)!=0;
    }
    double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }
    LinearEquation_09_11(double a, double b, double c, double d, double e, double f) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }

}
