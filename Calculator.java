

public class Calculator {
	
	public double getAverage(double first, double second) {
		return (first + second) / 2.0;
	}
	
	public double getSum(double first, double second) {
		return (first + second);
	}
	
	public double getProduct(double first, double second) {
		return (first * second);
	}

	public static double getAverage(double[] num) {
		double sum=0.0;
		for(int i=0; i<num.length; i++){
			sum+=num[i];
		}
		return(sum/num.length);
		}
	
	public static double getSum(double[] num) {
		return (num[1] + num[2]);
		}
	public static double getProduct(double[] num) {
		return (num[1] * num[2]);
	}
	}

	



