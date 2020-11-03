public class Student extends Person{
    private String university;
    private String faculty;
    private int scholarship;

    public Student(int age, String name, String surname, String address, String university, String faculty, int scholarship) {
        super(age, name, surname, address);
        this.university = university;
        this.faculty = faculty;
        this.scholarship = scholarship;
    }

    public Student(String university, String faculty, int scholarship) {
        this.university = university;
        this.faculty = faculty;
        this.scholarship = scholarship;
    }

    public Student() {

    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    public String informationOutput() {
        return super.informationOutput() +" university - " + university+ ";"+ " faculty - "+faculty+";"+" scholarship - " +scholarship+";";
    }
}
