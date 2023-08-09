/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class UNOCardTest {

    private UNOCard unoCard;

    @Before
    public void setUp() {
        unoCard = new UNOCard("Red", "5");
    }

    
    @Test
    public void testGoodInitialization() {
        assertNotNull(unoCard);
        assertEquals("Red", unoCard.getColor());
        assertEquals("5", unoCard.getValue());
    }

    @Test
    public void testGoodToString() {
        assertEquals("Red 5", unoCard.toString());
    }

    @Test
    public void testBoundaryGetScoreValue() {
        assertEquals(0, unoCard.getScoreValue());
    }

    
    @Test
    public void testGoodGetColor() {
        assertEquals("Red", unoCard.getColor());
    }

    
    @Test
    public void testGoodGetValue() {
        assertEquals("5", unoCard.getValue());
    }

    
    @Test
    public void testBadGetValue() {
        assertNotNull(unoCard.getValue());
    }

    
    @Test
    public void testBadGetColor() {
        assertNotNull(unoCard.getColor());
    }
}
