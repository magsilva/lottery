package com.ironiacorp.lottery;

import static org.junit.Assert.*;

import org.junit.Test;

public class MegasenaTest {

	@Test
	public void testGetResults2012()
	{
		Megasena megasena = new Megasena();
		megasena.setAllottedNumbers(new Integer[] { 33, 14, 52, 36, 32, 41 });

		megasena.addBet("Rodrigo", new Integer[] { 7, 8, 12, 19, 22, 30 });
		megasena.addBet("Rodrigo", new Integer[] { 2, 16, 32, 35, 38, 40 });
		megasena.addBet("Rodrigo", new Integer[] { 10, 11, 35, 45, 46, 52 });
		megasena.addBet("Marco Aurélio", new Integer[] { 13, 21, 27, 33, 45, 51 });
		megasena.addBet("Marco Aurélio", new Integer[] { 7, 11, 13, 18, 24, 37 });
		megasena.addBet("Marco Aurélio", new Integer[] { 4, 10, 18, 22, 23, 30 });
		megasena.addBet("Nerso", new Integer[] { 8, 15, 17, 28, 35, 48 });
		megasena.addBet("Nerso", new Integer[] { 5, 21, 28, 38, 43, 58 });
		megasena.addBet("Nerso", new Integer[] { 9, 18, 31, 38, 51, 57 });
		megasena.addBet("Jorge", new Integer[] { 1, 13, 14, 17, 32, 37 });
		megasena.addBet("Jorge", new Integer[] { 8, 12, 24, 38, 45, 48 });
		megasena.addBet("Jorge", new Integer[] { 8, 10, 19, 40, 46, 54 });
		megasena.addBet("Fabiano", new Integer[] { 1, 11, 21, 31, 41, 51 });
		megasena.addBet("Fabiano", new Integer[] { 2, 4, 8, 16, 32, 60 });
		megasena.addBet("Fabiano", new Integer[] { 1, 2, 3, 5, 7, 34});  // Aposta com 5 números, 34 é o sexto número, era pra ser 11
		megasena.addBet("Endo", new Integer[] { 12, 27, 28, 45, 55, 56 });
		megasena.addBet("Endo", new Integer[] { 2, 9, 25, 29, 37, 60 });
		megasena.addBet("Eno", new Integer[] { 1, 7, 29, 33, 44, 55 });
		megasena.addBet("Adriano", new Integer[] { 1, 2, 3, 4, 5, 6 });
		megasena.addBet("Adriano", new Integer[] { 1, 2, 9, 13, 17, 18 });
		megasena.addBet("Adriano", new Integer[] { 9, 10, 13, 17, 18, 20 });
		megasena.addBet("Bruno", new Integer[] { 1, 7, 16, 27, 45, 53 });
		megasena.addBet("Bruno", new Integer[] { 2, 8, 11, 19, 43, 58  });
		megasena.addBet("Bruno", new Integer[] { 10, 15, 34, 43, 44, 50  });
		megasena.addBet("", new Integer[] { 7, 12, 16, 23, 54, 57 });
		megasena.addBet("", new Integer[] { 2, 15, 19, 27, 43, 59 });
		megasena.addBet("", new Integer[] { 9, 13, 37, 42, 49, 56 });
		megasena.addBet("", new Integer[] { 1, 2, 11, 19, 27, 45 });
		megasena.addBet("", new Integer[] { 5, 23, 27, 48, 50, 54 });
		megasena.addBet("", new Integer[] { 4, 14, 27, 44, 51, 58 });
		megasena.addBet("Gabriel", new Integer[] { 7, 17, 27, 37, 47, 57 });
		megasena.addBet("Gabriel", new Integer[] { 5, 13, 26, 32, 41, 55 }); // Era para ser 27, anotaram 26
		megasena.addBet("Gabriel (corrigido)", new Integer[] { 5, 13, 27, 32, 41, 55 }); // Era para ser 27, anotaram 26
		megasena.addBet("Gabriel", new Integer[] { 7, 21, 32, 45, 47, 56 });
		megasena.addBet("", new Integer[] { 8, 13, 24, 29, 31, 54 });
		megasena.addBet("", new Integer[] { 9, 14, 21, 28, 42, 57 });
		megasena.addBet("", new Integer[] { 7, 23, 30, 36, 51, 60 });
		megasena.addBet("", new Integer[] { 4, 9, 14, 26, 37, 55 });
		megasena.addBet("", new Integer[] { 6, 24, 27, 35, 41, 42 });
		megasena.addBet("", new Integer[] { 2, 23, 28, 37, 45, 59 });
		megasena.addBet("Faimison", new Integer[] { 1, 5, 23, 26, 39, 40 });
		megasena.addBet("Faimison", new Integer[] { 15, 16, 21, 38, 48, 53 });
		megasena.addBet("Faimison", new Integer[] { 9, 14, 25, 28, 42, 49 });
		megasena.addBet("", new Integer[] { 1, 2, 3, 4, 5, 6 });
		megasena.addBet("", new Integer[] { 6, 7, 13, 28, 35, 58 });
		megasena.addBet("", new Integer[] { 3, 11, 14, 22, 48, 58 });
		megasena.addBet("", new Integer[] { 13, 20, 39, 53, 54, 60 });
		megasena.addBet("", new Integer[] { 4, 8, 21, 37, 42, 57 });
		megasena.addBet("", new Integer[] { 10, 21, 27, 45, 49, 51 });
		megasena.addBet("", new Integer[] { 12, 27, 34, 35, 56, 57 });
		megasena.addBet("", new Integer[] { 3, 7, 10, 13, 25, 46 });
		megasena.addBet("", new Integer[] { 11, 16, 17, 24, 39, 55 });
		megasena.addBet("", new Integer[] { 7, 12, 13, 22, 25, 31 });
		megasena.addBet("", new Integer[] { 6, 14, 22, 35, 43, 57 });
		megasena.addBet("", new Integer[] { 2, 6, 14, 28, 33, 35 });
		megasena.addBet("", new Integer[] { 7, 18, 24, 29, 42, 46 });
		megasena.addBet("", new Integer[] { 3, 8, 16, 21, 33, 54 });
		megasena.addBet("", new Integer[] { 6, 20, 23, 27, 31, 44 });
		megasena.addBet("", new Integer[] { 3, 16, 27, 34, 40, 45 });
		megasena.addBet("", new Integer[] { 6, 24, 33, 38, 45, 50 });
		megasena.addBet("", new Integer[] { 5, 10, 16, 23, 26, 27 });
		megasena.addBet("", new Integer[] { 3, 27, 40, 43, 48, 51 });
		megasena.addBet("", new Integer[] { 5, 14, 28, 31, 35, 43 });
		megasena.addBet("", new Integer[] { 10, 15, 28, 33, 55, 47 }); // 5 números? 6 número é 47

		megasena.getResults();
		megasena.getBestResult();
	}



	@Test
	public void testGetResults2011()
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
