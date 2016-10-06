package ca.ualberta.cs.lonelytwitter;

/**
 * Created by watts1 on 9/13/16.
 */
public class NormalTweet extends Tweet implements Tweetable {

    /**
     * This constructor makes a NormalTweet with given string parameter.
     *
     * @param message this parameter is the given string for the tweet. If it is set to empty                string then it will be replaced by ...
     */
    public NormalTweet(String message){
        super(message);
    }

    /**
     * Will return whether or not the tweet is important
     * @return Will return false since this is a NormalTweet
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }


    public int compareTo(Object o) {
        return  this.getDate().compareTo(((Tweet)o).getDate());
    }
}
