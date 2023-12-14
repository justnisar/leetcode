package archived;

mport java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class Tweet{
	private int userId;
	private int tweetId;
	private int serialNumber;
	public Tweet(int userId, int tweetId, int serialNumber) {
		super();
		this.userId = userId;
		this.tweetId = tweetId;
		this.serialNumber = serialNumber;
	}
	public int getUserId() {
		return userId;
	}
	public int getTweetId() {
		return tweetId;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
}

class User{
	private int userId;
	private HashSet<Integer> followersList;
	private List<Tweet> tweetList;
	public int getUserId() {
		return userId;
	}
	public HashSet<Integer> getFollowersList() {
		return followersList;
	}
	public User(int userId) {
		this.userId = userId;
		followersList = new HashSet<Integer>();
		tweetList = new ArrayList<Tweet>();
	}
	public void addTweet(Tweet tweet){
		tweetList.add(tweet);
	}
	public List<Tweet> getTweetList() {
		return tweetList;
	}
}

public class DesignTwitter {

    /** Initialize your data structure here. */
	private HashMap<Integer,User> membersList;
	private int count;
    public DesignTwitter() {
    	membersList = new HashMap<Integer,User>();
    	count = 0;
    }
    private User getUser(int userId) {
		User user;
		if(!membersList.containsKey(userId)){
        	user = new User(userId); 
        }
        else{
        	user = membersList.get(userId);
        }
		return user;
	}
    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        count++;
        User user;
        Tweet tweet = new Tweet(userId,tweetId,count);
        user = getUser(userId);
        user.addTweet(tweet);
        membersList.put(userId,user);
    }
	
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<Integer>();
        List<Tweet> newsFeed = new ArrayList<Tweet>();
        if(!membersList.containsKey(userId))
        	return result;
        User user = membersList.get(userId);
        // Add user's tweets to news feed
        newsFeed.addAll(user.getTweetList());
        // Add followers's tweets to news feed
        for(int followerId : user.getFollowersList()){
        	User follower = membersList.get(followerId);
        	newsFeed.addAll(follower.getTweetList());
        }
        Collections.sort(newsFeed, new Comparator<Tweet>(){

			@Override
			public int compare(Tweet o1, Tweet o2) {
				// TODO Auto-generated method stub
				return o2.getSerialNumber() - o1.getSerialNumber();
			}
        });
        
        int count = newsFeed.size() <= 10 ? newsFeed.size() : 10;
        
        for(int i = 0 ; i < count ; i++){
        	result.add(newsFeed.get(i).getTweetId());
        }
        return result;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId)
            return;
    	User follower;
    	User followee;
    	follower = getUser(followerId);
    	followee = getUser(followeeId);
    	if(follower.getFollowersList().contains(followeeId)){
    		return;
    	}
    	else{
    		follower.getFollowersList().add(followeeId);
    		membersList.put(followerId, follower);
    		membersList.put(followeeId, followee);
    	}
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
    	User follower;
    	User followee;
    	follower = getUser(followerId);
    	followee = getUser(followeeId);
    	if(!follower.getFollowersList().contains(followeeId)){
    		return;
    	}
    	else{
    		follower.getFollowersList().remove(followeeId);
    		membersList.put(followerId, follower);
    		membersList.put(followeeId, followee);
    	}
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */



