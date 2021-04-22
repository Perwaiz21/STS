package demoPack;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class DemoClass  implements RequestHandler<Integer, String>{
	
	// Gson gson = new GsonBuilder().setPrettyPrinting().create();
	  @Override
	  public String handleRequest(Integer myCount, Context context)
	  {
	    
	    return String.valueOf(myCount);
	  }

}
