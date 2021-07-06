public class Main {
  public static void main(String[] args) {
    int a;
    int b;
    a = 20;
    b = a + 5;
    System.out.println(a);
    System.out.println(b);
    System.out.println("私の好きな記号は二重引用符（\"）です");
    
    double c = 9.0;
    System.out.println(c / 2);
    
    b++;
    System.out.println(b);
    
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else 
      System.out.println("DVDを見ます");
    
    int d = 30;
    int e = 7;
    System.out.println((double)d / e);
    
  }
}