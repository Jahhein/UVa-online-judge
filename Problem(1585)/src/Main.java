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

  while (input.hasNextLine()&&x!=0) {
    str=input.next();
    System.out.println(cycle(str));
    x--;
  }
  input.close();
}

public static int cycle(String str) {
  int l=str.length(), result=0, x=1;
  boolean toggle=false;
  for (int u=0;u<l;u++) {
    if (!toggle&&(str.charAt(u)=='O'||str.charAt(u)=='o')) {
      toggle=true;
    } else if (toggle&&(str.charAt(u)=='X'||str.charAt(u)=='x')) {
      toggle=false;
      x=1;
    }
    if (toggle) {
      result+=x;
      x++;
    }
  }/*end for*/
  return result;
}
}
