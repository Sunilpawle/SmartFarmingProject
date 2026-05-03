package SmartFarming;

public class Wheat extends Crop {
	 
	 double wheatRate = 2200;

	public Wheat( String CropName ,int growthTime, double LandArea) {
		super(CropName,  growthTime, LandArea);
		}

    public void yieldCalculate(int production) {
	    double income = LandArea * production * wheatRate;
	    capital += income;

	    System.out.println("Income: " + income);

	    CropDao dao = new CropDao();
	    dao.saveCrop(CropName, growthTime, LandArea, production, income);
	}

	
	public String toString() {
		return "Wheat [CropName=" + CropName+", growthTime=" + growthTime + ", LandArea=" + LandArea + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
     
}
