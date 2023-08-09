/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    private Player player;
    private Object Color;
    private Object Value;

    @Before
    public void setUp() {
        player = new UnoPlayer("Alice");
    }

    
    @Test
    public void testGoodGetName() {
        assertEquals("Alice", player.getName());
    }

    
    @Test
    public void testGoodSetName() {
        player.setName("Bob");
        assertEquals("Bob", player.getName());
    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testBadSetNameNull() {
        player.setName(null);
    }

    
    @Test
    public void testBoundaryPlay() {
        player.play();
        
    }

   

    private static class UnoPlayer extends Player {

        public UnoPlayer(String name) {
            super(name);
        }

        @Override
        public void play() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        
        }

        public void play() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

