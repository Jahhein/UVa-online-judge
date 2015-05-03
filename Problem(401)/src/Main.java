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
/*
" -- is not a palindrome," if the string is not a palindrome and is not a mirrored string
" -- is a regular palindrome." if the string is a palindrome and is not a mirrored string
" -- is a mirrored string." if the string is not a palindrome and is a mirrored string
" -- is a mirrored palindrome." if the string is a palindrome and is a mirrored string.
*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  while (input.hasNextLine()) {
    String str1=input.nextLine();
    String str2=str1.toUpperCase(), rev=reverse(str2);

    if (mirroredPalin(str2,rev)) {
      System.out.println(str1+" -- is a mirrored palindrome.");

    } else if (mirroredStr(str2)) {
      System.out.println(str1+" -- is a mirrored string.");

    } else if (regularPalin(str2,rev)) {
      System.out.println(str1+" -- is a regular palindrome.");

    } else {
      System.out.println(str1+" -- is not a palindrome.");
    }

    System.out.println();/*empty line after results*/
  }/*end input.hasNextLine()*/
}/*end main*/

/**
 * +
 * A regular palindrome is a String that is the same back and forth.
 * ex; racecar = racecar
 * @param str
 * @return
 */
public static String reverse(String str) { // reverse string
  String rev="";
  int l=str.length()-1;

  for (int c=l;c>=0;c--) {
    rev+=str.charAt(c);
  }
  return rev;
}

/**
 * +
 * Declares if String str, and rev are the same backwards and forwards.
 * @param str
 * @param rev
 * @return
 */
public static boolean regularPalin(String str,String rev) {
  boolean result=true;

  if (!str.equalsIgnoreCase(rev)) {
    result=false;
  }

  return result;
}

/**
 * +
 * A=A
 * E=3  * 3=E
 * H=H
 * I=I
 * J=L
 * L=J
 * M=M
 * O=O
 * T=T
 * U=U
 * V=V
 * W=W
 * X=X
 * Y=Y
 * Z=5  * 5=Z
 * 1=1
 * 2=S
 * 8=8
 * ALL OTHERS HAVE NO REVERSE!
 * @param str
 * @return
 */
public static boolean mirroredStr(String str) {
  boolean result=true;
  int l=str.length()-1, lh=l/2;

  forU:
  for (int u=0;(u!=lh);u++) {
    char x=str.charAt(u), y=str.charAt(l);
    if (!charComp(x,y)) {
      result=false;
      break forU;
    }
    l--;
  }/*end forU*/

  return result;
}

/**
 * +
 * A string is a Mirrored string(characters) and reversed.
 * ex; ATOYOTA is a mirrored palindrome because A=A, etc.
 * @param str
 * @param rev
 * @return
 */
public static boolean mirroredPalin(String str,String rev) {
  boolean result=false;
  if (regularPalin(str,rev)&&(mirroredStr(str))) {
    result=true;
  }
  return result;
}

public static boolean charComp(char x,char y) {

  switch (x) {
    case 'A':
      if (y!='A') {
        return false;
      }
      break;

    case 'E':
      if (y!='3'&&y!='E') {
        return false;
      }
      break;

    case 'H':
      if (y!='H') {
        return false;
      }
      break;

    case 'I':
      if (y!='I') {
        return false;
      }
      break;

    case 'J':
      if (y!='L'&&y!='J') {
        return false;
      }
      break;

    case 'L':
      if (y!='J'&&y!='L') {
        return false;
      }
      break;

    case 'M':
      if (y!='M') {
        return false;
      }
      break;

    case 'O':
      if (y!='O') {
        return false;
      }
      break;

    case 'T':
      if (y!='T') {
        return false;
      }
      break;

    case 'U':
      if (y!='U') {
        return false;
      }
      break;

    case 'V':
      if (y!='V') {
        return false;
      }
      break;

    case 'W':
      if (y!='W') {
        return false;
      }
      break;

    case 'X':
      if (y!='X') {
        return false;
      }
      break;

    case 'Y':
      if (y!='Y') {
        return false;
      }
      break;

    case 'Z':
      if (y!='5'&&y!='Z') {
        return false;
      }
      break;

    case '1':
      if (y!='1') {
        return false;
      }
      break;

    case '2':
      if (y!='S'&&y!='2') {
        return false;
      }
      break;

    case '3':
      if (y!='E'&&y!='3') {
        return false;
      }
      break;

    case '5':
      if (y!='Z'&&y!='5') {
        return false;
      }
      break;

    case '8':
      if (y!='8') {
        return false;
      }
      break;
    default:
      return false;

  }/*end switch*/
  return true;
}
}

