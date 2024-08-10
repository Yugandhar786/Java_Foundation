package adminLoginAndUsermanagement;

import java.util.*;
import java.util.Scanner;

public class StartPage {

//	StartPage obj1 =new StartPage();
	public static void main(String[] args) {

		Lobby obj2 = new Lobby();
		obj2.lobbyPage();
	}

}

class Lobby extends StartPage {

	public void lobbyPage() {
//		ClearConsole.clearConsole();

		System.out.print("\n\nExisting User  ");
		System.out.print(": 1.Sign In\n\n");
		System.out.print("New User? : ");
		System.out.println(" 2.Sign Up\n");
		System.out.print("Enter You Choice: ");
		Scanner redir=new Scanner(System.in);
		int redir1=redir.nextInt();
		
		try {
		if(redir1==1)
		{
			SignInPage sign1=new SignInPage();
			sign1.signIn();
			
			
		}
		else if(redir1==2)
		{
			ClearConsole.clearConsole();
			UserCred sign2=new UserCred(); 
			sign2.signUp("Unknown");
			
		}
		else {
			System.out.println("Invalid Choice");
			System.out.println("Please Try Again");
			lobbyPage();
		}
			
	}catch(InputMismatchException e)
		{
		System.out.println(e.getMessage());
		System.out.println("Your have Entered the Text only numbers allowed ");
		System.out.println("Please Try Again");
		lobbyPage();
		
		}
	}
}

class SignInPage extends StartPage {

	public void signIn() {

//		ClearConsole.clearConsole();
//		Scanner sc1=new Scanner(System.in);
//		Scanner sc2=new Scanner(System.in);
//		System.out.println("************************************");
//		System.out.print("UserName: ");
//		String userName=sc1.nextLine();
//		System.out.print("Password: ");
//		String passWord=sc2.nextLine();
//		System.out.println("************************************");
		UserCred login1 = new UserCred();
		login1.loginValidate();
	
		

	}

}
