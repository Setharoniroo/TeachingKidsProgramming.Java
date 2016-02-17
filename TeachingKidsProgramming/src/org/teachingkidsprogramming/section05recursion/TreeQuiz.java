package org.teachingkidsprogramming.section05recursion;

import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    //   Question 1 
    //   doubleLength (recipe below) 
    doubleLength();
    //
    //   Question 2 
    //   decreaseTurn (recipe below) 
    decreaseTurn();
    //
    //   Question 3 
    //   setNinety (recipe below) 
    setNinety();
    //
    //   Question 4 
    //   angleFive (recipe below) 
    angleFive();
  }
  private void angleFive()
  {
    //   ------------- Recipe for angleFive 
    //       sets the 5th angle to 36 degrees
    angles.put(5, 36);
    //   ------------- End of angleFive recipe
  }
  private void setNinety()
  {
    //   ------------- Recipe for setNinety 
    //       set the current turn angle to 90, HINT: Use angles.put(key,value);
    angles.put(turn, 90);
    //   ------------- End of setNinety recipe
  }
  private void decreaseTurn()
  {
    //   ------------- Recipe for decreaseTurn 
    //      decrease the current turn by 1
    turn = turn - 1;
    //   ------------- End of decreaseTurn recipe
  }
  private void doubleLength()
  {
    //   ------------- Recipe for doubleLength 
    //       make the current length twice what it is
    length = length * 2;
    //   ------------- End of doubleLength recipe
  }
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
