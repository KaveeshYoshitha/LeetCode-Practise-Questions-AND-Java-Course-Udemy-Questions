public class SpeedConverter {
    // write code here
    public static void main(String[] args) {
        printConversion(10.5);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        long result;
        if (kilometersPerHour<0){
            return -1;
        }else{
            result = Math.round(kilometersPerHour/1.609);
            return result;
        }
      
    }
    public static void printConversion(double kilometersPerHour){
      long result = toMilesPerHour(kilometersPerHour);
      if(result == -1){
          System.out.println("Invalid Value");
      }else{
      System.out.println(kilometersPerHour+ " km/h = "+result+" mi/h");
      }
        
    }
}