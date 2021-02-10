package JavaDataStructures;

public class main {

//	private static Object results;

	public static void main(String[] args) {
			      int[] array = {10, 20, 30, 40, 50, 10};
			      int sum = 0;
			      for( int num : array) {
			          sum = sum+num;
			      }
			      System.out.println("Sum of array elements is:"+sum);
			   
	double[ ] exampleArray = {1,5,6,5,4,1};
    double maximum = exampleArray[0];
    int index = 0; {

    for (int i = 1; i<exampleArray.length; i++){
         if (exampleArray[ i ] > maximum) {

              maximum = exampleArray[ i ];

              index = i;

         }

    }

    System.out.println(index);}
	//outcome is 2
    }
	
	
	@SuppressWarnings("null")
	public static double[] toPower (double size, double power) {
				double[] result = null;
				for(double i = 0; i < size; i++) {
					result [(int)i] = Math.pow(i,  power);
				
				}
		return result;
	}


}


