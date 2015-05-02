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

import java.util.*;

/**
 * Created by JacobHein on 3/9/15.
 */
public class TestTwo {
public static void main(String args[]) {
  Scanner input=new Scanner(System.in);
  while (input.hasNextInt()) {
    int n=input.nextInt();
    int x=input.nextInt();
    if ((x>0&&x<1_000_000)&&(n>0&&n<1_000_000)) {
      if (n>x) {

      }
      if (x>n) {
        List array1=Arrays.asList(x);
      }
    }
  }
}

public static int cycle(int n,int x) {

  int counter=0;
  int finalC=0;
  /*for int i=n, and i is greater than x, decrement x.*/
  for (int i=x;i<=n;i++) {
    if (i>1) {
      if (i%2==0) {
        i=(i/2);
        counter++;
      }
      if (!(i%2==0)) {
        i=(3*i+1);
        counter++;
      }
    } /*end if*/
    if (i==1) {
      counter++;
    }
    if (counter>finalC) {
      finalC=counter;
    }
  } /*for end*/
  return finalC;
} /*cycle end*/

public static Set removeDupes(int[] s) {
  Set<Integer> set=new HashSet<Integer>();
  for (int i=0;i<s.length;++i) {
    set.add(s[i]);
  }//endFori
  return set;
}//endMethod
} /*end main*/

