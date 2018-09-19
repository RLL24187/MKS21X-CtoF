public class CtoFTester{ //Class must be the same name as the file name
  public static void main(String[] args) {
    //Test Cases for CtoF
    System.out.println(CtoF(100)); //212.0
    System.out.println(CtoF(0)); //32.0
    System.out.println(CtoF(53)); //127.4
  }
  public static double CtoF(int x){
    return (x * 9.0 / 5) + 32;
  }
}
