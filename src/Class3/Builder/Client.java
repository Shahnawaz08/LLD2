package Class3.Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("John");
        builder.setAge(22);
        builder.setBatch("B2");
        builder.setUniversityName("University of Texas");
        builder.setGradYear(2023);
        builder.setPsp(3.5);
        Student student = new Student(builder);
        System.out.println("Student name: "+student.getName());
    }
}
