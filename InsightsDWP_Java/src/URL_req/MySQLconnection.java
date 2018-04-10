package URL_req;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLconnection 
{
	public static void main(String args[]) throws Exception
	{
		createTable();
		insert();
	}
	public static Connection getConnection() throws Exception
	{
		try
		{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/newsinsights";
			Class.forName(driver);
			Connection connec = DriverManager.getConnection(url, "root","");
			System.out.println("connected");
			return connec;
		}catch(Exception e )
		{
			System.out.println(e);
		}
		return null;
	}
	public static void createTable() throws Exception
	{
		try
		{
			//String section[] = new String[4];
			Connection conn = getConnection();
			String section[] = {"Business", "Banking", "Finance", "Technology"};
			int i, j=0;
			String table1 = "CREATE TABLE IF NOT EXISTS "
					+ "newsinsights.usr(userid int PRIMARY KEY AUTO_INCREMENT, "
					+ "username varchar(25) UNIQUE NOT NULL, "
					+ "pass varchar(25) NOT NULL, "
					+ "email varchar(25) UNIQUE NOT NULL)";
			PreparedStatement create = conn.prepareStatement(table1);
			create.executeUpdate();
			for(i=0; i<4; i++)
			{
				
					String sectionCreate = "CREATE TABLE IF NOT EXISTS "
							+ "newsinsights."+ section[i] +"(id int PRIMARY KEY AUTO_INCREMENT, keywrd varchar(30) NOT NULL, "
							+ "day date UNIQUE NOT NULL, "
							+ "frequency int UNIQUE NOT NULL)";
			PreparedStatement createTable = conn.prepareStatement(sectionCreate);
			createTable.executeUpdate();
			}
		}catch(Exception e) { System.out.println(e);}
		finally {System.out.println("Create function executed");}
	}
	public static void insert() throws Exception
	{
		String var1 = "admin";
		String var2 = "admin";
		String var3 = "sarahsonje99@gmail.com";
		try
		{
			System.out.println("HI11");
			Connection conn = getConnection();
			System.out.println("H22");
			PreparedStatement insert = conn.prepareStatement("INSERT INTO "
					+ "usr(username, pass, email) values('"
					+var1+"', '"+var2+"', '"+var3+"')");
			System.out.println("HI33");
			//insert.executeUpdate();
			System.out.println("HI34");
			String section[] = {"Business", "Banking", "Finance", "Technology"};
			System.out.println("HI75");
			String keyword[] = {"HDFC", "Tesla", "Aviation", "GST"};
			StrInt stored[]= new StrInt[description.mysize];
			int i, j = 0;
			System.out.println("HI4"+ "");
			for(i=0; i<4; i++)
			{
			
				for(j=0; j<4; j++) 
				{
					System.out.println("HI1");
					description obj1= new description();
					System.out.println(keyword[j]);
					stored=obj1.FindFreq(keyword[j]);
					System.out.println("error");
					System.out.println(stored[j].date);
					System.exit(0);
					for(int k=0;k<description.mysize;k++)
					{
					String sectionCreate = "INSERT INTO "
						+ section[i] +"(date, frequency) VALUES('"+keyword[j]+"', '"+stored[k].date +"', "+stored[k].freq+");";
					PreparedStatement createTable = conn.prepareStatement(sectionCreate);
					createTable.executeUpdate();
					}
			}
			}
			
		}catch(Exception e) {System.out.println(e);}
		finally {System.out.println("Insert function completed");}
		
	}
}

