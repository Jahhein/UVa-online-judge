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

/*Particle has initial velocity and acceleration.
* if velocity over time (t) is (v), then what will it's displacement be in twice of
* that time?*/

/* The input will contain two integers in each line.
* Each line makes one set of input.
* These two integers denote the value of v(-100<=v<=100) and t(0<=t<=200)
* (t means at the time the particle gains that velocity.*/

/* for each line of input, print a single integer in one line denoting the
* displacement in double of that time. */
class Main {
/*TODO 10071 - Back to High School Physics*/
public static void main(String args[]) {
  Scanner input=new Scanner(System.in);
  while (input.hasNext()) {
    /* first int = v, second = t.*/
    int v=input.nextInt();
    int t=input.nextInt();
    if ((v>=-100&&v<=100)&&(t>=0&&t<=200)) {
      System.out.println(v*t*2);
    }
    
  }

}
}