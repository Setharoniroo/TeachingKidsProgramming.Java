package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class SpiderWeb
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(1);
    Tortoise.setAnimal(Animals.Spider);
    Tortoise.setPenColor(PenColors.Whites.White);
    Tortoise.getBackgroundWindow().setColor(PenColors.Grays.Black);
    double currentlength = 10.5;
    for (int i = 0; i < 10; i++)
    {
      currentlength = weaveOneLayer(currentlength);
    }
  }
  private static double weaveOneLayer(double currentlength)
  {
    double currentZoom = 1.1;
    for (int i = 0; i < 6; i++)
    {
      drawTriangle(currentlength);
      Tortoise.turn(360 / 6);
      currentlength = currentlength + currentZoom;
      currentZoom = currentZoom * 1.3;
    }
    return currentlength;
  }
  private static void drawTriangle(double currentlength)
  {
    for (int i = 0; i < 3; i++)
    {
      Tortoise.move(currentlength);
      Tortoise.turn(360 / 3);
    }
  }
}
// "a tiny change" -Mr Chuah
