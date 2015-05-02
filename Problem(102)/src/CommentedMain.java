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

public class CommentedMain {
/*Three bottle color categories: Brown, green, clear.*/
/* problem: Minimize the number of bottles that are moved. may assume that the only
problem is to minimize the number of movements between boxes.*/
/*Each bin has infinite capacity, and the only constraint is moving the bottles so that
 each bin contains bottles of a single color.*/
/*TODO Input:*/
/*Series of lines with 9 integers.
*   First 3 ints: the number of brown, green, an clear bottles in bin #1.
*   Second 3 ints: the number of brown, green, and clear bottles in bin #2.
*   Last 3 ints: the number of brown ,green, and clear botttles in bin #3.
*   ex; 10 15 20 30 12 8 15 8 31
*     12 clear bottles in bin 1, 21 green in bin 2, and 15 brown in bin 3.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  /*types of bottles: brown, green, clear*/
  char[] bottleType={'B','G','C'};

  /*all 6 possible permutations of bottle type-to-bin mappings*/
  int[][] permutations={{0,1,2},{0,2,1},{1,0,2},{1,2,0},{2,0,1},{2,1,0}};

  /*bottles[i][j] are the number of type j bottles in bin i*/
  int[][] bottles=new int[4][4];

  /*while there is a test case left*/
  while (input.hasNextInt()) {

    /*the minimum bottle move-count so far, initially -1 to indicate that we haven't
    found anything yet*/
    int minCount=-1;

    /*the string representation of the permutation with the minimum bottle move-count
    so far*/
    String minPerm="";

    /*read in the bottle counts*/
    for (int i=0;i<3;i++) {
      for (int j=0;j<3;j++) {
        bottles[i][j]=input.nextInt();
      }
    }

    /*loop through each permutation*/
    for (int i=0;i<permutations.length;i++) {

      /*count how many bottles need to be moved*/
      int curCount=0;

      /*j is the current bin, and permutations[i][j] is the bottle-type that we want in
       that bin*/
      for (int j=0;j<3;j++) {

        /*go through all each bottle-type k*/
        for (int k=0;k<3;k++) {

          /*if the current bottle type is not supposed to be in the current bin*/
          if (permutations[i][j]!=k) {

            /*then we need to move them, and we're counting how many we need to move*/
            curCount+=bottles[j][k];
          }
        }
      }

      /*the string representing the current permutation, example: "GCB"*/
      String curPerm=""+bottleType[permutations[i][0]]+bottleType[permutations[i][1]]+bottleType[permutations[i][2]];

      /*if this is the first permutation we try, or if the current bottle move-count
      is less than the minimum bottle move-count,
      or the current bottle move-count is equal to the minimum bottle move-count and
      the permutation string is less than the
      permutation string of the minimum bottle move-count*/
      if (minCount==-1||curCount<minCount||(curCount==minCount&&curPerm.compareTo(minPerm)<0)) {
        /*then this is the best permutation so far*/
        minCount=curCount;
        minPerm=curPerm;
      }
    }
    /*print the minimum bottle move-count and the permutation string*/
    System.out.println((minPerm+" "+minCount));
  }/*end while in.hasNext*/
}/*end args*/
}/*end Main*/