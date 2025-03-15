import static java.lang.Math.sin;

abstract class Paralelogram {

    private double latura1 = 6;
    private double latura2 = 8;
    private int angleA = 30;
    private double inaltime1 = 0.4;

    abstract double calcPerimetru(double a , double b);

    double calcArea(double a , double b) {
        return a * b;
    }

    int calcArea(double a , double b, int c) {
        return (int) (a * b * sin(c));
    }

    public double getLatura1() {
        return latura1;
    }

    public double getLatura2() {
        return latura2;
    }

    public int getAngleA() {
        return angleA;
    }

    public double getInaltime1() {
        return inaltime1;
    }

}

class CalcParalelogram extends Paralelogram {


    @Override
    double calcPerimetru(double a , double b) {
        return a + b;
    }
}

class Ex13 {
    public static void main(String[] args) {

        Paralelogram calc = new CalcParalelogram();

        System.out.println(calc.calcPerimetru(calc.getLatura1(), calc.getLatura2()));
        System.out.println(calc.calcArea(calc.getLatura2(), calc.getInaltime1()));

        System.out.println(calc.calcArea(calc.getLatura2(), calc.getLatura1(), calc.getAngleA()));
    }
}