package SmartFarming;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CropDao {

	 public void saveCrop(String name, int growthTime, double landArea, int production, double income) {
	        String query = "INSERT INTO crops (crop_name, growth_time, land_area, production, income) VALUES (?, ?, ?, ?, ?)";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(query)) {

	            ps.setString(1, name);
	            ps.setInt(2, growthTime);
	            ps.setDouble(3, landArea);
	            ps.setInt(4, production);
	            ps.setDouble(5, income);

	            ps.executeUpdate();
	            System.out.println("Data saved to database");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
