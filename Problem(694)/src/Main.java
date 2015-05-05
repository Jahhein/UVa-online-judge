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
 * Created by JacobHein on 4/4/15.
 */

import java.util.Scanner;

class Main {
/*TODO 694 - The Collatz Sequence*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  int c=0;

  while (input.hasNext()) {
    long x=input.nextLong();
    long y=input.nextLong();
    long cnt=0, X=x;
    if (x>0&&y>0) {
      c++;
      while (x!=1&&x<=y) {
        cnt++;
        if (x%2==0) {
          x=x/2;
        } else {
          x=3*x+1;
        }
      }/*end !=1 while*/
      if (x==1) {
        cnt++;
        System.out.println("Case "+c+": A = "+X+", limit = "+y+", number of terms = "+
          ""+cnt);
      } else if (x>=y) {
        System.out.println("Case "+c+": A = "+X+", limit = "+y+", number of terms = "+
          ""+cnt);
      }
    } else {
      break;
    }
  }/*end while*/
  input.close();
}/*end main*/
}
