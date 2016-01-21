package org.teachingkidsprogramming.section02methods;

import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //   Make the tortoise move as fast as possible --#11
    Tortoise.setSpeed(10);
    //   Have the tortoise start at 200 pixels in on the X axis --#14
    Tortoise.setX(200);
    //   The current height is 40 --#1.2
    int currentHeight = 40;
    //   drawHouse (recipe below) --#9.1
    drawHouse(currentHeight);
    //   drawHouse with height 120 (recipe below) --#10
    drawHouse(120);
    //   drawHouse with height 90 (recipe below) --#12
    drawHouse(90);
    //   drawHouse with height 20 (recipe below) --#13
    drawHouse(20);
  }
  private static void drawHouse(int currentHeight)
  {
    //   ------------- Recipe for drawHouse --#9.2
    //       Change the pen color of the line the tortoise draws to lightGray --#15
    //       Move the tortoise the height of a house --#1.1
    Tortoise.move(currentHeight);
    //       Turn the tortoise 90 degrees to the right --#2
    Tortoise.turn(90);
    //       Move the tortoise 30 pixels --#3
    Tortoise.move(30);
    //       Turn the tortoise 90 degrees to the right --#4
    Tortoise.turn(90);
    //       Move the tortoise the height of a house --#5
    Tortoise.move(currentHeight);
    //       Turn the tortoise 90 degrees to the left --#6
    Tortoise.turn(-90);
    //       Move the tortoise 20 pixels --#7
    Tortoise.move(20);
    //       Turn the tortoise 90 degrees to the left --#8
    Tortoise.turn(-90);
    //   ------------- End of drawHouse recipe --#9.3
  }
}
