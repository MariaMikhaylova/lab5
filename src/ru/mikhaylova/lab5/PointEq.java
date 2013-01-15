package ru.mikhaylova.lab5;

public class PointEq extends EquationOfTheHyperPlane {

    public PointEq(double a, double b) {
        setName("Точка");
        setA(a);
        setB(b);
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + ",  уравнение: " + getA() + "x+" + getB() + "=0" + ", размерность=" + this.size();
    }

    @Override
    public boolean isLocate(Point p) {
        return getA() * p.x + getB() == 0;
    }

    @Override
    public boolean ownedToOrigin() {
        return getB() == 0;
    }

    @Override
    public void parallel(Point p) {
        System.out.println(getA() + "*x+" + (-getA() * p.x) + "=0");
    }

    @Override
    public void summet(EquationOfTheHyperPlane e) {
        System.out.println("-" + getA() + "*x+" + getB() + "=0");
    }
}
