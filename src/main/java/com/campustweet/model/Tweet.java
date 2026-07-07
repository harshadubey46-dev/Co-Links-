package com.campustweet.model;

import jakarta.persistence.*;

@Entity
public class Tweet{


@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;


private String content;

private String category;

private int likes=0;


@ManyToOne
private User user;



public Long getId(){
return id;
}


public String getContent(){
return content;
}

public void setContent(String content){
this.content=content;
}


public int getLikes(){
return likes;
}

public void setLikes(int likes){
this.likes=likes;
}



public String getCategory(){
return category;
}

public void setCategory(String category){
this.category=category;
}



public User getUser(){
return user;
}

public void setUser(User user){
this.user=user;
}


}