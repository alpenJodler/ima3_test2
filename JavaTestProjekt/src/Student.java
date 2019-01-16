
public  class Student {
	private String name;
	private int gebJahr;
	private String studiengang;
	
	
	public Student(String name, int gebJahr, String studiengang) {
		super();
		this.name = name;
		this.gebJahr = gebJahr;
		this.studiengang = studiengang;
	}
	public void ausgeben() {
		System.out.println(name + " / " + gebJahr +  " / " + studiengang);
	}


	public static void main(String[] args) {
		Student s1 = new Student("Susi", 1997, "IMA");
		s1.ausgeben();
	}

}
