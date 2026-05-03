package SmartFarming;

public class Corn extends Crop {
	public double CornRate = 1550;

	public Corn(String CropName, int growthTime, double LandArea) {
		super(CropName, growthTime, LandArea);
		
	}

	
	public void yieldCalculate(int production) {
	    double income = LandArea * production * CornRate;
	    capital += income;

	    System.out.println("Income: " + income);

	    CropDao dao = new CropDao();
	    dao.saveCrop(CropName, growthTime, LandArea, production, income);
	}


	
	public String toString() {
		return "Corn [CornRate=" + CornRate + ", CropName=" + CropName+ ", growthTime=" + growthTime + ", LandArea="
				+ LandArea + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

		
	}


