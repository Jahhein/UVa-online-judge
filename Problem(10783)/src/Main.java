/*
 *
 *  * Copyright (C) 2015-1016. Jacob Alan Hein. All Rights Reserved.
 *  *
 *  * This file is part of {project}.
 *  *
 *  * This source code can not be copied and/or distributed without the express
 *  * permission of Jacob Alan Hein
 * /
 */

/**
 * Created by JacobHein on 4/26/15.
 */

import java.util.Scanner;

class Main {
/*TODO Odd Sum
* Input: First line is number of test cases, followed by T test cases. Each test case
* consists of 2 integers 'a' and 'b' (0<=a<=b<=100) in two separate lines.*/
/*Output: print out one line of output - the serial number of the test case followed by
 the summation of the odd integers in the range [a,b] inclusive.
 ex; [3,9] is 3+5+7+9=24. "Case 1: 24"*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  int cnt=1;
  long u=input.nextLong();
  /*Test case input*/

  while (u>0) {
    long x=input.nextLong();
    long y=input.nextLong();

    System.out.println("Case "+cnt+": "+cycle(x,y));
    cnt++;
    u--;
  }
}

/**+
 * TODO Cycle
 * Accepts x and y to find the summation of all odd integers in the range of [x,y]
 * inclusive.
 * @param x
 * @param y
 * @return the summation of the odd integers in the range [x,y] inclusive.
 */
public static long cycle(long x, long y) {
  long result=0;
  for (long u=x;u<=y;u++) {
    if(u%2==1) {
      result+=u;
    }
  }
  return result;
}
}


