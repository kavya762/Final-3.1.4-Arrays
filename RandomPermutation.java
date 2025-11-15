/*
 * Activity 3.1.4
 *
 * Generate random permutations of integers or strings
 */
public class RandomPermutation
{
   public static int[] next(int len)
   {
      int[] r = new int[len];
      int[] p = new int[len];
      
      for (int i = 0; i < len; i++)
        p[i] = i + 1;
        
      // Fisher-Yates shuffle: fill r with a random permutation of p
      for (int i = 0; i < len; i++) {
        // pick random index from i..len-1 and swap p[i] and p[rand]
        int rand = i + (int)(Math.random() * (len - i));
        int tmp = p[i];
        p[i] = p[rand];
        p[rand] = tmp;
        r[i] = p[i];
      }
      
      return r;
   }
   
  public static String[] next(String[] seq)
  {
    int length = seq.length;
    
    String[] p = new String[length];
    for (int i = 0; i < length; i++) p[i] = seq[i];

    // Fisher-Yates shuffle in-place on p, then return copy
    for (int i = 0; i < length; i++) {
      int rand = i + (int)(Math.random() * (length - i));
      String tmp = p[i];
      p[i] = p[rand];
      p[rand] = tmp;
    }
    return p;
  }

}