/*
 * Activity 3.1.4
 * Developing Algorithms Using Arrays
 * This file includes algorithms for:
 *  - Checking if any player is 18 or older
 *  - Checking if all players are under 21
 *  - Counting players aged 15
 *  - Printing consecutive pairs (teams)
 *  - Implementing and analyzing two "Mystery" pseudocode algorithms
 *  - Reversing the order of an array
 */

public class StandardArrayAlgorithms
{
  public static void main(String[] args)
  {
    /* ---------------------------------------------------------
       Create an array of Player objects
       --------------------------------------------------------- */
    Player[] players = {
      new Player("Alex", 12),
      new Player("Aiden", 13),
      new Player("Bobbie", 18),
      new Player("Blaine", 20),
      new Player("Chris", 15),
      new Player("Charlie", 15)
    };

    /* ---------------------------------------------------------
       Steps 8–11: Check if any player is 18 or older
       ---------------------------------------------------------
       Algorithm explanation:
       - Use a boolean variable (hasValue) initialized to false.
       - Use a while loop to check each player's age.
       - If a player is 18 or older, set hasValue to true and stop early.
       - Report whether any player meets the condition.
       --------------------------------------------------------- */
    boolean hasValue = false;
    int index = 0;
    while (index < players.length && !hasValue)
    {
      if (players[index].getAge() >= 18)
        hasValue = true;
      index++;
    }

    if (hasValue)
      System.out.println("There is at least one player who is 18 or older.");
    else
      System.out.println("No players are 18 or older.");


    /* ---------------------------------------------------------
       Steps 12–14: Check if all players are under 21
       ---------------------------------------------------------
       Algorithm explanation:
       - Use a boolean variable (allHaveValue) initialized to true.
       - Use an enhanced for loop to check each player's age.
       - If any player is 21 or older, set allHaveValue to false.
       - After the loop, print whether all players are under 21.
       --------------------------------------------------------- */
    boolean allHaveValue = true;
    for (Player p : players)
    {
      if (p.getAge() >= 21)
      {
        allHaveValue = false;
        break;
      }
    }

    if (allHaveValue)
      System.out.println("All players are under 21.");
    else
      System.out.println("Not all players are under 21.");


    /* ---------------------------------------------------------
       Steps 15–17: Count number of players who are 15 years old
       ---------------------------------------------------------
       Algorithm explanation:
       - Use an enhanced for loop to traverse the array.
       - Use a counter variable (countFifteen).
       - Increment counter for each player whose age equals 15.
       --------------------------------------------------------- */
    int countFifteen = 0;
    for (Player p : players)
    {
      if (p.getAge() == 15)
        countFifteen++;
    }

    System.out.println("Number of players who are 15 years old: " + countFifteen);


    /* ---------------------------------------------------------
       Step 18: Display consecutive pairs of players (teams)
       ---------------------------------------------------------
       Algorithm explanation:
       - Use a for loop with step size 2 to access every pair of players.
       - Print player[i] and player[i+1] as a team.
       --------------------------------------------------------- */
    System.out.println("\nPlayer Teams:");
    for (int i = 0; i < players.length; i += 2)
    {
      if (i + 1 < players.length)
        System.out.println(players[i].getName() + " and " + players[i + 1].getName());
    }


    /* ---------------------------------------------------------
       Step 19: Mystery Pseudocode 1
       ---------------------------------------------------------
       Algorithm explanation:
       - Creates an integer array with 6 elements.
       - Iterates through the array from start to end.
       - Swaps each element with the next element.
       - Purpose: This algorithm swaps every consecutive pair 
         starting from the beginning of the array.
         (Example: [1,2,3,4,5,6] → [2,1,4,3,6,5])
       --------------------------------------------------------- */
    int[] arr1 = {1, 2, 3, 4, 5, 6};
    System.out.println("\nBefore Mystery 1:");
    for (int n : arr1) System.out.print(n + " ");
    System.out.println();

    for (int i = 0; i < arr1.length - 1; i++)
    {
      int temp = arr1[i];
      arr1[i] = arr1[i + 1];
      arr1[i + 1] = temp;
    }

    System.out.println("After Mystery 1:");
    for (int n : arr1) System.out.print(n + " ");
    System.out.println();


    /* ---------------------------------------------------------
       Steps 21–22: Mystery Pseudocode 2
       ---------------------------------------------------------
       Algorithm explanation:
       - Creates another integer array with 6 elements.
       - Iterates through the array in reverse (from end to start).
       - Swaps each element with the one before it.
       - Purpose: This algorithm swaps consecutive pairs starting 
         from the end of the array instead of the beginning.
         (Example: [1,2,3,4,5,6] → [2,3,4,5,6,5])
       --------------------------------------------------------- */
    int[] arr2 = {1, 2, 3, 4, 5, 6};
    System.out.println("\nBefore Mystery 2:");
    for (int n : arr2) System.out.print(n + " ");
    System.out.println();

    for (int i = arr2.length - 1; i > 0; i--)
    {
      int temp = arr2[i - 1];
      arr2[i - 1] = arr2[i];
      arr2[i] = temp;
    }

    System.out.println("After Mystery 2:");
    for (int n : arr2) System.out.print(n + " ");
    System.out.println();


    /* Step 23: Reverse the array using two-pointer method */
    int[] arr3 = {1, 2, 3, 4, 5, 6};
    System.out.println("\nBefore Reverse:");
    for (int n : arr3) System.out.print(n + " ");
    System.out.println();

    int start = 0;
    int end = arr3.length - 1;
    while (start < end)
    {
      int temp = arr3[start];
      arr3[start] = arr3[end];
      arr3[end] = temp;
      start++;
      end--;
    }

    System.out.println("After Reverse:");
    for (int n : arr3) System.out.print(n + " ");
    System.out.println();

    
    /* ---------------------------------------------------------
   PlayerNames FRQ Reference Algorithms
   --------------------------------------------------------- */

/**
 * Checks if any duplicate player names exist.
 * Returns true if a name appears more than once; false otherwise.
 */
    public boolean isDuplicate (String newName)
{
for (Player p : players)
{
if (newName.equals(p.getName()))
return true;
}
return false;
}

/**
 * Checks the entire players array for duplicate names.
 * Returns true if any duplicates exist; false otherwise.
 */
    public static boolean checkForDups(Player[] players)
    {
      for (int i = 0; i < players.length; i++)
      {
        for (int j = i + 1; j < players.length; j++)
        {
          if (players[i].getName().equals(players[j].getName()))
            return true;
        }
      }
      return false;
    }
    // FRQ Algorithm: Check if a given name appears more than once
    boolean isDuplicate(Player[] players, String name)
    {
      int count = 0;
      for (Player p : players)
      {
        if (p.getName().equals(name))
          count++;
      }
      return count > 1;
    }

    // FRQ Algorithm: Check the whole array for any duplicate player names
    boolean checkForDups(Player[] players)
    {
      for (int i = 0; i < players.length; i++)
      {
        for (int j = i + 1; j < players.length; j++)
        {
          if (players[i].getName().equals(players[j].getName()))
            return true;
        }
      }
      return false;
    }

  }
}
