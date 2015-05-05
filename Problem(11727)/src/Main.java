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
 * Created by JacobHein on 4/21/15.
 */

import java.util.Scanner;

class Main {
/*TODO 11727 - Cost Cutting
* Given 3 employee wages, find the 2 that will be laid off.
* The highest and lowest wage are cut.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  long u=input.nextLong();
  int cnt=1;
  while (u>0) {
    long x=input.nextLong();
    long y=input.nextLong();
    long z=input.nextLong();

    if ((x>y&&x<z)||(x>z&&x<y)) {
      System.out.println("Case "+cnt+": "+x);
    }
    if ((y>x&&y<z)||(y>z&&y<x)) {
      System.out.println("Case "+cnt+": "+y);
    }
    if ((z>x&&z<y)||(z>y&&z<x)) {
      System.out.println("Case "+cnt+": "+z);
    }
    cnt++;
    u--;
  }
  input.close();
}
}
