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

    @Test
    public void testGoodInitialization() {
        assertNotNull(unoGame);
    }


    @Test
    public void testBoundaryPlayerTurn() {
        // Additional assertions can be made based on specific player turn effects
        unoGame.playerTurn(player1);
    }


    @Test
    public void testBoundaryHandleSkippedTurn() {
        unoGame.handleSkippedTurn(player1);
    }

    
    @Test
    public void testBoundaryCheckGameEndWithCards() {
        player1.drawCard(new UNOCard("Red", "5"));
        assertFalse(unoGame.checkGameEnd(player1));
    }
    
    @Test
    public void testBoundaryCheckGameEndWithoutCards() {
        assertTrue(unoGame.checkGameEnd(player1));
    }

    
    @Test
    public void testGoodCalculateScore() {
        player1.drawCard(new UNOCard("Red", "5"));
        player1.drawCard(new UNOCard("Blue", "Draw Two"));
        assertEquals(15, unoGame.calculateScore(player1));
    }


    @Test
    public void testGoodDeclareWinner() {
        player1.drawCard(new UNOCard("Red", "5"));
        player2.drawCard(new UNOCard("Blue", "Skip"));
        unoGame.declareWinner();
        
    }
}
