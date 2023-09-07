package classes;

public abstract class People {
    private String name;
    private String surname;
    private int age;

    public People(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public People(){
        this.name = "Null";
        this.surname = "Null";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
