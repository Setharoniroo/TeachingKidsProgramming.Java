package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    //    Change the width of the line the tortoise draws to 1 pixel --#12
    //    Change the Tortoise to a Spider --#14
    //    Change the pen color of the line the tortoise draws to red --#13.1
    //    Set the color of the background window to black (HINT: use the Tortoise to get the background window) --#13.2
    //    The current length of a line is 10.5 pixels --#1.2  
    double currentlength = 10.5;
    //    The current zoom is 1.1 --#8.2
    double currentzoom = 1.1;
    //    Do the following 10 times --#10.1
    //        weaveOneLayer (recipe below) --#9.1
    //
    //        ------------- Recipe for weaveOneLayer --#9.2
    //        Do the following 6 times --#5.1
    for (int i = 0; i < 6; i++)
    {
      //            drawTriangle (recipe below) --#4.1
      //
      drawTriangle();
      //
      //            Turn the tortoise 1/6th of 360 degrees to the right --#7
      Tortoise.turn(360 / 6);
      //            Increase the current length (of the line) by the current zoom --#8.1 
      currentlength = currentlength + currentzoom;
      //        Repeat --#5.2
    }
    //        ------------- End of weaveOneLayer recipe --#9.3
    //
    //        Change the current zoom so it is multiplied by 1.3 --#11
    //    Repeat --#10.2
  }
  private static void drawTriangle()
  {
    //            ------------- Recipe for drawTriangle --#4.2
    //            Do the following 3 times --#3.1
    for (int i = 0; i < 3; i++)
    {
      //                Move the tortoise the current length (of the line) --#1.1
      Tortoise.move(1.1);
      //                Turn the tortoise 1/3rd of 360 degrees --#2
      Tortoise.turn(360 / 3);
      //            Repeat --#3.2
    }
    //            ------------- End of drawTriangle recipe --#4.3
  }
}
