class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //CS 2050
    //encryption formula: c = (m+k) mod N
    //decryption formula: m = (c-k) mod N
    System.out.println("begin cryptography...\n> ----------");
    //N = 79 zybooks 9.8 exercise
    //k = 43
    System.out.println("encrypting 62...");
    encrypt(62, 43);
    System.out.println("Received c = 26. decrypting... <(0.0<)");
    decrypt(26, 43);
    System.out.println("Received c = 12. decrypting... <(0.0<)");
    decrypt(12,43);
    //System.out.println((1117 - 2191) % 3391);
    //System.out.println((-17) % 79);
  }

  public static void encrypt(int m, int k) {
    int c = (m + k) % 79;
    System.out.println("The encryption is: " + c);
  }

  public static void decrypt(int c, int k) {
    int a = c - k;
    int m = (a % 79 + 79) % 79;
    //this one works above the below is the formula to resolve negative mod in Java
    //int m = (c % k + k) % k % k;

    //the above for some reason doesn't work with what's in line with the one from zybooks. this doesn't do negative mod :(
    System.out.println("The decryption is: " + m);
  }
}