package ru.mikhaylova.lab5;
import org.junit.Test;
import ru.mikhaylova.lab5.Plane;


import static org.junit.Assert.*;
public class PlaneTest {

    @Test
    public void testSize() {
        System.out.println("Проверка метода size()");
        Plane p = new Plane(3, 4, 2, 1);
        assertEquals(3, p.size(), 0.00001);
    }

    @Test
    public void testOwnedToOrigin() {
        System.out.println("Проверка метода ownedToOrigin()");
        Plane p = new Plane(3, 4, 2, 0);
        assertEquals(true, p.ownedToOrigin());

    }
}

