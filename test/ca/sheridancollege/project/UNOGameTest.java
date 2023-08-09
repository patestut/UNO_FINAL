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

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class UNOGameTest {

    private UNOGame unoGame;
    private UNOPlayer player1;
    private UNOPlayer player2;

    @Before
    public void setUp() {
        unoGame = new UNOGame("UNO");
        player1 = new UNOPlayer("Player1");
        player2 = new UNOPlayer("Player2");
        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        //unoGame.setPlayers(players);
    }

    // Good Test: Ensure the game initializes properly
    @Test
    public void testGoodInitialization() {
        assertNotNull(unoGame);
    }

    // Good Test: Ensure the currentColor is set correctly after initialization
    @Test
   // public void testGoodCurrentColorAfterInitialization() {
       // assertEquals("", unoGame.getCurrentColor());
   // }

    // Boundary Test: Ensure the playerTurn method can be executed without exceptions
   // @Test
    public void testBoundaryPlayerTurn() {
        // Additional assertions can be made based on specific player turn effects
        unoGame.playerTurn(player1);
    }

    // Boundary Test: Ensure the handleSkippedTurn method can be executed without exceptions
    @Test
    public void testBoundaryHandleSkippedTurn() {
        unoGame.handleSkippedTurn(player1);
        // Additional assertions can be made based on specific skipped turn effects
    }

    // Boundary Test: Ensure the checkGameEnd method returns false when player has cards
    @Test
    public void testBoundaryCheckGameEndWithCards() {
        player1.drawCard(new UNOCard("Red", "5"));
        assertFalse(unoGame.checkGameEnd(player1));
    }

    // Boundary Test: Ensure the checkGameEnd method returns true when player has no cards
    @Test
    public void testBoundaryCheckGameEndWithoutCards() {
        assertTrue(unoGame.checkGameEnd(player1));
    }

    // Good Test: Ensure the calculateScore method returns the correct score
    @Test
    public void testGoodCalculateScore() {
        player1.drawCard(new UNOCard("Red", "5"));
        player1.drawCard(new UNOCard("Blue", "Draw Two"));
        assertEquals(15, unoGame.calculateScore(player1));
    }

    // Good Test: Ensure the declareWinner method can be executed without exceptions
    @Test
    public void testGoodDeclareWinner() {
        player1.drawCard(new UNOCard("Red", "5"));
        player2.drawCard(new UNOCard("Blue", "Skip"));
        unoGame.declareWinner();
        // Additional assertions can be made based on specific winner calculation
    }
}
