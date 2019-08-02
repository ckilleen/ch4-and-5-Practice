public class MathTest
{
	public static void main(String[] args)
	{
		System.out.println(""); // blank to add space

		// square root of 37
        double number = 37;
        double squareRoot = Math.sqrt(number);
 
        System.out.println("number : "+number);
        System.out.println("Square Root : "+squareRoot);

        System.out.println(""); // blank to add space

        // sine and cosine of 300
        int x; double t;
        
    	for (x=300; x<360; x += 300)
    	{
        	double sin_x = Math.sin(x);
        	double cos_x = Math.cos(x);
        	double tan_x = Math.tan(x);
        	System.out.println("Sin(" +x +")" +"=" +sin_x);
        	System.out.println("Cos(" +x +")" +"=" +cos_x);
        	t = sin_x / cos_x;
        
            if (t == tan_x)
            {
            	System.out.println("True");
            }
            else
            {
            	System.out.println("False");
            }
    	}

    	System.out.println(""); // blank to add space

    	// 22.8, floor and ceiling and round of 22.8
    	double d = 22.8;

  		System.out.println("Ceiling of '" + d + "' = " + Math.ceil(d));

  		System.out.println("Floor of '" + d + "' = " + Math.floor(d));

  		System.out.println("Round off for 22.8 = " + Math.round(d));

		System.out.println(""); // blank to add space

        // Larger and smaller of the character 'D' and integer 71
        System.out.println("The larger of D and 71 is: " + Math.max('D', 71));

        System.out.println("The smaller of D and 71 is: " + Math.min('D', 71));

        System.out.println(""); // blank to add space

		// random number between 0 and 20
  		System.out.println("A random number between 0 and 20: " + (Math.floor(Math.random() * 20)));

	}
}