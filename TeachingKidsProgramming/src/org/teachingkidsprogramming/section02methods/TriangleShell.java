package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

@SuppressWarnings("unused")
public class TriangleShell
{
  private static int length = 1;
  public static void main(String[] args)
  {
    // Show the tortoise --#1
    Tortoise.show();
    // Make the tortoise go as fast as possible --#6
    Tortoise.setSpeed(10);
    for (int i = 0; i < 60; i++)
    {
      // Do the following 60 times --#7.1
      //      Change the pen color of the line the tortoise draws to a random color --#9
      Tortoise.setPenColor(PenColors.getRandomColor());
      //      Increase the current length of the side by 4 pixels --#8
      length = length + 4;
      //      drawTriangle (recipe below) --#5.1
      //
      drawTriangle();
      //
      //      Turn the tortoise 1/60th of 360 degrees to the right --#10
      Tortoise.turn(360 / 60);
      // Repeat --#7.2
    }
  }
  private static void drawTriangle()
  {
    //      ------------- Recipe for drawTriangle --#5.2
    //          Do the following 3 times --#3.1
    for (int i = 0; i < 3; i++)
    {
      //              Move the tortoise using the current length --#4
      Tortoise.move(length);
      //              Turn the tortoise 1/3rd of 360 degrees --#2
      Tortoise.turn(360 / 3);
    }
    //          Repeat --#3.2
    //      ------------- End of drawTriangle recipe --#5.3
  }
}
