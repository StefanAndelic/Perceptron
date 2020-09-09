package perceptron;
import perceptron.Parser;
import perceptron.Features;



public class Main {
	
	//uncomment to run the program in an IDE 
	public static String path = "src\\perceptron\\";
	static String filename;
	
	public static void main(String [] args) {
		System.out.println("Please enter the file name(e.g. image.data) into the command line");
		if(args.length < 1) {
			System.out.print("Please enter the file name");

		}
		else {
		filename = args[0];
		String dir = System.getProperty("user.dir");
		System.out.println("Reading data from:" + dir + "\\"+filename);
		}
		
		Parser.loadImage(path +  filename);                // loads the file 
		Features.features();                       // generates 50 random features 
		CalculateResults.calculateresults();			//calculates the weights 
		System.out.println("Training the perceptron over" + " " + Parser.numberofcycles + " " + "cycles" + " " + "with learning rate of"  + " " + Parser.learning_rate);
		Perceptron.perceptron();								// trains and tests the perceptron over 100 cycles
		
	}
	
}

	
