package org.teachingkidsprogramming.section05recursion;

import org.teachingextensions.logo.Tortoise;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    //    Make the tortoise go as fast as possible --#10
    Tortoise.setSpeed(1);
    //    Turn the background black  --#21
    //    The current branch length = 60 --#1.2
    int currantbranch = 60;
    //    drawBranch(recipe below) --#2.1
    //
    drawBranch(currantbranch);
  }
  private static void drawBranch(int currantbranch)
  {
    //    ------------- Recipe for drawBranch --#2.2
    //        If the current branch length is greater than zero, do the rest of this recipe --#5
    if (currantbranch > 0)
    {
      //        adjustColor (recipe below)--#15.1
      // if (currantbranch == 10)
      //  {
      //   Tortoise.setPenColor(PenColors.Greens.Lime);
      //  }
      //  else if (currantbranch == 20)
      // {
      //   Tortoise.setPenColor(PenColors.Greens.ForestGreen);
      //  }
      // else if (currantbranch == 30)
      //  {
      //   Tortoise.setPenColor(PenColors.Greens.DarkGreen);
      // }
      // else if (currantbranch == 40)
      // {
      //    Tortoise.setPenColor(PenColors.Greens.Olive);
      //   }
      //  else if (currantbranch == 50)
      //  {
      //   Tortoise.setPenColor(PenColors.Browns.Sienna);
      // }
      //  else if (currantbranch == 60)
      // {
      //   Tortoise.setPenColor(PenColors.Browns.SaddleBrown);
      // }
      //        Move the tortoise the length of the current branch --#1.1
      Tortoise.move(currantbranch);
      //        drawLowerBranches (recipe below) --#6.1
      //
      dawLoerBanches(currantbranch);
      //
    }
    //    ------------- End of drawBranch recipe --#2.3
  }
  private static void adjustColor()
  {
    //        ------------- Recipe for adjustColor --#15.2
    //  HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    //          A 10 pixel long branch is lime --#20
    // colors.put(10, PenColors.Greens.Lime);
    //           A 20 pixel long branch is forest green --#19
    // colors.put(20, PenColors.Greens.ForestGreen);
    //            A 30 pixel long branch is dark green --#18
    // colors.put(30, PenColors.Greens.DarkGreen);
    //            A 40 pixel long branch is olive --#17
    // colors.put(40, PenColors.Greens.Olive);
    //            A 50 pixel long branch is sienna --#14
    // colors.put(50, PenColors.Browns.Sienna);
    //            A 60 pixel long branch is saddle brown (TIP: Put the values into the 'colors' HashMap)--#13 
    // colors.put(60, PenColors.Browns.SaddleBrown);
    //            Get the value of the branch length from the 'colors' HashMap and use that to set the pen color --#21
    // Tortoise.setPenColor(colors.get(currantbranch));
    //        ------------- End of adjustColor --#15.3
  }
  private static void dawLoerBanches(int currantbranch)
  {
    //        ------------- Recipe for drawLowerBranches --#6.2
    //            Turn the Tortoise 30 degrees to the right --#3
    Tortoise.turn(30);
    //            drawShorterBranch (recipe below) --#8.1
    //
    dawShottrBanch(currantbranch);
    //
    //            Turn the Tortoise 60 degrees to the left --#7
    Tortoise.turn(-60);
    //            drawShorterBranch --#9
    dawShottrBanch(currantbranch);
    //            Turn the Tortoise 30 degrees to the right --#12
    Tortoise.turn(30);
    //            adjustColor --#16
    adjustColor();
    //            Move the tortoise backward the length of the current branch --#11
    Tortoise.move(-currantbranch);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void dawShottrBanch(int currantbranch)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    //                drawBranch (10 pixels shorter) --#4
    drawBranch(currantbranch - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}