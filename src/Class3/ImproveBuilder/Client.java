package Class3.ImproveBuilder;



public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

       Student.Builder builder = Student.getBuilder();
        builder.setName("John");
        builder.setAge(22);
        builder.setBatch("B2");
        builder.setUniversityName("University of Texas");
        builder.setGradYear(2022);
        builder.setPsp(3.5);
//        Student student = new Student(builder);
        Student student = builder.build();
        System.out.println("Student name: "+student.getName());

        //////// make student constructor private
        Student student2=Student.getBuilder().setName("jully")
                                             .setAge(23).setBatch("B3")
                                             .setUniversityName("University of Texas")
                                             .setGradYear(2022)
                                             .setPsp(3.5)
                                             .build();
        System.out.println("Student name: "+student2.getName());
    }
}
