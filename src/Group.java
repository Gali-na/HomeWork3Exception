import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Group {
    private Student[] group = new Student[10];

    public Group(Student[] group, String groupName) {

        this.group = group;
    }

    public Group() {

    }

    public Student[] getGroup() {

        return group;
    }

    public void setGroup(Student[] group) {

        this.group = group;
    }

    public void addStudent(Student student) throws MyException {
        for (int i = 0; i < this.group.length; i++) {
            if (this.group[i] == null) {
                this.group[i] = student;
                return;
            }
        }
        throw new MyException("Exceeded the maximum number of students");
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < this.getGroup().length; i++) {
            if (this.getGroup()[i].getFaculty().equalsIgnoreCase(student.getFaculty())
                    && this.getGroup()[i].getUniversity().equalsIgnoreCase(student.getUniversity())
                    && this.getGroup()[i].getAge() == student.getAge()
                    && this.getGroup()[i].getName().equalsIgnoreCase(student.getName())
                    && this.getGroup()[i].getSurname().equalsIgnoreCase(student.getSurname())
                    && this.getGroup()[i].getScholarship() == student.getScholarship()
                    && this.getGroup()[i].getAddress().equalsIgnoreCase(student.getAddress())) {
                this.getGroup()[i] = null;
                return;
            }
        }
    }

    public void searchStudent (String surname) {
        List<Student> foundStudent = new ArrayList<>();
        for (int i = 0; i < this.group.length; i++) {
            if (this.group[i] != null) {
                boolean b = this.group[i].getSurname().equalsIgnoreCase(surname);
                if (this.group[i].getSurname().equalsIgnoreCase(surname)) {
                    foundStudent.add(this.group[i]);
                }
            }
        }
        if (foundStudent.isEmpty()) {
            System.out.println("There is no student with the specified surname in the grouper");
            return;
        }
        for(Student student:foundStudent) {
            System.out.println(student.informationOutput());
        }
    }

    @Override
    public String toString() {
        Comparator<Student> comparato = new StudentSurnameComparator().thenComparing(new StudentNameComparator());
        Arrays.sort(this.group, comparato);
        String rezult = "";
        for (int i = 0; i < this.group.length; i++) {

            if(this.group[i]==null){
                continue;
            }else {
                rezult = rezult  + this.group[i].informationOutput()+"\n";
            }
        }
        return rezult;
    }
}
