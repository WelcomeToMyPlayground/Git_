package sec01;

public class Student { // public class Student = ���̺귯��(API) Ŭ����
	// �л��� ���� �ִ� �Ӽ�(�ʵ�)
	int age; // ����
	String gendar; // ����
	String name; // �̸�

	public Student() { // Student�� ������, ��ü ������ �ʱ�ȭ 
		
	}

	public int getAge() { // get�� �������� ��, set�� ����ִ� �� == �޼ҵ�
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGendar() {
		return gendar;
	}

	public void setGendar(String gendar) {
		this.gendar = gendar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public int setAge(int age) { // �޼ҵ�, setAge = ���̸� ����
 		return age;
	}*/
}
