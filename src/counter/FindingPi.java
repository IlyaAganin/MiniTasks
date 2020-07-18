package counter;

public class FindingPi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(findPiWithLeibnizSeries(10));
		//govno
		//System.out.println(findWithModifyLeibnizSeries(1000));
	}
	
	public static double findPiWithLeibnizSeries(int n) {
		
		double x = 1;
		double y = 1;
		double t = 1;
		for (int k = 1; k < n*2 + 1; k++) {
			x *= -t/((t+2)*3);
			t += 2;
			y += x;
		}
		return y * Math.sqrt(12);
	}
	
	//ne rabotaet
	/*public static double findWithModifyLeibnizSeries(int n) {
		double y = 0;
		for (int k = 0; k < n; k++) {
			y += 2/(4*k+1)*2/(4*k+3);
		}
		return y * 4;
	}*/

}
