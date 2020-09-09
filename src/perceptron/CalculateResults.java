package perceptron;

public class CalculateResults {
	public static void calculateresults() {
		double sum= 0;
		
				
		for(int i = 0; i < Parser.training.size(); i++) {
			
			for(int p = 0; p < Parser.features.size(); p++) {
				
				
				String image = Parser.training.get(i);
				
				if(Character.getNumericValue(image.charAt(Parser.features.get(p).pos1)) == (Parser.features.get(p).val1)) {
					
					sum++;
				}
				
				if(Character.getNumericValue(image.charAt(Parser.features.get(p).pos2)) == (Parser.features.get(p).val2)) {
					sum++;
					
				}	
				if(Character.getNumericValue(image.charAt(Parser.features.get(p).pos3)) == (Parser.features.get(p).val3)) {
					sum++;
					
				}	
				if(Character.getNumericValue(image.charAt(Parser.features.get(p).pos4)) == (Parser.features.get(p).val4)) {
					sum++;
					
				}
				if(sum >= 3) {
					
					Parser.results[p][i] =  1;
					
				}
				else {
					
					Parser.results[p][i] =  0;
				}
				
									
				
				sum = 0;
				
			}
				//sum += results[p][i] * ImageParser.weights.get(p);
				//System.out.println(sum);
				//System.out.println(ImageParser.weights.get(p));
				
				
				
				
			}
			
			
			
		
	}

}
