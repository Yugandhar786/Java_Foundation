package adminLoginAndUsermanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCred {
	static ArrayList<String> userTable = new ArrayList<>();
	static ArrayList<String> passTable = new ArrayList<>();
	static ArrayList<String> blockList = new ArrayList<>();
	static ArrayList<String> adminBucket = new ArrayList<>();

	public void addItem(String username, String password) {
		
		if (userTable.contains(username)) {
		
			throw new DuplicateEntryException("Duplicate entry found: " + username);
		} else {

			userTable.add(username);
			passTable.add(password);
		}

	}

	public void addItem1(String username, String password) {
		if (userTable.contains(username)) {
			
			throw new DuplicateEntryException("Duplicate entry found: " + username);
		} else {

			userTable.add(username);
			passTable.add(password);
			System.out.println("User Sucessfull Added!");
			System.out.println("Username: " + username + "\nPassword :" + password);
		}

	}

	public void signUp(String user123) {

		if (user123.equals("Admin")) {

			try {
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("************************************");
				System.out.println("********* User Registration ********");
				System.out.println("************************************");
				System.out.print("Enter UserName: ");
				String userName = sc1.nextLine();
				System.out.print("Enter Password: ");
				String passWord = sc2.nextLine();
				System.out.println("************************************");
				addItem1(userName, passWord);

			} catch (DuplicateEntryException e) {
				ClearConsole.clearConsole();
				System.err.println(e.getMessage());
				System.out.println("UserName Already Exist\n");
				System.out.println("Re-Try with another Username");
				signUp("Admin");
				ClearConsole.clearConsole();

			}

			AdminMaintainence new22 = new AdminMaintainence();
			new22.admin();

		} else {

			try {
				Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
				System.out.println("************************************");
				System.out.println("********* User Registration ********");
				System.out.println("************************************");
				System.out.print("Enter UserName: ");
				String userName = sc1.nextLine();
				System.out.print("Enter Password: ");
				String passWord = sc2.nextLine();
				System.out.println("************************************");
				addItem(userName, passWord);

			} catch (DuplicateEntryException e) {
				ClearConsole.clearConsole();
				System.err.println(e.getMessage());
				System.out.println("UserName Already Exist\n");
				System.out.println("Re-Try with another Username");
				signUp("");
				ClearConsole.clearConsole();

			}
			ClearConsole.clearConsole();
			System.out.println("\n\nUser Sucessfully Added !");
			
			Lobby new1 = new Lobby();
			new1.lobbyPage();

		}

	}

//	public void loginValidate1(String user, String pass) {
//		int i, a=0;
//		for(i=0;i<userTable.size()-1;i++) {
//			
//			if(userTable.get(i).equals(user))
//			{
//				a=i;
//				
//			}
//		}
//		
//		if(userTable.get(a).equals(user) && passTable.get(a).equals(pass)) {
//			System.out.println("logged in Sucessfully ");
//			ClearConsole.clearConsole();
//			AdminMaintainence new12=new AdminMaintainence();
//			new12.admin();
//		}
//		else {
//			System.out.println("Logon Failed");
//			System.out.println("Incorrect user Credentials");
//			Lobby new1=new Lobby();
//			new1.lobbyPage();
//		}
//
//
//		
//}
	public void loginValidate() {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String userName;
		String passWord;
		int b = 3;
		while (b != 0) {
			System.out.println("************************************");
			System.out.println("***********login page***************");
			System.out.println("************************************");
			System.out.print("UserName: ");
			userName = sc1.nextLine();
			System.out.print("Password: ");
			passWord = sc2.nextLine();
			System.out.println("************************************");
			String b1= userName;

			if (blockList.contains(userName)) {
				System.out.println("Your Account is locked\n");
				System.out.println("Contact your admin to retrive your account\n");
				Lobby new1 = new Lobby();
				new1.lobbyPage();

			}
			
			else {
				int i, a = 0;

				for (i = 0; i < userTable.size() - 1; i++) {

					if (userTable.get(i).equals(userName)) {
						a = i;
					}

				}
				if (userTable.get(a).equals(userName) && passTable.get(a).equals(passWord)) {
					ClearConsole.clearConsole();
					System.out.println("logged in Sucessfully ");

					AdminMaintainence new12 = new AdminMaintainence();
					new12.admin();
				} else {
					b--;
					ClearConsole.clearConsole();
					System.out.println(b + " Attemps left");
					if (b == 0) {
						blockList.add(userName);
					}
				}

			}
		}

		System.out.println("\nMaximum number of Attempts exceeded");
		System.out.println("\nAccount Locked ");
		System.out.println("\nContact Admin to Unlock the Accout");
		Lobby new1 = new Lobby();
		new1.lobbyPage();

	}

//	public void blockListCheck(String username, String password) {
//		if (blockList.contains(username)) {
//			System.out.println("Your Account is locked\n");
//			System.out.println("Contact your admin to retrive your account\n");
//			Lobby new1 = new Lobby();
//			new1.lobbyPage();
//
//		} else {
//
//			loginValidate();
//
//		}
//	}
}
