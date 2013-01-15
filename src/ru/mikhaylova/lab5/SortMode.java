package ru.mikhaylova.lab5;

import java.util.Comparator;

public class SortMode implements Comparator<EquationOfTheHyperPlane> {

    private boolean sortUp;
    private int sortMode;

    public SortMode(boolean sortUp, int sortMode) {
        this.sortUp = sortUp;
        this.sortMode = sortMode;
    }

    @Override
    public int compare(EquationOfTheHyperPlane p1, EquationOfTheHyperPlane p2) {
        int res = 0;
        if (sortMode == 0) {
            if (p1.getId() > p2.getId()) {
                res = 1;
            } else if (p1.getId() < p2.getId()) {
                res = -1;
            }
        } else if (sortMode == 1) {
            res = p1.getName().compareTo(p2.getName());
        } else {
            if (p1.size() > p2.size()) {
                res = 1;
            } else if (p1.size() < p2.size()) {
                res = -1;
            }
        }
        if (sortUp) {
            res *= (-1);
        }
        return res;
    }
}
