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
  while (input.hasNextInt()) {
    int round = input.nextInt();
    System.out.println("Round "+round);
  }
  while (input.hasNext()) {

    String word=input.nextLine();
    String guess=input.nextLine();
    System.out.println(word);
    System.out.println(guess);
  }
}
}