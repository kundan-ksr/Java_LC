class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> x:paths){
            map.put(x.get(0),x.get(1));
        }
    String x=paths.get(0).get(0);
    while(map.get(x)!=null){
        x=map.get(x);
    }
    return x;
    }
}