public class Inheritance_Checker_Exercise8 {

    public static void main(String[] args) {
        String[] teacherCourses = {"Data Structures", "Operating Systems", "Networking"};
        Teacher prof =
                new Teacher("Ada", "Lovelace", "Female", "Computer Science", teacherCourses);

        Student undergrad =
                new Student("Bob", "Smith", "Male", "S12345");

        String[] phdCourses = {"Advanced AI", "Neural Networks"};
        PhdStudent doc =
                new PhdStudent("Grace", "Hopper", "Female", "D999", "Engineering", phdCourses);

        System.out.println(prof.toString());
        System.out.println(undergrad.toString());
        System.out.println(doc.toString());

        PhdStudent docCopy = new PhdStudent("Grace", "Hopper", "Female", "D999", "Engineering", phdCourses);

        System.out.println("Are docs same? " + doc.equals(docCopy));
    }

}
