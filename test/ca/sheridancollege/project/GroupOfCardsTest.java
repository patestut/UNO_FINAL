/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class GroupOfCardsTest {

    private GroupOfCards group;

    @Before
    public void setUp() {
        group = new GroupOfCards(52);
    }

   
    @Test
    public void testGoodGetSize() {
        assertEquals(52, group.getSize());
    }

        @Test
    public void testGoodSetSize() {
        group.setSize(100);
        assertEquals(100, group.getSize());
    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testBadSetSizeNegative() {
        group.setSize(-10);
    }

   
    @Test
    public void testBoundaryGetCards() {
        assertNotNull(group.getCards());
    }

    
    @Test
    public void testBoundaryShuffle() {
        group.shuffle();
            }
}
