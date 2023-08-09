/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class UNOPlayerTest {

    private UNOPlayer unoPlayer;
    private UNOCard card1;
    private UNOCard card2;

    @Before
    public void setUp() {
        unoPlayer = new UNOPlayer("Player1");
        card1 = new UNOCard("Red", "5");
        card2 = new UNOCard("Blue", "Draw Two");
    }

    @Test
    public void testGoodInitialization() {
        assertNotNull(unoPlayer);
        assertNotNull(unoPlayer.getHand());
    }

    @Test
    public void testGoodDrawCard() {
        unoPlayer.drawCard(card1);
        assertEquals(1, unoPlayer.getHand().size());
    }

    @Test
    public void testBoundaryGetHand() {
        unoPlayer.drawCard(card1);
        unoPlayer.drawCard(card2);
        assertEquals(2, unoPlayer.getHand().size());
    }

    @Test
    public void testBoundaryGetEmptyHand() {
        assertEquals(0, unoPlayer.getHand().size());
    }

    @Test
    public void testBadDrawNullCard() {
        unoPlayer.drawCard(null);
        assertEquals(1, unoPlayer.getHand().size());
    }
}

