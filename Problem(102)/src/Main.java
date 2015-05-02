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
/*Three bottle color categories: Brown, green, clear.*/
/* problem: Minimize the number of bottles that are moved. may assume that the only
problem is to minimize the number of movements between boxes.*/
/*Each bin has infinite capacity, and the only constraint is moving the bottles so that
 each bin contains bottles of a single color.*/
/*TODO Input:*/
/*Series of lines with 9 integers.
*   First 3 ints: the number of brown, green, an clear bottles in bin #1.
*   Second 3 ints: the number of brown, green, and clear bottles in bin #2.
*   Last 3 ints: the number of brown ,green, and clear bottles in bin #3.
*   ex; 10 15 20 30 12 8 15 8 31
*     12 clear bottles in bin 1, 21 green in bin 2, and 15 brown in bin 3.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  char[] colType={'B','G','C'}; /*Character outcome array: brown, green, clear*/
  int[][] perms={{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}};/*outcome permutations*/
  int[][] xBottles=new int[4][4];/*input array*/

  while (input.hasNextInt()) {
    int minCnt=-1;/*Minimum counter*/
    String str1="", str2=""; /*outcome String variables*/

    forU: /*Input sequence into 2D array, index location: Row*/
    for (int u=0;u<3;u++) {
      forT: /*Input sequence index location: Column*/
      for (int t=0;t<3;t++) {
        xBottles[u][t]=input.nextInt();
      }/*end forT*/
    }/*end forU*/

    forU: /*Sequence checking our cnt counter for minimum movements*/
    for (int u=0;u<perms.length;u++) {
      int cnt=0; /*counter variable*/
      forT:/*Bin location loop*/
      for (int t=0;t<3;t++) {
        forC:/*Bottles in bin*/
        for (int c=0;c<3;c++) {
          if (perms[u][t]!=c) { /*if wrong*/
            cnt+=xBottles[t][c];
          }/*end if*/
        }/*end forC*/
      }/*end forT*/

      /*Possible outcome string*/
      /*perms[u][0] is the index position of perms at row[value of u] column[0];*/
      /*colType[perms[u][0]] means the index of the value of perms. (0-2)*/
      /*Indexes start at 0. 0='B', 1='G', 2='C'. */
      str2=""+colType[perms[u][0]]+colType[perms[u][1]]+colType[perms[u][2]];

      /*If minCnt is -1 or cnt<minCnt or (cnt=minCnt and str2 and str1 are the same)*/
      if (minCnt==-1||cnt<minCnt||(cnt==minCnt&&str2.compareTo(str1)<0)) {
        minCnt=cnt; /*minCnt is now the same value as cnt*/
        str1=str2;  /*str1 is now the same as str2.*/
      }
    }/*end forU*/
    System.out.println(str1+" "+minCnt);

  }/*end while input.NextInt()*/
}/*end static void main*/
}/*end class*/