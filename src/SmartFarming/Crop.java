package SmartFarming;

public abstract class Crop  {
	static double capital =50000;
	public String CropName;
	public int growthTime;
	public double LandArea;
	
	Crop(){
		
	}
	 Crop( String CropName,int growthTime, double LandArea) {
		super();
		this.CropName= CropName;
		this.growthTime = growthTime;
		this.LandArea = LandArea;
		
	}
	 
	 public abstract void yieldCalculate(int production);
	 
	 
	 public void CropDetails() {
		 System.out.println("*******Crop Details********");
		 System.out.println( "CropName: "+CropName+ " \n  Growth Time: "+growthTime + "\n LandArea: "+ LandArea );
	 }
	
	
	

}
