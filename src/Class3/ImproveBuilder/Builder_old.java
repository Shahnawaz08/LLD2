package Class3.ImproveBuilder;

public class Builder_old {
    private String name;
    private int age;
    private String batch;
    private String universityName;

    private int gradYear;
    private double psp;

//    public Student build(){
//        if(this.getGradYear()>2022){
//            throw new IllegalArgumentException("Graduation year should be less than 2022");
//        }
//        return new Student(this);
//    }

    //create getter and setter methods for all the fields

    public String getName() {
        return name;
    }
    public Builder_old setName(String name) {
        this.name = name;
        return this;
    }
    public int getAge() {
        return age;
    }
    public Builder_old setAge(int age) {
        this.age = age;
        return this;
    }
    public String getBatch() {
        return batch;
    }
    public Builder_old setBatch(String batch) {
        this.batch = batch;
        return this;
    }
    public String getUniversityName() {
        return universityName;
    }
    public Builder_old setUniversityName(String universityName) {
        this.universityName = universityName;
        return this;
    }
    public int getGradYear() {
        return gradYear;
    }
    public Builder_old setGradYear(int gradYear) {
        this.gradYear = gradYear;
        return this;
    }
    public double getPsp() {
        return psp;
    }
    public Builder_old setPsp(double psp) {
        this.psp = psp;
        return this;
    }
}
