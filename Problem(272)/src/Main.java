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
 * Created by JacobHein on 4/23/15.
 */

import java.util.Scanner;

class Main {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  String str=""; /*input capture*/
  int l=0;/*str length*/
  int cnt=0;/*counter variable*/

  while (input.hasNext()) {
    cnt=0;
    str=input.nextLine();
    l=str.length();
    for (int u=0;(u<l);u++) {
      if (str.charAt(u)==('"')&&(cnt%2==0)) {
        str=str.replaceFirst("\"","``");
        cnt++;
      }
      if (str.charAt(u)==('"')&&(cnt%2==1)) {
        str=str.replaceFirst("\"","\'\'");
        cnt++;
      }
    }/*end for*/
    System.out.println(str);
  }
}
}
