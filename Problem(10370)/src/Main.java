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
 * Created by JacobHein on 5/2/15.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  int t=input.nextInt();
  while (t-->0) {
    double c=input.nextInt();
    double cnt=0;
    forU:/*allocate xRay values*/
    for (int u=0;u<c;u++) {
      int z=input.nextInt();
      if (z>=80) {
        cnt++;
      }
    }
    double result=(cnt/c)*100;
    DecimalFormat strFormat=new DecimalFormat("##.###");
    String str=strFormat.format(result);
    System.out.format("%.3f%%%n",(cnt/c)*100);

  }/*end input.hasNext()*/
}
}
