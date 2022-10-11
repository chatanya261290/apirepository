package org.testing.runner;

import java.io.IOException;

import org.testing.Testcases.Tc1_postrequest;
import org.testing.Testcases.Tc3_Getrequest;
import org.testing.Testcases.Tc_2getallrcord;
import org.testing.Testcases.tc1_postwithvariable;

public class triggerwithvariable
{
public static void main(String[] args) throws IOException 

{
tc1_postwithvariable tc11=new tc1_postwithvariable();	
tc11.testcase1();

Tc_2getallrcord tc2=new Tc_2getallrcord();
tc2.testcase2();

Tc3_Getrequest tc3=new Tc3_Getrequest();
tc3.testcase3();

}
}
