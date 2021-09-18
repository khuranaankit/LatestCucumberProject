package automation.library.common;

import java.util.HashMap;
import java.util.Map;

public class TestContext {
	
	private static ThreadLocal<TestContext> instance = ThreadLocal.withInitial(TestContext::new);
	private Map<String, Object> testData = null; 
	
	private TestContext() {
	}
	
	public static synchronized TestContext getInstance() {
		return instance.get();
	}
	
	public Map<String,Object> testData(){
		if(testData == null)
		{
			testData = new HashMap<>();
		}
		return testData;
		
	}
	
	public Object testDataGet(String key) {
		if(testData.get(key)!=null) {
			return testData.get(key);
		}
		else if(testData.get(key.toLowerCase()) != null) {
			return testData.get(key.toLowerCase());
		}
		return testData.get(key);
		
	}
	
	public void testDataPut(String key, Object data) {
		testData().put(key, data);
	}

}
