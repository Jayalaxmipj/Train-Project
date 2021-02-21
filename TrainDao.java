package trainProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class TrainDao {
	String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
	String DB_URL="jdbc:mysql://localhost:3306/traininfo?autoReconnect=true&useSSL=false";
	String USERNAME="root";
	String PASSWORD="Jayapj*18";
	
	public Train findTrain(int trainNo)
	{
		int TRAIN_NO=trainNo;
		Train train=null;
		
		try 
		{
			//step1
			Class.forName(DRIVER_NAME);
			System.out.println("class found");
			
			//step2
			Connection con=DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			System.out.println("connected");
			//step3
			PreparedStatement pstmt=con.prepareStatement("SELECT * FROM traindetails.trains=?");
			pstmt.setInt(1, TRAIN_NO);
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				train= new Train(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
				
			}
			con.close();
			System.out.println(train);
		}
		catch(Exception e)
		{
			System.out.println("class not found");
			System.out.println(e);
		}
		return train;
			
		}
}
	
