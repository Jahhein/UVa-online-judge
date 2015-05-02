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
 * Created by JacobHein on 4/20/15.
 */

import java.util.Scanner;

class Main {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  String str="";
  int x=input.nextInt();

  while (input.hasNext()&&x!=0) {
    System.out.println(cycle(input.next()));

    x--;
  }
}

public static double cycle(String str) {
  int l=str.length();
  String x="1";
  double result=0;
  for (int u=0;u<l;u++) {
    if (Character.isAlphabetic(str.charAt(u))) {
      if (u+1!=l) {
        while (Character.isDigit(str.charAt(u+1))) {
          x+=Character.toString(str.charAt(u+1));
          u++;
        }
      }/*end u+1!=l*/
      switch (str.charAt(u)) {
        case 'C':
          result+=12.01*Integer.parseInt(x);
        case 'H':
          result+=1.008*Integer.parseInt(x);
        case 'O':
          result+=16.00*Integer.parseInt(x);
        case 'N':
          result+=14.01*Integer.parseInt(x);
      }/*end switch*/
      x="";
    }/*end if alphabetic*/
  }/*end for*/

  return result;
}

public static double cycle2(String str) {
  int l=str.length()-1, u=1, x=1;
  double result=0;
  while (u!=l) {
    if(Character.isDigit(str.charAt(u+1))) {
     x=Integer.parseInt(str.charAt(u++));
    }
    switch (str.charAt(u)) {
      case 'C':
        result+=12.01*x;
      case 'H':
        result+=1.008*x;
      case 'O':
        result+=16.00*x;
      case 'N':
        result+=14.01*x;
    }/*end switch*/
  }

  return result;
}
}
