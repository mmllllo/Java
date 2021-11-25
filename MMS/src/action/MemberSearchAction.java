package action;

import java.util.Scanner;
import svc.MemberSearchService;
import util.ConsoleUtil;
import vo.Member;
import vo.SearchData;

public class MemberSearchAction implements Action {
	
	public void execute(Scanner scan) {
		ConsoleUtil consoleUtil = new ConsoleUtil();
		
		SearchData searchData = consoleUtil.getSearchData(scan);
		MemberSearchService memberSearchService = new MemberSearchService();
		if(searchData.getSearchCondition().contentEquals("아이디")) {
			Member member = memberSearchService.searchMemberById(searchData.getSearchValue());
			consoleUtil.printSearchMember(member);
		}
		else if(searchData.getSearchCondition().equals("이름")) {
			Member[] memberArray = memberSearchService.searchMemberByName(searchData.getSearchValue());
			consoleUtil.printSearchMemberArray(memberArray);
		}
	}

}
