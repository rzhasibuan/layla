package SeterAndGetter;

import java.util.Set;

public class SeterAndGetter {

    private String genderUser;
    private String nameUser;
    private String ageUSer;
// this mathod setter
    public void setGander(String gender){
        this.genderUser = gender;
    }

    public void setNameUser(String name){
        this.nameUser = name;
    }

    public void setAge(String age){
        this.ageUSer = age;
    }

//    this method getter
    public String getGenderUser(){
        return this.genderUser;
    }

    public String getNameUser(){
        return this.nameUser;
    }

    public String getAgeUSer() {
        return this.ageUSer;
    }
}


