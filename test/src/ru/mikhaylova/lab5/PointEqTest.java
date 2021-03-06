package ru.mikhaylova.lab5;
import org.junit.Test;
import ru.mikhaylova.lab5.PointEq;


import static org.junit.Assert.*;
public class PointEqTest {

    @Test
    public void testSize() {
        System.out.println("Проверка метода size()");
        PointEq p = new PointEq(3, 4);
        assertEquals(1, p.size(), 0.00001);
    }

    @Test
    public void testOwnedToOrigin() {
        System.out.println("Проверка метода ownedToOrigin()");
        PointEq p = new PointEq(3, 0);
        assertEquals(true, p.ownedToOrigin());

    }
}
