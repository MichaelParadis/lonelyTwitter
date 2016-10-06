package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Maintains a list of tweets!
 */
public class TweetList{
    private List<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Adds a tweet to the TweetList
     *
     * @param tweet the tweet
     */
    public void add(Tweet tweet) {
        if (this.hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        tweets.add(tweet);
        Collections.sort(tweets);
    }

    /**
     * Has tweet boolean.
     * Will return true or flase depending on if the tweet is in the list of tweets.
     * @param tweet the tweet
     * @return True/False
     */
    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    /**
     * Gets tweet at index i.
     *
     * @param i the index
     * @return the tweet
     */
    public Tweet getTweet(int i) {
        return tweets.get(i);
    }

    /**
     * Remove the given tweet from the list of tweets.
     *
     * @param tweet the tweet
     */
    public void remove(Tweet tweet) {
        tweets.remove(tweet);
    }

    /**
     * Get the number of tweets in the TweetList.
     *
     * @return the int
     */
    public int getCount(){
        return tweets.size();
    }


}

