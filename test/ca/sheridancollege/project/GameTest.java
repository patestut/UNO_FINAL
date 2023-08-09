/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

 public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new UnoGame("UNO");
    }

    @Test
    public void testGoodGetName() {
        assertEquals(null  , game.getName());
    }

    
    @Test
    public void testGoodSetPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Player 1") {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        players.add(new Player("Player 2") {
            @Override
            public void play() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        game.setPlayers(players);

        assertEquals(players, game.getPlayers());
    }

   
    @Test(expected = NullPointerException.class)
    public void testBadSetPlayersNull() {
        game.setPlayers(null);
    }

   
    @Test
    public void testBoundaryPlay() {
        game.play();
        
    }

    
    @Test
    public void testBoundaryDeclareWinner() {
        game.declareWinner();
       
    }

    private static class UnoGame extends Game {

        public UnoGame(String name) {
            super(name);
        }

        @Override
        public void play() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void declareWinner() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
    
