package q1;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class tryDemojdbc 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		String url = "jdbc:oracle:thin:@//localhost:1521/";
		String dbName = "XE";
		String driverName = "oracle.jdbc.driver.OracleDriver";
		String userName = "hr";
		String password = "hr";
		try{
			Class.forName(driverName);
			con = DriverManager.getConnection(url + dbName, userName, password);
			Scanner sc=new Scanner(System.in);String ssu,pwdd;int flag=0;
			System.out.println("Enter Username");
			ssu=sc.next();
			System.out.println("Enter Pwd");
			pwdd=sc.next();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM movie_login");
			if(rs.next())
			{do
			
				{String user=rs.getString("user1");
			String pwd=rs.getString("password1");
			if(ssu.equals(user)&&pwd.equals(pwd))
			{flag=1;
			break;}
			}while(rs.next());
			if(flag==1)
			{ResultSet res=st.executeQuery("Select * from movie_shows");
			while(res.next())
			{System.out.println(res.getString("showid")+res.getString("moviename")+res.getString("showtime"));}
			System.out.println("Enter movie id you want to see");
			int mid;
			mid=sc.nextInt();String mt="";
			ResultSet rr=st.executeQuery("Select * from movie_shows");
			while(rr.next())
			{int eid=Integer.parseInt(rr.getString("showid"));
				if(eid==mid)
					{mt=rr.getString("moviename");}}
			
			byte[] b=mt.getBytes();

			String fileName = new SimpleDateFormat("yyyyMMddHHmm'.txt'").format(new Date());
			FileOutputStream  ff=new FileOutputStream(fileName);
			ff.write(b);
			}
			}
		}catch(Exception e)
		{
			
		}
		}
}
	