package Week4Collections;

import java.util.HashSet;

public class niu {
	public int numUniqueEmails(String[] emails) {        
        HashSet<String> set = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        String domain = "";
        for(String email: emails){
            sb.setLength(0);
            domain = email.split("@")[1];
            email = email.split("@")[0];
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i)!='.'){
                    sb.append(email.charAt(i));
                }
                if (email.charAt(i)=='+'){
                    break;
                }
            }
            set.add(sb.append('@').append(domain).toString());
        }
        return set.size();
    }
}
