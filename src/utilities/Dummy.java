package utilities;

public class Dummy {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 ExcelFileUtil exl=new ExcelFileUtil();
		 int totalrow=exl.getrowcount("supplier");
		 System.out.println("total no of roe are"+ totalrow);
		 int totalcol=exl.getcolcount("supplier");
		 System.out.println("the total no of col are"+totalcol);
		  String cellData=exl.getData("supplier",2,3);
		  System.out.println("the data in 2,3 col is"+ cellData);
		  exl.SetCellData("supplier", 4, 5,"Fail");
	}

}
