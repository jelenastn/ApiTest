package pojo;

public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private boolean isLearningJava;

    public Person(String firstname, String lastname, int age, boolean isLearningJava) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.isLearningJava = isLearningJava;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLearningJava() {
        return isLearningJava;
    }

    public void setLearningJava(boolean learningJava) {
        isLearningJava = learningJava;
    }
}
