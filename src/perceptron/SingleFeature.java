package perceptron;

public class SingleFeature {
	
			
		int pos1;
		int pos2;
		int pos3;
		int pos4;
		int val1;
		int val2;
		int val3;
		int val4;
		
		
		public SingleFeature(int position1,int value1,int position2, int value2, int position3, int value3, int position4, int value4) {
			this.pos1 = position1;
			this.pos2 = position2;
			this.pos3 = position3;
			this.pos4 = position4;
			this.val1 = value1;
			this.val2 = value2;
			this.val3 = value3;
			this.val4 = value4;
			
		}
			
		
		public String toString() {
			//("Position1:" + " " + "Value1:" + "Position2:" + " " + "Value2:" + " " + "Value3:" + "Position3:" + " " + "Value4:" + " " + "Position4:");
			
			return (this.pos1 + " " + this.val1 + " " + this.pos2 + " " + this.val2 + " " + this.pos3 + " " + this.val3 + " " + this.pos4 + " " + this.val4);
			
			
		}
		
		
		
		
		
		
		
		
	}


