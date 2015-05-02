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
 * Created by JacobHein on 3/9/15.
 */

import java.util.*;

class Main {
public static void main(String args[]) {
  Scanner input=new Scanner(System.in);
  while (input.hasNextInt()) {
    int x=input.nextInt();
    int y=input.nextInt();
    if (x>=y) {
      int arraySize=(x-y)+1;
      int i=y;
      int[] nArray;
      nArray=new int[arraySize];
      for (int c=0;c<nArray.length;c=c+1) {        /* Assign variables to array. */
        nArray[c]=i;
        i++;
      } // end for
      System.out.println(x+" "+y+" "+cycle(nArray));
    } /* end x>y if */
    if (y>x) {
      int arraySize=(y-x)+1;
      int i=x;
      int[] nArray;
      nArray=new int[arraySize];
      for (int c=0;c<nArray.length;c++) {        /* Assign variables to array. */
        nArray[c]=i;
        i++;
      } // end for
      System.out.println(x+" "+y+" "+cycle(nArray));
    } /* end y>x if */

  } /* end input while */
} /* end main string */

public static int cycle(int[] nArray) {       /* array parameter */
  int cycleCount=0;

  for (int z : nArray) {   /* Loop each array element for counter.*/
    //System.out.println(z);
    int tempCount=1;
    do {
      if (z!=1&&(z%2)==0) {
        z=(z/2);
        //System.out.println(z);
        tempCount++;
      } else if (z!=1) {
        z=((3*z)+1);
        //System.out.println(z);
        tempCount++;
      }
    } while (z>1); /* end while */

    if (tempCount>cycleCount) {
      cycleCount=tempCount;
    }
    //System.out.println(z);

  } /* end for loop*/
  return cycleCount;

} /* end cycle */
}/* end class*/