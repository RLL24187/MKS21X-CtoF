public class CtoFTester{ //Class must be the same name as the file name
  public static void main(String[] args) {

    //Test Cases for celsiusToFahrenheit
    System.out.println(celsiusToFahrenheit(100)); //212.0
    System.out.println(celsiusToFahrenheit(0)); //32.0
    System.out.println(celsiusToFahrenheit(-53)); //-63.400000000000006
    System.out.println(celsiusToFahrenheit(28.572)); //83.4296

    //Test Cases for fahrenheitToCelsius
    System.out.println(fahrenheitToCelsius(32)); //0.0
    System.out.println(fahrenheitToCelsius(212)); //100.0
    System.out.println(fahrenheitToCelsius(-45)); //-42.77777777777778
    System.out.println(fahrenheitToCelsius(7.8096)); //-13.43911111111111
  }

  //Celsius to Fahrenheit
  public static double celsiusToFahrenheit(double x){
    return (x * 9.0 / 5) + 32;
  }
  
  //Fahrenheit to Celsius
  public static double fahrenheitToCelsius(double x){
  return (x - 32) * 5 / 9.0;
  }
}
