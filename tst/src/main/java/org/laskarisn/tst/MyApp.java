package org.laskarisn.tst;

import java.util.Date;
import java.util.Random;
import java.util.stream.IntStream;

public class MyApp {

	
	public static void main (String [] args) {
		double res = IntStream.range(1, new Random(new Date().getTime()).nextInt(100)).mapToDouble(i->(double)i).map(i -> i * i).reduce((i,j)-> { return j/i;}).getAsDouble();
		System.out.println(res);
	}
	
	
}
