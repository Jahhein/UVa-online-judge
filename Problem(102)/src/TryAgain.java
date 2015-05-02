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
 * Created by JacobHein on 4/28/15.
 */

 import java.util.Scanner;

public class TryAgain {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  char[] types={'B','G','C'};
  int[][] perms={{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}};
  int[][] xBottles= new int[3][3];

  while (input.hasNext()) {
    int min=-1;
    String str1="", str2="";
    for(int u=0;u<3;u++) {
      for(int t=0;t<3;t++) {
        xBottles[u][t]=input.nextInt();
      }
    }/*end for u*/

    for(int u=0;u<perms.length;u++) {
      int cnt=0;
      for(int t=0;t<3;t++) {
        for(int v=0;v<3;v++) {

        }
      }
    }

  }/*end while.hasNext*/
}/*end args*/
}/*end class*/
