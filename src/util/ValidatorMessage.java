package util;

import java.util.ArrayList;
import java.util.List;

public class ValidatorMessage {
	
	List<String> error = new ArrayList<String>();
	
	public void setError(String ifError, String message)
	{
		error.add(ifError);
		error.add(message);
	}
	
	public List<String> getError()
	{
		return error;
	}
}
