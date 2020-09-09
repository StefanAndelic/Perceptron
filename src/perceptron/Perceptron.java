package perceptron;


public class Perceptron {

	public static void perceptron() {
		

		double sum = 0;
		int correct = 0;
		
		// initialises the weights for 50 features
		 for (int i = 0; i <= Parser.features.size(); i++) {
	            Parser.weights.add(0.0);
	      
		 }
		for(int j = 0; j < Parser.numberofcycles; j++) {
			
			for(int i = 0; i < Parser.training.size(); i++) {
				
				for(int p = 0; p < Parser.features.size(); p++) {
					
					
					sum+=  Parser.results[p][i] * Parser.weights.get(p);
					
				}
				
				sum += Parser.weights.get(50);
				
				
					if(sum > 0) {
					
					if(Parser.solution.get(i).equals("X")) {
						correct++;	
						//System.out.println(correct);
					}
					else {
					correct = 0;
					for(int p = 0; p < Parser.features.size(); p++) {
						
						double a =  Parser.weights.get(p) -(Parser.results[p][i] * Parser.learning_rate);
						//System.out.println(a);
						Parser.weights.set(p,a);
						
						
					}
					double a = Parser.weights.get(50) - Parser.learning_rate;
					Parser.weights.set(50,a);
					}
				}
					if(sum <= 0) {
						
						if(Parser.solution.get(i).equals("O")) {	
						
						correct++;
						
						}
						else {
						correct = 0;
						for(int p = 0; p < Parser.features.size(); p++) {
							
							double a =  Parser.weights.get(p) +(Parser.results[p][i] * Parser.learning_rate);
							Parser.weights.set(p,a);
							
							
						}
						double a = Parser.weights.get(50) + Parser.learning_rate;
						Parser.weights.set(50,a);
						}
					}
					
					if(correct == 100) {
					Report.report();
					System.out.println("Perceptron converged after" + " " + j + " " +  "cycles");
					System.out.println("Number of correctly cassified images is:" + " " + correct);
					System.exit(0);
					}
					
					
			
			}
			
			
		}
		
		Report.report();
		System.out.println("Perceptron did not converge");
		System.out.println("Number of incorrectly classified image is" + " " + (100-correct));
		System.exit(0);
	}
		
}

