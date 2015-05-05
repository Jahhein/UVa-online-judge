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
/*TODO 10018 - Reverse and Add*/
/*TODO Reverse and Add
* Choose a number, reverse its digits and add it to the original. If the sum is NOT a
* palindrome (which means, it is not the same number from left to right and right to
* left), repeat this procedure.
* ex; 195 should result in 9339*/
/*TODO Output
*   Display the amount of additions needed to find a palindrome, followed by the
*   palindrome. ex; Input: "195" Output: "4 9339"*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  int u=input.nextInt();
  /*Test case input*/
  while (u>0) {
    int cycleCnt=0;
    /*set cycleCnt to 0, resets after each run.*/
    long x=input.nextLong();

    /*Check for palindrome first, don't assume immediately it won't already be one.*/
    while (!palindrome(x)) {
      x=x+reverse(x);
      cycleCnt++;
    }
    System.out.println(cycleCnt+" "+x);
    /*print out cycleCnt, followed by the palindrome found*/

    u--;
    /*decrement our test case number*/
  }
}

/**
 * +
 * TODO Palindrome
 * Checks current number for palindrome possibility. Starting from the first character
 * of string xStr (long x), we compare it to the last. If we find a point where it is
 * not the same, result is false and we immediately break for program performance/speed.
 * +*Note: We only need to check halfway for it to be a mirrored image.*+
 * @param x
 * @return true if palindrome, false otherwise.
 */
public static boolean palindrome(long x) {
  boolean result=true;
  String xStr=Long.toString(x);
  int l=xStr.length();

  for (int u=0;u<l;u++) {
    if (!(xStr.charAt(u)==xStr.charAt(l-1))) {
      result=false;
      break;
    }
    l--;/*decrement, only need to check halfway*/
  }
  return result;
}

/**
 * +
 * TODO Reverse
 * The reverse method obtains the reverse of the current number by setting result to be
 * 0, finding the remainder of x%10, and setting result=to result multiplied by 10
 * (which later will not be 0), and adding the remainder to result. Divide x by 10 to
 * give us a decimal point, (ex; 123/10=12.3), and the nature of an int will remove
 * the decimal. Int x would then become 12. Repeat until x is 0.
 * @param x
 * @return the reverse of x.
 */
public static long reverse(long x) {
  long result=0;
  while (x>0) {
    result=result*10+x%10;
    x=x/10;
  }
  return result;
}
}
