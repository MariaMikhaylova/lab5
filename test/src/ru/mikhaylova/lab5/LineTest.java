package ru.mikhaylova.lab5;
import org.junit.Test;
import ru.mikhaylova.lab5.Line;


import static org.junit.Assert.*;
public class LineTest {

    @Test
    public void testSize() {
        System.out.println("Проверка метода size()");
        Line p = new Line(3, 4, 2);
        assertEquals(2, p.size(), 0.00001);

    }
    
    @Test
    public void testOwnedToOrigin() {
        System.out.println("Проверка метода ownedToOrigin()");
        Line p = new Line(3, 4, 0);
        assertEquals(true, p.ownedToOrigin());

    }


}
