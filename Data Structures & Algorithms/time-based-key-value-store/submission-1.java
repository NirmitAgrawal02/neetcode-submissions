class TimeMap {
    HashMap<String, ArrayList<String>> keyValue;
    HashMap<String, ArrayList<Integer>> keyStamp;

    public TimeMap() {
        keyValue = new HashMap<>();
        keyStamp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!keyValue.containsKey(key))
        {
            keyValue.put(key, new ArrayList<>());
            keyStamp.put(key, new ArrayList<>());
        }
        keyValue.get(key).add(value);
        keyStamp.get(key).add(timestamp);
    }
    
    public String get(String key, int timestamp) {
        if(!(keyValue.containsKey(key) && keyValue.get(key).size() > 0))
        {
            return "";
        }
        ArrayList<Integer> values = keyStamp.get(key);
        ArrayList<String> vals = keyValue.get(key);
        int i = -1;
        String v  = "";
        while(++i < values.size() && values.get(i) <= timestamp)
        {
            v = vals.get(i);
        }
        return v;
    }
}
