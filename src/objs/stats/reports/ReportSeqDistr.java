
/*
#  Licensed to the Apache Software Foundation (ASF) under one
#  or more contributor license agreements.  See the NOTICE file
#  distributed with this work for additional information
#  regarding copyright ownership.  The ASF licenses this file
#  to you under the Apache License, Version 2.0 (the
#  "License"); you may not use this file except in compliance
#  with the License.  You may obtain a copy of the License at
#
#  http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing,
#  software distributed under the License is distributed on an
#  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
#  KIND, either express or implied.  See the License for the
#  specific language governing permissions and limitations
#  under the License.
*/

package objs.stats.reports;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import objs.CodeDistr;
import objs.SeqDistr;

public class ReportSeqDistr 
{
	public static ArrayList<SeqDistr> distr;
	
	public ReportSeqDistr()
	{
		distr = new ArrayList<SeqDistr>();
	}

	public ArrayList<SeqDistr> getDistr() {
		return distr;
	}

	public void setDistr(ArrayList<SeqDistr> distr) {
		this.distr = distr;
	}
	
	public static void print()
	{
	
		 try
		 {
			  FileWriter fstream = new FileWriter("reports/seq_stats/reportseqdistr.txt");
	    	  BufferedWriter out = new BufferedWriter(fstream);
	    	  for (int i = 0; i < distr.size(); i++)
	    		  if (distr.get(i).getTotal() != 0)
	    		  {
	    			  out.write(distr.get(i).getCodeA1() + "	" + distr.get(i).getCodeA2() + "	" + distr.get(i).getCodeB1() + "	" + distr.get(i).getCodeB2() + "	" + distr.get(i).getTotal() + "	" + distr.get(i).getPerc());
	    			  out.newLine();
	    		  }
			  			  
			  out.close();
		  }
		 catch (Exception e)
		 {//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
   	 }
	}

}
