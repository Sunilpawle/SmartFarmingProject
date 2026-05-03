package SmartFarming;
   
public class Rice extends Crop{
	public double RiceRate= 2000;

	public Rice( String CropName,int growthTime, double LandArea ) {
		super( CropName,growthTime, LandArea );
		
		
	}
public void yieldCalculate(int production) {
	    double income = LandArea * production * RiceRate;
	    capital += income;

	    System.out.println("Income: " + income);

	    CropDao dao = new CropDao();
	    dao.saveCrop(CropName, growthTime, LandArea, production, income);
	}

	
	public String toString() {
		return "Rice [RiceRate=" + RiceRate + "CropName: "+ CropName+", growthTime=" + growthTime + ", LandArea="
				+ LandArea + ",  getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
		
		
	}
	


