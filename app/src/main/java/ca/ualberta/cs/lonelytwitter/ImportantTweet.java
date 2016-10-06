package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 * This is the ImportantTweet class that is used to specify if a tweet is important.
 * @see Tweet
 */
public class ImportantTweet extends Tweet {

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message that is added to the tweet
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    /**
     * Will return if the tweet is important. Since this is an ImportantTweet is will return tweet.
     * @return true
     */
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

    /**
     * This is used for sorting the tweets in order. Only used when sorting an array of tweets
     * @param  o Is the object we are comparing to our current object.
     * @return integer values.
     */
    public int compareTo(Object o) {
        return  this.getDate().compareTo(((Tweet)o).getDate());
    }
}
