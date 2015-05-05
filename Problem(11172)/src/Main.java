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
/*TODO 11172 - Relational Operator
* Figure out: 1) First one is great than the second. 2) First one is less than the
* second, or 3) First and second are equal.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  long u=input.nextInt();
  /*test case count*/
  while (u>0) {
    long x=input.nextLong();
    long y=input.nextLong();

    if (x>y) {
      System.out.println(">");
    } else if (x<y) {
      System.out.println("<");
    } else if (x==y) {
      System.out.println("=");
    }
    u--;
  }
  input.close();
}
}
