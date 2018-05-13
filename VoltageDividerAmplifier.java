
public class VoltageDividerAmplifier extends Amplifier {

	private double R1;
	private double R2;
	
	public VoltageDividerAmplifier(double R1, double R2) {
		
	}
	@Override
	public double getGain() {
		// TODO Auto-generated method stub
		return R1/(R1+R2);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Voltage Divider Amplifier";
	}

}
