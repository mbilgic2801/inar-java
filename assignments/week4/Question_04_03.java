package week4;

public class Question_04_03 {
    public static void main(String[] args) {
        double aY = Math.toRadians(-84.3879824);
        double aX = Math.toRadians(33.7489954);
        double oY = Math.toRadians(-81.379236499);
        double oX = Math.toRadians(28.5383355);
        double sY = Math.toRadians(-81.09983419999998);
        double sX = Math.toRadians(32.0835407);
        double cY = Math.toRadians(-80.84312669999997);
        double cX = Math.toRadians(35.2270869);
        double radius = 6371.01;
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        double sideAtoO = radius*Math.acos(Math.sin(aX)*Math.sin(oX)+Math.cos(aX)*Math.cos(oX)*Math.cos(aY-oY));
        double sideOtoS = radius*Math.acos(Math.sin(sX)*Math.sin(oX)+Math.cos(sX)*Math.cos(oX)*Math.cos(sY-oY));
        double sideStoC = radius*Math.acos(Math.sin(sX)*Math.sin(cX)+Math.cos(sX)*Math.cos(cX)*Math.cos(sY-cY));
        double sideCtoA = radius*Math.acos(Math.sin(aX)*Math.sin(cX)+Math.cos(aX)*Math.cos(cX)*Math.cos(aY-cY));
        double sideAtoS = radius*Math.acos(Math.sin(aX)*Math.sin(sX)+Math.cos(aX)*Math.cos(sX)*Math.cos(aY-sY));
        //finding triangles' areas
        // 𝑠=(𝑠𝑖𝑑𝑒1 + 𝑠𝑖𝑑𝑒2 + 𝑠𝑖𝑑𝑒3)/2;  𝑎𝑟𝑒𝑎 = 𝑠(𝑠 − 𝑠𝑖𝑑𝑒1)(𝑠 − 𝑠𝑖𝑑𝑒2)(𝑠 − 𝑠𝑖𝑑𝑒3)
        double sSAC = (sideAtoS+sideCtoA+sideStoC)/2;
        double sSOA = (sideAtoS+sideAtoO+sideOtoS)/2;
        double areaSAC = Math.sqrt(sSAC*(sSAC-sideAtoS)*(sSAC-sideCtoA)*(sSAC-sideStoC));
        double areaSOA = Math.sqrt(sSOA*(sSOA-sideAtoO)*(sSOA-sideAtoS)*(sSOA-sideOtoS));
        double areaOfDiamond = areaSAC + areaSOA;
        System.out.printf("Estimated area enclosed by these four cities: %f",areaOfDiamond);


    }
}
