package com.ironiacorp.lottery;

import static org.junit.Assert.*;

import org.junit.Test;

public class MegasenaTest {

	@Test
	public void testGetResults()
	{
		Megasena megasena = new Megasena();
		megasena.setAllottedNumbers(new Integer[] { 36, 54, 03, 31, 15, 48 });

		megasena.addBet("Falcão", new Integer[] { 1, 9, 10, 15, 34, 58 });
		megasena.addBet("Falcão", new Integer[] { 1, 9, 10, 25, 26, 51 });

		megasena.addBet("Piu", new Integer[] { 8, 15, 16, 42, 52, 55 });
		megasena.addBet("Piu", new Integer[] { 10, 20, 23, 27, 38, 46 });

		megasena.addBet("Bruno", new Integer[] { 29, 31, 39, 43, 51, 60 });
		megasena.addBet("Bruno", new Integer[] { 4, 27, 30, 36, 45, 57 });

		megasena.addBet("Marcão", new Integer[] { 07, 12, 14, 27, 47, 51 });
		megasena.addBet("Marcão", new Integer[] { 5, 9, 28, 33, 47, 56 });

		megasena.addBet("Rodrigo", new Integer[] { 8, 14, 22, 23, 29, 42 });
		megasena.addBet("Rodrigo", new Integer[] { 2, 12, 23, 24, 34, 52 });

		megasena.addBet("Endo", new Integer[] { 10, 25, 32, 47, 49, 55 });
		megasena.addBet("Endo", new Integer[] { 13, 15, 22, 44, 46, 59 });

		megasena.addBet("Nardi", new Integer[] { 7, 13, 23, 28, 34, 57 });
		megasena.addBet("Nardi", new Integer[] { 5, 14, 27, 42, 51, 59 });

		megasena.addBet("Vinicius", new Integer[] { 5, 21, 43, 46, 47, 50 });
		megasena.addBet("Vinicius", new Integer[] { 32, 33, 40, 47, 59, 60 });

		megasena.addBet("Messias", new Integer[] { 12, 15, 32, 43, 47, 55 });
		megasena.addBet("Messias", new Integer[] { 2, 26, 31, 40, 41, 51 });

		megasena.addBet("Gambi", new Integer[] { 3, 8, 13, 23, 49, 60 });
		megasena.addBet("Gambi", new Integer[] { 7, 26, 36, 41, 55, 57 });

		megasena.addBet("Cabeção", new Integer[] { 35, 36, 41, 47, 48, 58 });
		megasena.addBet("Cabeção", new Integer[] { 2, 24, 31, 47, 51, 59 });

		megasena.addBet("Delinha", new Integer[] { 2, 07, 9, 13, 17, 55 });
		megasena.addBet("Delinha", new Integer[] { 1, 4, 7, 10, 32, 60 });

		megasena.addBet("Abe", new Integer[] { 2, 6, 17, 21, 34, 45, 57 });
		megasena.addBet("Abe", new Integer[] { 4, 11, 19, 27, 35, 42, 51 });

		megasena.addBet("Maykon", new Integer[] { 11, 31, 35, 49, 57, 58 });
		megasena.addBet("Maykon", new Integer[] { 1, 5, 15, 21, 55, 60 });

		megasena.getResults();
	}

	
	
	@Test
	public void testGetResults_20101006()
	{
		Megasena megasena = new Megasena();
		megasena.setAllottedNumbers(new Integer[] { 5, 15, 43, 48, 52, 55 });

		megasena.addBet("Adriano", new Integer[] { 1, 2, 9, 13, 17, 18 });
		megasena.addBet("Adriano", new Integer[] { 2, 18, 36, 42, 50, 60 });
		
		megasena.addBet("André Endo", new Integer[] { 6, 9, 29, 36, 52, 57 });
		
		megasena.addBet("Arineiza", new Integer[] { 4, 12, 18, 25, 37, 44 });

		megasena.addBet("Bruno", new Integer[] { 1, 15, 34, 39, 41, 45 });
		megasena.addBet("Bruno", new Integer[] { 3, 18, 25, 33, 57, 60 });
		
		megasena.addBet("Fabiano", new Integer[] { 2, 27, 42, 43, 50, 60 });

		megasena.addBet("Lucas", new Integer[] { 5, 9, 25, 30, 41, 58 });
		
		megasena.addBet("Marcão", new Integer[] { 2, 8, 12, 23, 27, 31 });
		megasena.addBet("Marcão", new Integer[] { 19, 23, 30, 32, 56, 60 });

		megasena.addBet("Maykon", new Integer[] { 3, 15, 33, 37, 49, 53 });

		megasena.addBet("Vânia", new Integer[] { 3, 7, 24, 27, 43, 49 });

		megasena.getResults();
	}

}
