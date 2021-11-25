package action;

import java.util.Scanner;
import svc.MemberRegistService;
import util.ConsoleUtil;
import vo.Member;

public class MemberRegistAction implements Action {
	
	
	public void execute(Scanner scan) throws Exception{
		// TODO Auto-generated method stub
		ConsoleUtil consoleUtil = new ConsoleUtil();
		Member newMember = consoleUtil.getNewMember(scan);
		
		//����Ͻ� ������ Service Ŭ�������� ó����.
		MemberRegistService memberRegistService = new MemberRegistService();
		
		boolean registSuccess = memberRegistService.registMember(newMember);
		if(registSuccess) {
			consoleUtil.printRegistSuccessMessage(newMember.getId());
			}
		else {
			consoleUtil.printRegistFailMessage(newMember.getId());
		}

	}

}
