/*
 * Activity 3.1.4
 * Algorithm: Check if all players are under 21
 */
public class PlayerCheck
{
  public static void main(String[] args)
  {
    // Step 12: Create an array of Player objects
    Player[] players = {
      new Player("Jordan", 18),
      new Player("Taylor", 19),
      new Player("Sam", 20),
      new Player("Alex", 17)
    };

    // Step 12: Assume all players are under 21 initially
    boolean allHaveValue = true;

    // Enhanced for loop to traverse array and check condition
    for (Player p : players)
    {
      if (p.getAge() >= 21)
      {
        allHaveValue = false;
        break; // we can stop early if condition fails
      }
    }

    // Step 12: Report the result
    if (allHaveValue)
      System.out.println("All players are under 21.");
    else
      System.out.println("Not all players are under 21.");
  }
}