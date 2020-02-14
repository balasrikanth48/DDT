package commonFunLib;

import utilities.ExcelFileUtil;

public class DriverFactory {

	public static void main(String[] args) throws Throwable {
		ERP_Functions erp=new ERP_Functions();
		ExcelFileUtil  exl=new ExcelFileUtil();
		int rowco=exl.getrowcount("Supplier");
		int colco=exl.getcolcount("Supplier");
		
		for(int i=1;i<=rowco;i++){
			String Supplier_Name=exl.getData("Supplier", i, 0);
			String Address=exl.getData("Supplier", i, 1);
			String City=exl.getData("Supplier", i, 2);
			String Country=exl.getData("Supplier", i, 3);
			String Contact_Person=exl.getData("Supplier", i, 4);
			String Phone_Number=exl.getData("Supplier", i, 5);
			String Email=exl.getData("Supplier", i, 6);
			String Mobile_Number=exl.getData("Supplier", i, 7);
			String Notes=exl.getData("Supplier", i, 8);
			
			erp.lanchAPP("http://webapp.qedge.com/");
			erp.login("admin", "master");
			String results=erp.supplier(Supplier_Name, Address, City, Country, Contact_Person,
					Phone_Number, Email, Mobile_Number, Notes);
			erp.closebrw();
			exl.SetCellData("Supplier", i, 9, results);
			
			
		}
		

	}

}
