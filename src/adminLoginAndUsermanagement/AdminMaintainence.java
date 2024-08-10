package adminLoginAndUsermanagement;
import java.util.Scanner;

public class AdminMaintainence {
	static String defultUser="Admin";

	public void admin() {
		
		System.out.println("\n\n\n1.List users");
		System.out.println("2.list users along with password");
		System.out.println("3.Add User ");
		System.out.println("4.List Blocked Users");
		System.out.println("5.Unblock a user");
		System.out.println("6.logout");
		System.out.print("Enter your Choice : ");
		Scanner sc5=new Scanner(System.in);
		int choice=sc5.nextInt();
		if(choice==1)
		{
			ClearConsole.clearConsole();
			int i;
			System.out.println("************************************");
			System.out.println("********** Active Users ************");
			System.out.println("************************************");
			for (i=0;i<UserCred.userTable.size();i++)
			{
				System.out.println(i+"."+UserCred.userTable.get(i));
			}
		  
			admin();
		}
		else if (choice==2)
		{
			ClearConsole.clearConsole();
		
			int i;
			System.out.println("************************************");
			System.out.println("********* User Table With Pass******");
			System.out.println("************************************");
			for  (i=0;i<UserCred.userTable.size();i++)
			{
				System.out.println(i+". User Name= "+UserCred.userTable.get(i)+"  Password : "+UserCred.passTable.get(i));
				
				
			}
			 
			admin();
		}
		else if (choice==3) {
			ClearConsole.clearConsole();
		
			UserCred new22 = new UserCred();
			new22.signUp(defultUser);
		
			admin();
			
			
		}
		else if(choice==6) {
			ClearConsole.clearConsole();
			System.out.println("Logout Sucessfull\n\n");
			Lobby new22 =new Lobby();
			new22.lobbyPage();
		}
		else if(choice==4) {
			ClearConsole.clearConsole();
			int i=0;
			System.out.println("************************************");
			System.out.println("********* Blocked Users ************");
			System.out.println("************************************");
			for  (i=0;i<UserCred.blockList.size();i++)
			{
			System.out.println(i+". User Name= "+UserCred.blockList.get(i));
			}
			admin();
		}
		
		else if(choice==5) {
			ClearConsole.clearConsole();
			int i;
			System.out.println("************************************");
			System.out.println("********* Blocked Users ************");
			System.out.println("************************************");
			for  (i=1;i<UserCred.blockList.size()+1;i++)
			{
			System.out.println(i+". User Name= "+UserCred.blockList.get(i-1));
			}
			
			Scanner sc6=new Scanner(System.in);
			System.out.println("Enter the User S.No to Unblock or Press 0 to Main menu");
			System.out.print("Enter your Choice");
			int a1=sc6.nextInt();
			if(a1>0)
			{
				System.out.println("User : "+UserCred.blockList.get(a1-1)+" Removed sucessfully" );
				UserCred.blockList.remove(a1-1);
				admin();
			}
			else {
				admin();
			}
			
		}
		
		
		else {
			ClearConsole.clearConsole();
		
			admin();
		}
	}
	
	
}
