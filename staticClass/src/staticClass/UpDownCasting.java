package staticClass;

class Person {
    String name;
    String id;
    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String dept;
    String grade;

    public Student(String name) {
        super(name);
    }
}
public class UpDownCasting {

	    public static void main(String[] args) {
	        // ��ĳ���� ����
	        Person person = new Student("MadPlay");
	        System.out.println(person.name);
	        // �ٿ�ĳ����
	        Student student = (Student) person;
	        System.out.println(student.name);
	        // Okay!
	        student.name = "Kimtaeng";

	        // Okay!
	        student.dept = "Computer Eng";
	    }
	}
