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
 * Created by JacobHein on 4/5/15.
 */

import java.util.*;

class Main {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  while (input.hasNext()) {
    long cnt=0;
    String temp=input.nextLine();
    temp=temp.toLowerCase();
    /*save time, change everything to lowercase for eval*/
    temp = temp.replaceAll("[^a-z]"," ");
    /* replace everything not an alphabetic character with a space*/
    temp=temp.trim();
    /*trim left and right white space*/
    String[] sArray = temp.split(" ");
    /* split string into an array at each space*/
    for (String x : sArray) {
      if (x.matches(".*[a-z].*")) { // check if each array element contains a letter
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
}