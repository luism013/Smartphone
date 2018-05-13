
public class InvertingAmplifier extends Amplifier {

	private double R1;
	private double R2;
	
	public InvertingAmplifier(double R1, Double R2) {
		this.R1 = R1;
		this.R2 = R2;
	}
	@Override
	public double getGain() {
		// TODO Auto-generated method stub
		return -R2/R1;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Inverting Amplifier";
	}
	
	
}
