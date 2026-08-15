class Twitter {
    HashMap<Integer, HashSet<Integer>> usersFollower;
    Stack<int[]> Tweets = new Stack<>();
    public Twitter() {
        usersFollower = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        if(!usersFollower.containsKey(userId))
        {
            usersFollower.put(userId, new HashSet<>());
            usersFollower.get(userId).add(userId);
        }
        int[] values = {tweetId, userId};
        Tweets.push(values);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        Stack<int[]> tempStack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        int count = 10;
        HashSet<Integer> followers = usersFollower.get(userId);
        while(!Tweets.isEmpty() && count > 0)
        {
            int[] values = Tweets.pop();
            if(followers.contains(values[1]))
            {
                result.add(values[0]);
                count--;
            }
            tempStack.push(values);
        }        
        while(!tempStack.isEmpty())
        {
            Tweets.push(tempStack.pop());
        }
        return result;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!usersFollower.containsKey(followerId))
        {
            usersFollower.put(followerId, new HashSet<>());
            usersFollower.get(followerId).add(followerId);
        }
        if(!usersFollower.containsKey(followeeId))
        {
            usersFollower.put(followeeId, new HashSet<>());
            usersFollower.get(followeeId).add(followeeId);
        }
        if(followerId != followeeId)
        {
            usersFollower.get(followerId).add(followeeId);
        }
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(followerId != followeeId)
        {
            usersFollower.get(followerId).remove(followeeId);

        }
    }
}
