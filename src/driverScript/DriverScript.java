package driverScript;

import commonFunLib.ERP_Functions;
import utilities.ExcelFileUtil;

public class DriverScript {

	public static void main(String[] args) throws Exception 
	{
      ExcelFileUtil exl=new ExcelFileUtil();
      ERP_Functions erp=new ERP_Functions();
      int rowCount=exl.getrowcount("Supplier");
      
      for (int i = 1; i <=rowCount; i++)
      {
		String sname=exl.getData("Supplier", i,0);
		String address=exl.getData("Supplier", i, 1);
		String city=exl.getData("Supplier", i, 2);
		String country=exl.getData("Supplier", i, 3);
		String cperson=exl.getData("Supplier", i, 4);
		String pnumber=exl.getData("Supplier", i, 5);
		String mail=exl.getData("Supplier",i, 6);
		String mnumber=exl.getData("Supplier", i, 7);
		String note=exl.getData("Supplier", i, 8);
		  
		
		erp.lanchAPP("http://webapp.qedge.com/");
		erp.login("admin", "master");
		String result=erp.supplier(sname, address, city, country, cperson, pnumber, mail, mnumber, note);
		 erp.closebrw();
		exl.SetCellData("Supplier", i, 9,result);   
	  }

	}

}
