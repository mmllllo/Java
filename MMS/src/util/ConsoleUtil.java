package util;

import java.util.Scanner;
import vo.Member;
import vo.SearchData;

public class ConsoleUtil {
	
	public Member getNewMember(Scanner scan) {
		Member newMember = new Member();
		System.out.println("===== �� ȸ�� ���� ���=====");
		System.out.print("ȸ�����̵� : ");
		int id = scan.nextInt();
		System.out.print("ȸ���̸� : ");
		String name = scan.next();
		System.out.print("ȸ���̸��� : ");
		String email = scan.next();
		System.out.print("ȸ���ּ� : ");
		String addr = scan.next();
		System.out.print("ȸ����� : ");
		String hobby = scan.next();
		System.out.print("ȸ����ȭ��ȣ : ");
		String tel = scan.next();
		System.out.print("ȸ������ : ");
		int age = scan.nextInt();
		
		newMember.setId(id);
		newMember.setName(name);
		newMember.setEmail(email);
		newMember.setAddr(addr);
		newMember.setHobby(hobby);
		newMember.setTel(tel);
		newMember.setAge(age);
		return newMember;		
	}
	public void printRegistSuccessMessage(int id) {
		System.out.println(id + "ȸ�� ��� ����");
		}
	public void printRegistFailMessage(int id) {
		System.out.println(id + "ȸ�� ��� ����");
	}
	
	public void printMemberList(Member[] memberArray) {
		if(memberArray.length == 0) {
			System.out.println("�߰��� ȸ�� ������ �����ϴ�.");
		}
		else {
			for(int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}
	
	public int getId(String msgKind, Scanner scan) {
		System.out.print(msgKind+ "���̵� : ");
		return scan.nextInt();
		//����ڰ� �Է��� ���̵� �ٷ� return�� �ش�.
	}
	public Member getNewMember(Member oldMember, Scanner scan) {
		Member member = new Member();
		System.out.println("=====�� ȸ�� ���� ����=====");
		System.out.println("ȸ�� ���̵� : " + oldMember.getId());
		
		System.out.println("���� �̸� : " + oldMember.getName());
		System.out.print("�� ȸ�� �̸� : ");
		String name = scan.next();
		
		System.out.println("���� �̸��� : " + oldMember.getEmail());
		System.out.print("�� ȸ�� �̸���: ");;
		String email = scan.next();
		
		System.out.println("���� �ּ� : " + oldMember.getAddr());
		System.out.print("�� ȸ�� �ּ� : ");
		String addr = scan.next();
		
		System.out.println("���� ��� : " + oldMember.getHobby());
		System.out.print("�� ȸ�� ��� : ");
		String hobby = scan.next();
		
		System.out.println("���� ��ȭ��ȣ : " + oldMember.getTel());
		System.out.print("�� ȸ�� ��ȭ��ȣ : ");
		String tel = scan.next();
		
		System.out.println("���� ���� : " + oldMember.getAge());
		System.out.print("�� ȸ�� ����: ");
		int age = scan.nextInt();
		
		member.setId(oldMember.getId());
		member.setName(name);
		member.setEmail(email);
		member.setAddr(addr);
		member.setHobby(hobby);
		member.setTel(tel);
		member.setAge(age);
		
		return member;
		
	}
	
	public void printUpdateSuccessMessage(int id) {
		System.out.println(id+ "ȸ�� ���� ���� ����");
	}
	
	public void printUpdateFailMessage(int id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}
	public void printDeleteSuccessMessage(int id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}
	public void printDeleteFailMesseage(int id) {
		System.out.println(id + "ȸ�� ���� ���� ����");
	}
	
	public SearchData getSearchData(Scanner scan) {
		System.out.println("�˻� ������ �����Ͻÿ�.");
		System.out.println("1. ���̵�");
		System.out.println("2. �̸�");
		System.out.println("�˻� ���� : ");
		String searchCondition = scan.next(); // �˻� ���� ����
		String searchValue = null; //�˻� ��
		
		if(searchCondition.contentEquals("���̵�")) {
			System.out.print("�˻��� ���̵� : ");
			searchValue = scan.next();
		}
		else if(searchCondition.equals("�̸�")) {
			System.out.print("�˻��� �̸�: ");
			searchValue = scan.next();
		}
		SearchData searchData = new SearchData(); //������ ���� �� ���̹Ƿ� ������ ���� �Ӽ����� ������ Ŭ���� ����
		searchData.setSearchCondition(searchCondition);
		searchData.setSearchValue(searchValue);;
		return searchData;
	}
	
	public void printSearchMember(Member member) {
		if(member== null) {
			System.out.println("�˻��� ����� �����ϴ�.");
		}
		else {
			System.out.println(member.getId() + "���� �˻��� ��� ");
			System.out.println(member);
		}
	}
	
	public void printSearchMemberArray(Member[] memberArray) {
		if(memberArray == null) {
			System.out.println("�̸����� �˻��� ����� �����ϴ�.");
		}
		else {
			System.out.println("�̸����� �˻��� ���");
			for(int i = 0; i < memberArray.length; i++) {
				System.out.println(memberArray[i]);
			}
		}
	}

}
