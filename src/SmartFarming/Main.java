package SmartFarming;

public class Main {
	public static void main (String[] args) {
		Cultivation cult = new Cultivation();
		cult.ploughing();
		cult.StratIrrigate("Tushar");
		cult.StopIrrigate();
		cult.sowing("Corn", "Rice", "Wheat");
		Crop corn =new Corn("Corn", 120, 3.0);
		corn.CropDetails();
		Crop rice = new Rice("Rice", 140, 4.0);
		rice.CropDetails();
		Crop wheat = new Wheat("Wheat", 100, 2.0);
		wheat.CropDetails();
		cult.StratIrrigate("Thibak");
		cult.StopIrrigate();
		cult.Spraying("Roundup", "Emamectin");
		cult.Harvesting("JohnDhere");
		cult.Selling();
		corn.yieldCalculate(50);
	    rice.yieldCalculate(60);
		wheat.yieldCalculate(90);
		
	}	
}
		
