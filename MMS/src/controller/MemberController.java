package controller;

import java.util.Scanner;
import action.Action;

public class MemberController {
	public void processRequest(Scanner scan, Action action) {
		try {
			action.execute(scan);
		} catch (Exception e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
