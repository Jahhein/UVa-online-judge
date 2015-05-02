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
 * Created by JacobHein on 4/6/15.
 */
 import java.util.Scanner;

class Main {
/*TODO
* Is the input String a regular palindrome, a mirrored string, or a mirrored
*   palindrome?
*   FOUR possible outcomes: Not a palindrome, mirrored string, regular palindrome,
*   mirrored palindrome.*/
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);

    while(input.hasNextLine()) {
      String str=input.nextLine();

      System.out.println(reverse(str));


      System.out.println();//empty line after results
    }
  }/*end main*/

  public static String reverse(String str) { // reverse string
    String rev="";

    for (int c=str.length()-1;c>=0;c--) {
      rev += str.charAt(c);
    }
    return rev;
  }
  public static boolean mirroredPalin(String str, String rev) {
    boolean results = false;
    if (str.equalsIgnoreCase(rev)) {
      results=true;
    }
    return results;
  }
  public static boolean mirroredStr(char x,char y) {

    }
  }
}

