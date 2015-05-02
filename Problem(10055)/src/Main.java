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
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  while (input.hasNext()) {
    long h=input.nextLong();
    long e=input.nextLong();
    if (h>e)
      System.out.println(h-e);
    else
      System.out.println(e-h);
  } /* end while */

}
}
