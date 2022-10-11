package org.testing.runner;

import java.io.IOException;

import org.testing.Testcases.Tc1_postrequest;
import org.testing.Testcases.Tc3_Getrequest;
import org.testing.Testcases.Tc_2getallrcord;
import org.testing.Testcases.Tc_4updaterequest;
import org.testing.Testcases.tc1_update;
import org.testing.Testcases.tc3_update;
import org.testing.Testcases.tc5_deletecase;
public class triggerupdate 
{
public static void main(String[] args) throws IOException 

{
tc1_update tc1=new tc1_update();	
tc1.testcase1();

Tc_2getallrcord tc2=new Tc_2getallrcord();
tc2.testcase2();

tc3_update tc3=new tc3_update();
tc3.testcase3();

Tc_4updaterequest tc4=new Tc_4updaterequest();
tc4.testcase4();

tc5_deletecase tc5=new tc5_deletecase();
tc5.testcase5();


}
}
