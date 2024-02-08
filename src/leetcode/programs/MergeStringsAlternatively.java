package leetcode.programs;

public class MergeStringsAlternatively {

	public static void main(String[] args) {
		
		String res = mergeAlternately("abc", "pqrst");
		System.out.println(res);
	}

    public static String mergeAlternately(String word1, String word2) {
        int n=0;
        int w1 = word1.length();
        int w2 = word2.length();
        char[] res = new char[w1+w2];
        if(w1 < w2){
            n = w1;
        } else if(w1 > w2){
            n = w2;
        } else {
            n = w1;
        }
        int j=0;
        for(int i=0; i<n; i++){
            res[j] = word1.charAt(i);
            j++;
            res[j] = word2.charAt(i);
            j++;
        }

        if(w1 < w2){
            for(int i=n; i<w2; i++){
                res[j] = word2.charAt(i);
                j++;
            }
        } else if(w1 > w2){
            for(int i=n; i<w1; i++){
                res[j] = word1.charAt(i);
                j++;
            }
        }
        return new String(res);
    }
    
}
