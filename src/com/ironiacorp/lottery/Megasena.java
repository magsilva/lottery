package com.ironiacorp.lottery;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Megasena
{
	private Set<Integer> allottedNumbers;
	
	private Map<String, List<Set<Integer>>> bets;
	
	public Megasena()
	{
		allottedNumbers = new HashSet<Integer>();
		bets = new HashMap<String, List<Set<Integer>>>();
	}
	
	public void addBet(String name, Integer... numbers)
	{
		addBet(name, toSet(numbers));
	}
	
	public void addBet(String name, Set<Integer> numbers)
	{
		if (name == null) {
			throw new IllegalArgumentException();
		}
		
		List<Set<Integer>> nameBets = null;
		if (! bets.containsKey(name)) {
			nameBets = new ArrayList<Set<Integer>>();
			bets.put(name, nameBets);
		}
		
		nameBets = bets.get(name);
		nameBets.add(numbers);
	}
	
	public void setAllottedNumbers(Set<Integer> numbers)
	{
		this.allottedNumbers = numbers;
	}

	public void setAllottedNumbers(Integer... numbers)
	{
		setAllottedNumbers(toSet(numbers));
	}

	
	public void getResults()
	{
		Map<String, List<Set<Integer>>> betResults = new HashMap<String, List<Set<Integer>>>();
		Iterator<String> i = bets.keySet().iterator();
		int maxHits = 0;
		while (i.hasNext()) {
			String name = i.next();
			System.out.print("\n" + name);
			List<Set<Integer>> nameBets = new ArrayList<Set<Integer>>();
			betResults.put(name, nameBets);
			Iterator<Set<Integer>> j = bets.get(name).iterator();
			while (j.hasNext()) {
				Set<Integer> horrayNumbers = new HashSet<Integer>(j.next());
				horrayNumbers.retainAll(allottedNumbers);
				System.out.print("\n\t (" + horrayNumbers.size() + ") --");
				Iterator<Integer> h = horrayNumbers.iterator();
				while (h.hasNext()) {
					System.out.print(h.next() + " ");
				}
				nameBets.add(horrayNumbers);
				if (horrayNumbers.size() > maxHits) {
					maxHits = horrayNumbers.size();
				}
			}
		}
	}
	
	private Set<Integer> toSet(Integer... numbers)
	{
		Set<Integer> set = new HashSet<Integer>();
		for (Integer i : numbers) {
			set.add(i);
		}
		return set;
	}
}
