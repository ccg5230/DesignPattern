package design.pattern.filter.bean;

public class Person {

    private String name; //姓名
    private String gender; //性别
    private String maritalStatus; //婚姻状况

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}