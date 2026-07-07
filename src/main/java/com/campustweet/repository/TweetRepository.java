
package com.campustweet.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.campustweet.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet,Long>{}
