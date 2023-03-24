package RunApp;

import mainPackage.CreateTable;
import mainPackage.InsertData;
import mainPackage.ReadData;
import mainPackage.RemoveData;

public class RunApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("unused")
		CreateTable CreateaTable = new CreateTable();
		//CreateTable.createTable("Newusers");
		
		InsertData insertdata = new InsertData();
		//insertdata.OfaUser();
		
		RemoveData removeAuser = new RemoveData();
		//removeAuser.OfaUser();
		
		ReadData giveUser = new ReadData();
		giveUser.ofUser();
	}

}
