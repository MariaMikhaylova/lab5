package ru.mikhaylova.lab5;
import org.junit.Test;
import ru.mikhaylova.lab5.ThreeDimensionalPlane;


import static org.junit.Assert.*;
public class ThreeDimensionalPlaneTest {

    @Test
    public void testSize() {
        System.out.println("Проверка метода size()");
        ThreeDimensionalPlane p = new ThreeDimensionalPlane(3, 4, 2, 1, 3);
        assertEquals(4, p.size(), 0.00001);
    }

    @Test
    public void testOwnedToOrigin() {
        System.out.println("Проверка метода ownedToOrigin()");
        ThreeDimensionalPlane p = new ThreeDimensionalPlane(3, 4, 2, 1, 0);
        assertEquals(true, p.ownedToOrigin());

    }
    
}
