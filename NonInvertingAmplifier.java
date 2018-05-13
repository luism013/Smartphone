
public class NonInvertingAmplifier extends Amplifier {

	private double R1;
	private double R2;
	
	public NonInvertingAmplifier(double R1, double R2) {
		this.R1 = R1;
		this.R2 = R2;
	}
	@Override
	public double getGain() {
		// TODO Auto-generated method stub
		return 1+R2/R1;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Non-Inverting Amplifier";
	}

}
