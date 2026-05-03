package SmartFarming;

public abstract class Irrigation {
	String IrrigatType;
	Irrigation(){
		
	}
	public abstract void StratIrrigate(String IrrigatType);
	
	public abstract void StopIrrigate();

}
