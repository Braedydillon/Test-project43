/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.unit_testing_exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author braed
 */
public class MessageTest {
    
    public MessageTest() {
    }

    @Test
    public void testHelloString() {
    Message message = new Message();
    String Expected = "Hello";
    String Actual = message.stringMessage();
    assertEquals(Expected,Actual);
    }

    @Test
    public void testValidNumberPass() {
    Message message = new Message();
    boolean Expected =true;
    boolean Actual = message.validNumber(55);
    assertTrue(Actual);
    }
    
    @Test
    public void testValidNumberFail() {
    Message message = new Message();
    boolean Expected =false;
    boolean Actual = message.validNumber(1);
    assertFalse(Actual);
    }
    @Test
    public void testCheckpasswordPass() {
    Message message = new Message();
    boolean Expected = true;
    boolean Actual = message.checkpassword("3A#s");
    assertTrue(Actual);
    }
    @Test
    public void testCheckpasswordFail() {
    Message message = new Message();
    boolean Expected = false;
    boolean Actual = message.checkpassword("heloo");
    assertFalse(Actual);
    }
    @Test
    public void testCheckUsernamePass() {
    Message message = new Message();
    boolean Expected = true;
    boolean Actual = message.checkUsername("Braedy");
    assertTrue(Actual);
    }
    @Test
    public void testCheckUsernameFail() {
    Message message = new Message();
    boolean Expected = false;
    boolean Actual = message.checkUsername("John");
    assertFalse(Actual);
    }
    
}
