package perceptron;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
	public static ArrayList <String> training = new ArrayList<String>(); 	
	public static ArrayList <String> solution = new ArrayList<String>();
	public static ArrayList <SingleFeature> features = new ArrayList<SingleFeature>(); 
	public static ArrayList<Double> weights = new ArrayList<Double>();
	public static int results [][] = new int[50][100];
    public static boolean classify [] = new boolean[100];
	public static boolean weightsInitialized = false;
	public static double biasTerm = 1.0;
	public static int numberofcycles = 100;
	public static double learning_rate = 1;
	
	
	public static void loadImage(String filename) {
	
			String line;

			try {
				BufferedReader br = new BufferedReader(new FileReader(filename));
								
				String p = "";
				int count = 0;
				while(((line = br.readLine()) != null)) {

					String [] values = line.split("\n");
					if(count == 3) {
						
						p = values[0]; 
						
						
						
					}
					
					if(count == 1) {
					solution.add(values[0].substring(1));
					
					}
					
					
					
					
					if(count == 4) {
						//System.out.println(values[0].length());
						p += values[0];
						//System.out.println(p.length());					
						training.add(p);
					}
					
					count++;
					if(count == 5) {
						
						count = 0;
						
					}
					
					
					
				}

				br.close();

			}
			
			
			
			catch(IOException e ) {
				
				System.out.println("File not found");
				e.printStackTrace();
				
			}

			
	}

}
