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
public static void main(String args[]) {
  Scanner input=new Scanner(System.in);
  while (input.hasNextLine()) {
    String str=input.nextLine();
    str=str.trim();
    String sArray[]=str.split();

    if (!(str.isEmpty())) {
      for (int i=0;i<str.length();i++) {
        int x=0;
        array[x]=(char)(str.charAt(i)-7);
        x++;
      }
      System.out.println(array);
    } else {
      break;
    }
  }
}
}
