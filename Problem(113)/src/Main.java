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
 * Created by JacobHein on 3/10/15.
 */

import java.util.Scanner;

/* given an int n>=1 and an int p>=1 write a program that determines the n√p, the
positive nTH root of p.*/
/*Input: consists of a sequence of integer pairs n and p with each int on a line
by itself. for all such pairs 1<=n<=200, 1<=p<=10^101, and there exists and int k,
 1<=k<=10^9 such that k^n=p*/
class Main {
/*TODO 113- Power of Cryptography*/
public static void main(String args[]) {
  Scanner input=new Scanner(System.in);
  while (input.hasNext()) {
    double x=input.nextDouble();
    double y=input.nextDouble();

    System.out.format("%.0f\n",Math.pow(y,1/x));

    //y.pow(1/x);
    //System.out.println(y.pow(1/x));

  }/* end while*/
}
}
