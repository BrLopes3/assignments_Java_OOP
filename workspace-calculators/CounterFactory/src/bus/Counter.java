package bus;

public abstract class Counter {
	
	private long serialNumber;
	private int value;
	
	public Counter() {
		
		this.serialNumber = 0;
		this.value = 0;
	}
	
	public Counter(long serialNumber, int value) {
		
		this.serialNumber = serialNumber;
		this.value = value;
	}
	
	public long getSerialNumber() {
		
		return this.serialNumber;
	}
	
	public void setSerialNumber(long serialNumber) {
		
		this.serialNumber = serialNumber;
	}
	
	public long getValue() {
		
		return this.value;
	}
	
	public void setValue(int value) {
		
		this.value = value;
	}
	
	@Override
	public String toString() {
		String state;
		state = this.serialNumber +"-"+this.value;
		return state;
	}
	
	public abstract void increment(int value);
	
	public abstract void increment();

}
