package com.campustweet.model;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


private String username;

private String email;

private String password;


private String course;

private String year;

private String skills;

private String bio;



public Long getId(){
return id;
}


public String getUsername(){
return username;
}

public void setUsername(String username){
this.username=username;
}


public String getEmail(){
return email;
}

public void setEmail(String email){
this.email=email;
}


public String getPassword(){
return password;
}

public void setPassword(String password){
this.password=password;
}


public String getCourse(){
return course;
}

public void setCourse(String course){
this.course=course;
}


public String getYear(){
return year;
}

public void setYear(String year){
this.year=year;
}


public String getSkills(){
return skills;
}

public void setSkills(String skills){
this.skills=skills;
}


public String getBio(){
return bio;
}

public void setBio(String bio){
this.bio=bio;
}

}