package Class3.Builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String universityName;

    private int gradYear;
    private double psp;

    public Student(Builder builder){
        if(builder.getGradYear()>2022){
            throw new IllegalArgumentException("Graduation year should be less than 2022");
        }
        this.name=builder.getName();
        this.age=builder.getAge();
        this.batch=builder.getBatch();
        this.universityName=builder.getUniversityName();
        this.gradYear=builder.getGradYear();
        this.psp=builder.getPsp();

    }

    //create getter and setter methods for all the fields

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public String getUniversityName() {
        return universityName;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    public int getGradYear() {
        return gradYear;
    }
    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(double psp) {
        this.psp = psp;
    }

}
