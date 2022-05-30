package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NumberofCoins1 {

	public static void main(String[] args) {
		List<Integer> coins = Arrays.asList(1,2,3);
		int amount = 3;
		numberofCoins(coins, amount);
	}

	public static int numberofCoins(List<Integer> coins, int amount) {

		int numberofCoins = 0;
		int coinsSize = coins.size();
		if (!(amount >= coins.get(0))) //Assumption list is sorted
			return numberofCoins = -1;

		
		while (amount < coins.get(coinsSize - 1)) {
			coinsSize--;
		}

		while (amount > 0) {
			amount = amount - coins.get(coinsSize - 1);
			while (amount < coins.get(coinsSize - 1) && coinsSize - 1 > 0) {
				coinsSize--;
			}
			if (amount < 0)
				return numberofCoins = -1;
			numberofCoins++;
		}
		return numberofCoins;
	}
}
