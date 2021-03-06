package ru.mikhaylova.lab5;

public class Plane extends EquationOfTheHyperPlane {

    private double c;
    private double d;

    public Plane(double a, double b, double c, double d) {
        setName("Плоскость 2D");
        setA(a);
        setB(b);
        this.c = c;
        this.d = d;

    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  уравнение: " + getA() + "x+" + getB() + "y+" + c + "z+" + d + "=0" + ", размерность=" + this.size();
    }

    @Override
    public boolean ownedToOrigin() {
        return d == 0;
    }

    @Override
    public boolean isLocate(Point p) {
        return getA() * p.x + getB() * p.y + c * p.z + d == 0;
    }

    @Override
    public void parallel(Point p) {
        System.out.println(getA() + "*x+" + getB() + "*y+" + c + "*z+" + (-getA() * p.x - getB() * p.y - c * p.z) + "=0");
    }

    @Override
    public void summet(EquationOfTheHyperPlane e) {
        System.out.println("-" + getA() + "*x-" + getB() + "*y-" + c + "*z+" + d + "=0");
    }
}
