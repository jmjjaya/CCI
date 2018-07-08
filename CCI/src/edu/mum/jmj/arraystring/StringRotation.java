package edu.mum.jmj.arraystring;
/**
 * 
 */

/**
 * @author jeewa
 *
 */
public class StringRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("waterbottle","erbottlewat"));

	}
	
	public static boolean isRotation(String s1, String s2) {
		StringBuilder stringBuilder = new StringBuilder();
		boolean isSubstring = false;
		if(s1.length() == s2.length()) {
			if(s1.equals(s2)) {
				return true;
			}
			for(int i=0; i< s2.length(); i++) {
				stringBuilder.append(s2.charAt(i));
				isSubstring = isSubstring(s1, stringBuilder.toString());
				if(!isSubstring) {
					String firstHalf = stringBuilder.substring(0, i);
					String secondHalf = s2.substring(i, s2.length());
					if(s1.equals(secondHalf+firstHalf)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean isSubstring(String s1, String s2){
	    if(s1.length()<s2.length()) return false;
	    if(s1.length()==s2.length()) return s1.equals(s2);
	    for(int i=0;i<=s1.length()-s2.length();i++){
	        if(s1.charAt(i)==s2.charAt(0)){
	            int matchLength=1;
	            for(int j=1;j<s2.length();j++){
	                if(s1.charAt(i+j)!=s2.charAt(j)){
	                    break;
	                }
	                matchLength++;
	            }
	            if(matchLength==s2.length()) return true;
	        }
	    }
	    return false;
	}

}
