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
/*TODO Primary Arithmetic
* For each line of input except the last (0,0), you should compute and print the number
*  of carry operations that would result from adding the two numbers. In the event 0 0
*  is entered, close program.*/
/*Input: each line of input contains two UNSIGNED integers less than 10 digits. The
last line of input contains '0 0'.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  while (input.hasNext()) {
    int x=input.nextInt();
    int y=input.nextInt();
    if (x==0&&y==0) {
      break;
    }
    sout(cycle(x,y));
  }/*end while*/
}/*end args*/

/**
 * +
 * TODO Cycle
 * Determines the number of carry operations adding two long values (x and y).
 * @param x
 * @param y
 * @return returns a long value of the number of carry operations.
 */
public static int cycle(int x,int y) {
  int result=0, rem=0;
  while (x>0||y>0) {
    int xR=x%10, yR=y%10;

    if ((xR+yR+rem)>=10) {
      result++;
      rem=1;
      /*the carry over for next calculation*/
    } else {
      rem=0;
      /*if we didn't have a carry, set rem back to 0*/
    }
    x=x/10;
    y=y/10;
  }
  return result;
}/*end cycle*/

/**
 * +
 * TODO sout
 * Determines the console print out for the given amount of carry operations.
 * @param cnt
 */
public static void sout(int cnt) {
  if (cnt==0) {
    System.out.println("No carry operation.");
  } else if (cnt==1) {
    System.out.println("1 carry operation.");
  } else {
    System.out.println(cnt+" carry operations.");
  }
}/*end sout*/
}/*end Main class*/
