package ru.mikhaylova.lab5;

public class Line extends EquationOfTheHyperPlane {

    private double c;

    public Line(double a, double b, double c) {
        setName("Линия");
        setA(a);
        setB(b);
        this.c = c;
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  уравнение: " + getA() + "x+" + getB() + "y+" + c + "=0" + ", размерность=" + this.size();
    }

    @Override
    public boolean isLocate(Point p) {
        return getA() * p.x + getB() * p.y + c == 0;
    }

    @Override
    public boolean ownedToOrigin() {
        return c == 0;
    }

    @Override
    public void parallel(Point p) {
        System.out.println(getA() + "*x+" + getB() + "*y+" + (-getA() * p.x - getB() * p.y) + "=0");
    }

    @Override
    public void summet(EquationOfTheHyperPlane e) {
        System.out.println("-" + getA() + "*x-" + getB() + "*y+" + c + "=0");
    }
}
