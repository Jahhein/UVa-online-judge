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

import java.util.Scanner;

class Main {
/* TODO Ecological Premium
 first line of input contains a single pos int N(<20), the num of test cases
 No input greater than 100,000 or less than 0. Wait for 3 lines of input, 3rd has 3
 ints.*/
public static void main(String args[]) {
  Scanner input=new Scanner(System.in);

  long u=input.nextLong(); // test cases
  while (u--!=0) {
    long result=0, farmers=input.nextLong();

    while (farmers--!=0) {
      long land=input.nextLong(),x=input.nextLong(), env=input.nextLong();
      result+=land*env;
      //x isn't used.
    }
    System.out.println(result); // print results

  }/*end u!=0 while*/
}/*end args*/
}/*end class*/
