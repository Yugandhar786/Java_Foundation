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
		System.out.println("6.List Admin Users");
		System.out.println("7.Make a user As Admin");
		System.out.println("8.Make a user As Non-Admin");
		System.out.println("9.logout");
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
			System.out.println();
			for  (i=1;i<UserCred.blockList.size()+1;i++)
			{
			System.out.println(i+". User Name= "+UserCred.blockList.get(i-1));
			}
			
			Scanner sc6=new Scanner(System.in);
			System.out.println("\nEnter the User S.No to Unblock or Press 0 to Main menu\n");
			System.out.print("Enter your Choice : ");
			System.out.println();
			int a1=sc6.nextInt();
			if(a1>0)
			{
				System.out.println("User : "+UserCred.blockList.get(a1-1)+" Unlocked sucessfully" );
				UserCred.blockList.remove(a1-1);
				admin();
			}
			else {
				admin();
			}
			
		}
		
		if(choice==6)
		{
			ClearConsole.clearConsole();
			int i;
			System.out.println("************************************");
			System.out.println("********** Admin  Users ************");
			System.out.println("************************************");
			for (i=0;i<UserCred.adminBucket.size();i++)
			{
				System.out.println(i+"."+UserCred.adminBucket.get(i));
			}
		  
			admin();
		}
		
		
		else if (choice==7) {
			ClearConsole.clearConsole();
			int i;
			System.out.println("************************************");
			System.out.println("********** Active Users ************");
			System.out.println("************************************");
			for (i=1;i<UserCred.userTable.size()+1;i++)
			{
				System.out.println(i+"."+UserCred.userTable.get(i-1));
			}	
			Scanner sc7=new Scanner(System.in);
			System.out.println("\n\n\nEnter the user int Address to make user admin or press 0 to main menu \n");
			System.out.print("Enter your choice : ");
			int a2=sc7.nextInt();
			if(a2>0)
			{
				UserCred.adminBucket.add(UserCred.userTable.get(a2-1));
				System.out.println("\nUser "+UserCred.userTable.get(a2-1)+"  Is Admin Now");
				System.out.println();
				admin();
			}
			else {
				admin();
			}
		}
		
		
		else if (choice==8) {
			ClearConsole.clearConsole();
			int i;
			System.out.println("************************************");
			System.out.println("********** Admin  Users ************");
			System.out.println("************************************");
			for (i=1;i<UserCred.adminBucket.size()+1;i++)
			{
				System.out.println(i+"."+UserCred.adminBucket.get(i-1));
			}	
			Scanner sc8=new Scanner(System.in);
			System.out.println("\n\nEnter the user int Address to make user admin or press 0 to main menu \n");
			System.out.print("Enter your choice : ");
			int a3=sc8.nextInt();
			if(a3>0)
			{
				;
				System.out.println("\n\nUser "+UserCred.adminBucket.get(a3-1)+" Is No more Admin");
				UserCred.adminBucket.remove(a3-1);
				System.out.println();
				admin();
			}
			else {
				admin();
			}
		}
		
		
		else if(choice==9) {
			ClearConsole.clearConsole();
			System.out.println("Logout Sucessfull\n\n");
			Lobby new22 =new Lobby();
			new22.lobbyPage();
		}
		
		else {
			ClearConsole.clearConsole();
		
			admin();
		}
	}
	
	
}
