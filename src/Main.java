public class Main {
    public static void main(String[] args) {
        Student student = new Student(18, "Ivan", "Zolotarev", "Krivoy Rog", "KTY", "Computer techologies", 0);
        Student student2 = new Student(19, "Sergey", "Zolotarev", "Krivoy Rog", "KTY", "Computer techologies", 700);
        Student student3 = new Student(18, "Olga", "Prohorova", "Krivoy Rog", "KTY", "Computer techologies", 500);
        Student student4 = new Student(21, "Pavel", "Alrhin", "Krivoy Rog", "KTY", "Computer techologies", 0);
        Student student5 = new Student(25, "Eaterina", "Andreeva", "Krivoy Rog", "KTY", "Computer techologies", 700);
        Student student6 = new Student(17, "Mihail", "Beliy", "Krivoy Rog", "KTY", "Computer techologies", 500);
        Student student7 = new Student(20, "Anton", "Panlov", "Krivoy Rog", "KTY", "Computer techologies", 0);
        Student student8 = new Student(22, "Tatyna", "Koroleva", "Krivoy Rog", "KTY", "Computer techologies", 0);
        Student student9 = new Student(21, "Victoiy", "Kotova", "Krivoy Rog", "KTY", "Computer techologies", 700);
        Student student10 = new Student(18, "Pet", "Nikolayv", "Krivoy Rog", "KTY", "Computer techologies", 500);
        Group group = new Group();
        try {
            group.addStudent(student10);
            group.addStudent(student);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student10);
            group.addStudent(student9);
            group.addStudent(student8);
            group.addStudent(student7);
            group.addStudent(student6);
            group.addStudent(student5);
            group.addStudent(student4);
        } catch (MyException e) {
            e.printStackTrace();
        }
        group.removeStudent(student10);
        System.out.println(group.toString());
        Student [] rezultSearchStudent = group.searchStudent("Zolotarev");
        for(Student studentSearch: rezultSearchStudent) {
            if(studentSearch==null)
            {
                System.out.println("There is no student with the specified surname in the grouper");
            } else {
                System.out.println(studentSearch.informationOutput());
            }
        }
    }
}
