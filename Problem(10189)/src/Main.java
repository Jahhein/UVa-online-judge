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
/*TODO Minesweeper
* Input will consist of 'n' and 'm' (0<n, m<=100) which stands for the number of lines
* and columns of the field respectively. The next 'n' lines contains exactly 'm'
* characters and represent the field.
*
* Each safe square is represented by an '.' character (without quotes) and each mine
* square is represented by an '*' character (also without quotes). The first field line
*  where n=m=0 represents the end of input and should not be processed.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  while (input.hasNext()) {
    int x=input.nextInt(); /*rows*/
    int y=input.nextInt(); /*columns*/
    String str="";
    if (x==0&&y==0) {
      break;
    } else {
      for (int u=0;u<x;u++) {
        str+=input.next()+" ";
      }
      char[] field=str.toCharArray();
      System.out.println(field);
    }
  }

}
}
