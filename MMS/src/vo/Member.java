package vo;
/*
 * toString() : ��ü�� ������ ���ڿ��� ��ȯ�� �ִ� �޼ҵ�
 * object���� �����Ǵ� �⺻ ����� Ŭ���� �̸� + @ + �ؽ��ڵ� ������ ������ ��ȯ
 */
public class Member {

	private int id;//�ĺ���
	private String name;
	private String email;
	private String addr;
	private String hobby;
	private String tel;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public  String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ȸ�� ���̵� : " + id + ", �̸� : " + name + ", �̸��� : " + email + ", �ּ� : " + addr + ", ��� : " + hobby + ", ��ȭ��ȣ : " + tel +" ,���� : " + age;

	}

}