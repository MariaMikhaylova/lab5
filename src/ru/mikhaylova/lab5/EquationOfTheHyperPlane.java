package ru.mikhaylova.lab5;

public abstract class EquationOfTheHyperPlane implements ParallelTransfer, Summetry {

    public abstract boolean ownedToOrigin();

    public abstract boolean isLocate(Point p);

    public abstract int size();
    private String name;
    private double a;
    private double b;
    private int id;
    static int nextId = 1;

    {
        id = nextId++;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
