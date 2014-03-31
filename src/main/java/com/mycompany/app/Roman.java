package com.mycompany.app;

/**
 *
 * @author Alex
 *
 */
public class Roman {

	/**
	 * fonction decode
	 * @param nbRomain
	 * @return un int
	 */
	public final int decode(final String nbRomain) {
		int nbArabe = 0;
		char prec = ' ';

		for (int i = 0; i < nbRomain.length(); ++i) {
			if (nbRomain.charAt(i) == 'I') {
				nbArabe += 1;
			}
			else if (nbRomain.charAt(i) == 'V' && prec == 'I') {
				nbArabe += 5 - 2;
			}
			else if (nbRomain.charAt(i) == 'V') {
				nbArabe += 5;
			}
			else if (nbRomain.charAt(i) == 'X' && prec == 'I') {
				nbArabe += 10 - 2;
			}
			else if (nbRomain.charAt(i) == 'X') {
				nbArabe += 10;
			}
			else if (nbRomain.charAt(i) == 'L' && prec == 'X') {
				nbArabe += 50 - 20;
			}
			else if (nbRomain.charAt(i) == 'L') {
				nbArabe += 50;
			}
			else if (nbRomain.charAt(i) == 'C' && prec == 'X') {
				nbArabe += 100 - 20;
			}
			else if (nbRomain.charAt(i) == 'C') {
				nbArabe += 100;
			}
			else if (nbRomain.charAt(i) == 'D' && prec == 'C') {
				nbArabe += 500 - 200;
			}
			else if (nbRomain.charAt(i) == 'D') {
				nbArabe += 500;
			}
			else if (nbRomain.charAt(i) == 'M' && prec == 'C') {
				nbArabe += 1000 - 200;
			}
			else if (nbRomain.charAt(i) == 'M') {
				nbArabe += 1000;
			}

			prec = nbRomain.charAt(i);
		}

		return nbArabe;
	}

}
