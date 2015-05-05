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
/*TODO 11498 Division of Nlogonia
* */

public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  long u;
  do {
    u=input.nextLong();/*Test cases*/
    if (u==0) {
      break;
    }
    long x=input.nextLong();/*x-coordinate (origin)*/
    long y=input.nextLong();/*y-coordinate (origin)*/

    for (int c=0;c<u;c++) {
      long xL=input.nextLong();/*x-location*/
      long yL=input.nextLong();/*y-location*/

    /*yL>y means north, yL<y means south*/
    /*xL>x means east, xL<x means west*/
      if (xL!=x&&yL!=y) {
        if (xL>x&&yL>y) {
          System.out.println("NE");
        } else if (xL>x&&yL<y) {
          System.out.println("SE");
        } else if (xL<x&&yL>y) {
          System.out.println("NO");
        } else if (xL<x&&yL<y) {
          System.out.println("SO");
        }
      } else {
        System.out.println("divisa");
      }

    }
  } while (u!=0);
  input.close();
}
}
