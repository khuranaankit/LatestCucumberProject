package automation.library.engine.core.objectmatcher;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ObjectFinder {
	
	
public static String getObject(String objectName, String pageObj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, InstantiationException, NoSuchMethodException, SecurityException{
	Class<?> pageObject = Class.forName("pageobjects."+pageObj);
	CommonPageObject obj= (CommonPageObject) pageObject.newInstance();
	Method method = pageObject.getMethod(objectName);
	String xPath = (String) method.invoke(obj);
	
	return xPath;
}


}
