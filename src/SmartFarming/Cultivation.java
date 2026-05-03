package SmartFarming;

public  class Cultivation extends Irrigation {
	String cropname1;String cropname2;String cropname3;
	String herbiside;String insectide;
	String TractorName ;
	
	Cultivation(){
		
	}
	public void ploughing() {
		System.out.println("Land ploughed----------");
	}
	
	
	public void StratIrrigate(String IrrigatType) {
		System.out.println("Irrigation Started By : " + IrrigatType);
		
	}
	
	
	public void StopIrrigate() {
		System.out.println("Irrigation Stop--------");
		
	}
	
	public void  sowing(String cropname1,String cropname2,String cropname3) {
		System.out.println(cropname1+ " Sowed------");
		System.out.println(cropname2+ " Sowed------");
		System.out.println(cropname3+ " Sowed------");
	}
	
	public  void Spraying(String herbiside,String insectide ) {
		System.out.println("RoundUp(herbiside/tan-nashak) Sprayed-- ");
		System.out.println("Emamectin(insectide/kitak-nashak) Sprayed-- ");
		
	}
	
	public  void Harvesting(String TractorName ) {
		System.out.println("Crop Harvested By : " + TractorName + "Tractor");
	}
	
	public  void  Selling () {
		System.out.println("Crop Sell in Market-------");
	}
	
	

}
