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
 * Created by JacobHein on 4/22/15.
 */

import java.util.*;

class Main {
/*TODO Jolly Jumpers
* Determine if the series of numbers is a Jolly Jumper.
*   Meaning: if x-y is equal to any other number in the series, and holds true for all
*   variations, it is a jolly jumper.*/
/*OUTPUT: "Jolly", or "Not jolly"*/
/*States n<=3000
*   Issues: less than can also contain negative numbers.*/
public static void main(String[] args) {
  Scanner input=new Scanner(System.in);

  forWHN: /*input*/
  while (input.hasNextInt()) {
    int x=input.nextInt(), cnt=1;
    boolean toggle=true;
    ArrayList<Integer> xRay=new ArrayList<>();

    if (x>1) {
      int y=input.nextInt();
      forU:/*allocate to xRay*/
      for (int u=0;(u<x-1);u++) {
        int z=input.nextInt();
        int result=Math.abs(y-z);
        if (xRay.contains(result)||result>=x||result<=0) {
          toggle=false;
        }
        xRay.add(result);
        y=z;
      }/*end forU*/
      Collections.sort(xRay);

      if (toggle) {
        forV:/*check xRay for valid integers 1 through n-1.*/
        for (int v=0;v<xRay.size();v++) {
          if (xRay.get(v)!=cnt) {
            toggle=false;
            break forV;
          }
          cnt++;
        }
      }/*end toggle*/
    } else if (x<=1) {
      toggle=false;
    }
    System.out.println(toggle ? "Jolly" : "Not jolly");

  }/*end while has next*/
}/*end args*/
}/*end class*/
