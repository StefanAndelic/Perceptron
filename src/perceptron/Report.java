package perceptron;


public class Report {


public static void report(){
	
		System.out.println("Generated features:");
		
		for(int l = 0; l < Parser.features.size(); l++) {
		System.out.println("[" + Parser.features.get(l) + "]");
		
		}
			

		System.out.println("Generated weights:");
		for(int l = 0; l < Parser.weights.size(); l++) {
				System.out.println("[" + Parser.weights.get(l)+ "]");
		}

		
	
		}
	}

