public class CtoFTester{ //Class must be the same name as the file name
  public static void main(String[] args) {
    //Test Cases for CtoF
    System.out.println(CtoF(100));
    System.out.println(CtoF(0));
    System.out.println(CtoF(53));
  }
  public static double CtoF(int x){
    return (x * 9.0 / 5) + 32;
  }
}
