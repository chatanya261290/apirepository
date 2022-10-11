package org.testing.utilities;

import java.util.regex.Pattern;

public class variablereplacement 
{
public static String assignvalue(String data,String variableName,String variableValue )
    {
	 data=data.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
	 return data;
    }
}
