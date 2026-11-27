class Solution {

    public String encode(List<String> strs) {
        if(strs.size() == 0){
            return null;
        }
        String encoded = new String();
        for(int i = 0; i < strs.size(); i++){
            if(i < strs.size()-1){
                encoded = encoded + strs.get(i) + "\n";
            }
            else{
                encoded = encoded + strs.get(i);
            }
        }
        return encoded;
    }

    public List<String> decode(String str) {
        if(str == null){
            return new ArrayList<>();
        }
        List<String> decoded = Arrays.asList(str.split("\n",-1));
        return decoded;
    }
}
