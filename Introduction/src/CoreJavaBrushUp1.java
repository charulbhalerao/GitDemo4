
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DATATYPES

		int myNum =9;
		String myName = "Charul Bhalerao";
		char letter = 'z';
		double dec = 9.99; //for decimal use data type as float or double
		boolean myCard = true; //remember boolean values are not strings
		
		//to print anything in console in java use below
		System.out.println(myNum + " " + "is my fav number");
		System.out.println(myName);
		
		//ARRAYS: are used to store multiple values in a variable
		//2 ways of writing arrays
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//OR
		
	    int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11};
	    //System.out.println(arr2[2]);
	    
	    //LOOPS
	    
	   //for(int i = 0; i<arr.length; i++) //no ";" for FOR loop
	   
	  // {  
	  //   System.out.println(arr[i]);
	  // }
		
	   for (int j = 0; j<arr2.length; j++)
	   {
		   System.out.println(arr2[j]);
	   }
		
		String[] Arrname = {"charul", "chiti", "ashu"};
		
		//for(int i =0; i<Arrname.length; i++)
		//{
			//System.out.println(Arrname[i]);
		//}
		
		// Enhanced FOR loop 
		
		for( String s: Arrname)
		{
			System.out.println(s); 
		}
	}

}
