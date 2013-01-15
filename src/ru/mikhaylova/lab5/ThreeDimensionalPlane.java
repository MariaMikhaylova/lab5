package ru.mikhaylova.lab5;

public class ThreeDimensionalPlane extends EquationOfTheHyperPlane {

    private double c;
    private double d;
    private double e;

    public ThreeDimensionalPlane(double a, double b, double c, double d, double e) {
        setName("Плоскость 3D");
        setA(a);
        setB(b);
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public int size() {
        return 4;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  уравнение: " + getA() + "x+" + getB() + "y+" + c + "z+" + d + "t+" + e + "=0" + ", размерность=" + this.size();
    }

    @Override
    public boolean isLocate(Point p) {
        return getA() * p.x + getB() * p.y + c * p.z + d * p.t + e == 0;
    }

    @Override
    public boolean ownedToOrigin() {
        return e == 0;
    }

    @Override
    public void parallel(Point p) {
        System.out.println(getA() + "*x+" + getB() + "*y+" + c + "*z+" + d + "*t+" + (-getA() * p.x - getB() * p.y - c * p.z - d * p.t) + "=0");
    }

    @Override
    public void summet(EquationOfTheHyperPlane e) {
        System.out.println("-" + getA() + "*x-" + getB() + "*y-" + c + "*z-" + d + "*t-" + e + "=0");
    }
}
