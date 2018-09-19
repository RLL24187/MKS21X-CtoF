public class CtoFTester{ //Class must be the same name as the file name
  public static void main(String[] args) {
    //Test Cases for CtoF
    System.out.println(CtoF(100)); //212.0
    System.out.println(CtoF(0)); //32.0
    System.out.println(CtoF(-53)); //-63.400000000000006
    System.out.println(CtoF(28.572)); //83.4296
    //Test Cases for FtoC
    System.out.println(FtoC(32)); //0.0
    System.out.println(FtoC(212)); //100.0
    System.out.println(FtoC(-45)); //-42.77777777777778
    System.out.println(FtoC(7.8096)); //-13.43911111111111
  }
  //Celsius to Fahrenheit
  public static double CtoF(double x){
    return (x * 9.0 / 5) + 32;
  }
  //Fahrenheit to Celsius
  public static double FtoC(double x){
  return (x - 32) * 5 / 9.0;
  }

}
