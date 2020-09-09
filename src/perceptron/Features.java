package perceptron;

import java.util.Random;

public class Features {

public static void features() {	
	Random num = new Random();
	int n1 = 0;
	int n2 = 0;
	int n3 = 0;
	int n4 = 0;
	
	int v1 = 0;
	int v2 = 0;
	int v3 = 0;
	int v4 = 0;
		
	v2  = num.nextInt(2);
	v3 = num.nextInt(2);
	v4 = num.nextInt(2);
	
		
	for(int e = 0; e < 50; e++) {
		for(int j = 0; j < 50; j++) {
		 n1 = num.nextInt(100);
					
		}
		for(int k = 0; k < 50; k++) {
			 n2 = num.nextInt(100);
		
				
		}
		for(int l = 0; l < 50; l++) {
			 n3 = num.nextInt(100);
				
		}
		for(int m = 0; m < 50; m++) {
			 n4 = num.nextInt(100);
				
		}

		// connection value for each coordinate
		for(int a = 0; a < 50; a++) {
			
			v1 = num.nextInt(2);
		}
		for(int b = 0; b < 50; b++) {
			
			v2 = num.nextInt(2);
		}
		for(int c = 0; c < 50; c++) {
			
			v3 = num.nextInt(2);
		}
		for(int d = 0; d < 50; d++) {
			
			v4 = num.nextInt(2);
		}
		SingleFeature f = new SingleFeature(n1,v1,n2,v2,n3,v3,n4,v4);
		Parser.features.add(f);
	}
	
	
	
	
	
	
}

}
