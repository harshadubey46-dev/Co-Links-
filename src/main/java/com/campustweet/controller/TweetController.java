package com.campustweet.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.campustweet.model.Tweet;
import com.campustweet.repository.TweetRepository;


@RestController
@RequestMapping("/api/tweets")
@CrossOrigin("*")
public class TweetController {


private final TweetRepository repo;


public TweetController(TweetRepository repo){

    this.repo = repo;

}


// get all tweets

@GetMapping
public List<Tweet> getTweets(){

    return repo.findAll();

}


// create tweet

@PostMapping
public Tweet addTweet(@RequestBody Tweet tweet){

    return repo.save(tweet);

}


// like tweet

@PutMapping("/{id}/like")
public Tweet likeTweet(@PathVariable Long id){


    Tweet t = repo.findById(id).get();

    t.setLikes(t.getLikes()+1);

    return repo.save(t);


}
//UPDATE TWEET

@PutMapping("/{id}")
public Tweet updateTweet(
     @PathVariable Long id,
     @RequestBody Tweet updatedTweet){


 Tweet tweet = repo.findById(id).get();


 tweet.setContent(
     updatedTweet.getContent()
 );


 return repo.save(tweet);

}

// DELETE tweet

@DeleteMapping("/{id}")
public String deleteTweet(@PathVariable Long id){


    repo.deleteById(id);

    return "Tweet Deleted";


}


}