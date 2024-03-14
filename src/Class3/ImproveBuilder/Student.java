package Class3.ImproveBuilder;



public class Student {
    private String name;
    private int age;
    private String batch;
    private String universityName;

    private int gradYear;
    private double psp;

     private Student(Builder builder){

        this.name=builder.getName();
        this.age=builder.getAge();
        this.batch=builder.getBatch();
        this.universityName=builder.getUniversityName();
        this.gradYear=builder.getGradYear();
        this.psp=builder.getPsp();

    }

    //Create a method to get the builder from the student class
    public static Builder getBuilder(){
        return new Builder();
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

    // inner class
    public static class Builder {
        private String name;
        private int age;
        private String batch;
        private String universityName;

        private int gradYear;
        private double psp;

        public Student build(){
            if(this.getGradYear()>2022){
                throw new IllegalArgumentException("Graduation year should be less than 2022");
            }
            return new Student(this);
        }

        //create getter and setter methods for all the fields

        public String getName() {
            return name;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public int getAge() {
            return age;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public String getBatch() {
            return batch;
        }
        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public String getUniversityName() {
            return universityName;
        }
        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }
        public int getGradYear() {
            return gradYear;
        }
        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public double getPsp() {
            return psp;
        }
        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }
    }



}
