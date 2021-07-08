package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


/*
 * Il test dovrebbe ritornare 1,66667 se la formula inserita
 * è giusta.
 */

class AppTest {

	@Test
	void testconvertiInCelsius() {
        var test = new App();
        assertEquals(0, test.convertiInCelsius(35));
      
	}

}
