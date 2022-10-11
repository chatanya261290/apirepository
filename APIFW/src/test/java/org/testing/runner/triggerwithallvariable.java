package org.testing.runner;

import java.io.IOException;

import org.testing.Testcases.Tc1_postrequest;
import org.testing.Testcases.Tc3_Getrequest;
import org.testing.Testcases.Tc_2getallrcord;
import org.testing.Testcases.tc1_postwithallvariable;
import org.testing.Testcases.tc1_postwithvariable;
import org.testing.Testcases.tc3_getallvariable;

public class triggerwithallvariable
{
public static void main(String[] args) throws IOException 
{
tc1_postwithallvariable tc11=new tc1_postwithallvariable();	
tc11.testcase1();

Tc_2getallrcord tc2=new Tc_2getallrcord();
tc2.testcase2();

tc3_getallvariable tc3=new tc3_getallvariable();
tc3.testcase3();

}
}
