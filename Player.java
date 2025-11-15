/*
 * Activity 3.1.4
 */
public class Player
{
  private String name;
  private int age;
  
  /* constructors */
  public Player()
  {
    this.name = "";
    this.age = 0;
  }
    
  public Player(String name)
  {
    this.name = name;
    this.age = 0;
  }
  
  public Player(String name, int age)
  {
    this.name = name;
    this.age = age;
  }
  
  /* accessors */
  public int getAge()
  {
    return age;
  }
    
  public String getName()
  {
    return name;
  }

  /* mutators */
  public void setName(String name)
  {
    this.name = name;
  }
  
  // Note: your file used setPoints — if you meant to set age, rename to setAge
  public void setAge(int age)
  {
    this.age = age;
  }

}