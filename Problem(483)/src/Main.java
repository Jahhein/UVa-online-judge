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
 * Created by JacobHein on 5/1/15.
 */

import java.util.Scanner;

class Main {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  while (input.hasNext()) {
    String str=input.nextLine();

    System.out.println(reverse(str));
  }/*end hasNext()*/
}/*end main*/
public static String reverse(String str) {
  String result="";
  String[] sRay=str.split(" ");

  for(String u: sRay) {
    u=" "+u;
    int l=u.length();

    while(l>0) {
      result+=u.substring(l-1,l--);
    }
  }
  return result.trim();
}/*end reverse*/
}/*end args*/
