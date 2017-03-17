package newpackage;

import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

public class AuthenticationService {
	
	public boolean authenticate(String authCredentials){
		if (null == authCredentials)
			return false;
		
		final String encodeUserPassword = authCredentials.replaceFirst("Basic"+ " ", "");
		String usernameAndPassword = null;
		try{
			byte[] decodedbytes = Base64.getDecoder().decode(encodeUserPassword);
			usernameAndPassword = new String(decodedbytes, "UTF-8");
		}catch (IOException e){
			e.getStackTrace();
		}
		
		final StringTokenizer tokenizer = new StringTokenizer(usernameAndPassword, ":");
		final String username = tokenizer.nextToken();
		final String password = tokenizer.nextToken();
		System.out.println(username);
		System.out.println(password);
		
		boolean authenticationStatus = "admin".equals(username) && "admin".equals(password);
		return authenticationStatus;
	}

}
