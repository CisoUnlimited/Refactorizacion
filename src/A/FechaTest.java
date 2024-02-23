package A;

import org.junit.Test;

import static org.junit.Assert.*;

public class FechaTest {
    private Fecha fechaCorrecta = new Fecha (20, 6, 2008);
    private Fecha mesMal1 = new Fecha (21, 0, 3000);
    private Fecha mesMal2 = new Fecha (21, 13, 3000);
    private Fecha diaMal1 = new Fecha (0, 11, 2000);
    private Fecha diaMal2 = new Fecha (32, 11, 2000);
    private Fecha diaMalNoviembre = new Fecha (31, 11, 2000);
    private Fecha diaBienDiciembre = new Fecha (31, 12, 2000);
    private Fecha diaMalFebrero = new Fecha (30, 2, 2008);
    private Fecha diaBienFebreroBisiesto1 = new Fecha (29, 2, 2008);
    private Fecha diaBienFebreroBisiesto2 = new Fecha (29, 2, 2000);
    private Fecha diaMalFebreroBisiesto1 = new Fecha (29, 2, 2007);
    private Fecha diaMalFebreroBisiesto2 = new Fecha (29, 2, 1900);
    @Test
    public void testValidaCP01() {
        assertTrue(fechaCorrecta.fechaValida());
    }
    @Test
    public void testValidaCP02() {
        assertFalse(mesMal1.fechaValida());
    }
    @Test
    public void testValidaCP03() {
        assertFalse(mesMal2.fechaValida());
    }
    @Test
    public void testValidaCP04() {
        assertFalse(diaMal1.fechaValida());
    }
    @Test
    public void testValidaCP05() {
        assertFalse(diaMal2.fechaValida());
    }
    @Test
    public void testValidaCP06() {
        assertFalse(diaMalNoviembre.fechaValida());
    }
    @Test
    public void testValidaCP07() {
        assertTrue(diaBienDiciembre.fechaValida());
    }
    @Test
    public void testValidaCP08() {
        assertFalse(diaMalFebrero.fechaValida());
    }
    @Test
    public void testValidaCP09() {
        assertTrue(diaBienFebreroBisiesto1.fechaValida());
    }
    @Test
    public void testValidaCP10() {
        assertTrue(diaBienFebreroBisiesto2.fechaValida());
    }
    @Test
    public void testValidaCP11() {
        assertFalse(diaMalFebreroBisiesto1.fechaValida());
    }
    @Test
    public void testValidaCP12() {
        assertFalse(diaMalFebreroBisiesto2.fechaValida());
    }
}