package bus;

public class StepCounter extends Counter{
	private int step;
	
	public StepCounter(){
		
		super();
		this.step = 0;
		
	}
	
	public StepCounter(long serialNumber, int value, int step){
		
		super(serialNumber, value);
		this.step = 0;
		
	}
	
	public int getStep() {
		return this.step;
	}
	
	public void setStep(int step) {
		this.step = step;
	}
	
	@Override
	public String toString() {
		
		String state;
		state = super.toString()+ "-"+this.step;
		return state;
	}
	
	@Override
	public void increment() {
		int step = this.getStep();
		
	}

	@Override
	public void increment(int value) {
		// TODO Auto-generated method stub
		
	}
	
	

}
