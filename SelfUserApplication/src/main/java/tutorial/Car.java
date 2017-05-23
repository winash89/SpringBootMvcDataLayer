package tutorial;

public class Car {
	
	private Engine engine;
	
	public Car(Engine engine){
		this.engine = engine;
	}
	
	private String warningMessage;
	
	public String getWarningMessage() {
		return warningMessage;
	}
	
	public void accelerate(){
		engine.increaseRpm();
		
		if(engine.getRpm() > 5000){
			warningMessage = "Slow Do wn!";
		}
	}
	
	public void setWarningMessage(String warningMessage) {
		this.warningMessage = warningMessage;
	}
	
}
