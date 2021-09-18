package automation.library.api.core;

public class Constants {
	
	private static final String USER_DIR = System.getProperty("user.dir");
	public static final String BASEPATH = USER_DIR + "/src/test/resources/";
	public static final String ENVIRONMENTPATH = BASEPATH + "/config/environments";
	public static final String CONFIGPATH = BASEPATH + "/config";
	public static final String SELENIUMSTACKPATH = CONFIGPATH + "/selenium/stacks/";
	public static final String FEATUREFILEPATH = BASEPATH + "features/";
	private Constants() {
		
	}

}
