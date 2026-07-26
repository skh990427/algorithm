class Solution {
    public String[] solution(String[] picture, int k) {
        String[] result = new String[picture.length * k];
        
        for(int i = 0 ; i < picture.length ; i++) {
            String[] splits = picture[i].split("");
            String line = "";
            
            for(String data : splits)
                line += data.repeat(k);
            for(int j = i * k ; j < i * k + k ; j++) {
                result[j] = line;
            }
        }
        return result;
    }
}