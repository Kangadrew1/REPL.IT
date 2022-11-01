class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int i = 0;
    System.out.println(i);
    intOP(i);
    String a = "Hello! AM I LOWER CASE?";
    makeLower(a);
    System.out.println(a);
    System.out.println((Math.pow(-7,4)) % 5);
  }

protected static void intOP(int i) {
    i++;
    System.out.printf("i is %d%n", i);
    i += 3;
    System.out.printf("Now i is %d%n", i);
  }

//see what happens here and why doesn't method work
//as would think by name
//b only exists within the scope of this variable
//therefore a isn't modified 
public static void makeLower(String b) {
    b = b.toLowerCase();
  } 

//how to get the intended effect I found the fix I wanna say this is from 1331 looks like a 1331 exam question I tripped up on #RickyLandry
//change line 8 or wherever it is to be a = makeLower(a) AND change method to return a string
  //the issue was that the String operations only happen within the scope and do not automatically save unlike ints and other variable types. Strings are Special.
/*
  public static String makeLower(String b) {
    b = b.toLowerCase();
    return b;
  } 
*/
  
  //end of code as of 10-15-2022 (also just watched Iron Man 3—so feeling smart, genius, and witty—earlier because wifi was being baloney and/or I need to let my macbook pro finally have the full shutdown I think it's been a long time, like since June 2022 now, since I let it full shut down and boot up)
}

