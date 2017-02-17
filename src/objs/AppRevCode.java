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

package objs;

public class AppRevCode 
{
	private String appid;
	private String revid;
	private String classcode;
	private String refcode;
	
	public AppRevCode()
	{
		appid = new String();
		revid = new String();
		classcode = new String();
		refcode = new String();
	}
	
/*Construct the RevCode 
*
* @param appid  Application Id
* @param revid  Reverse Id
* @param classcode Code for the class
* @param refcode   Reference code
*/

	public AppRevCode(String appid, String revid, String classcode,
			String refcode) {
		super();
		this.appid = appid;
		this.revid = revid;
		this.classcode = classcode;
		this.refcode = refcode;
	}
/*Get method 
*
* @return appid ApplicationID
*/

	public String getAppid() {
		return appid;
	}
	
/*Set method 
*
* @param appid The application id thats going to be set
*/
	public void setAppid(String appid) {
		this.appid = appid;
	}
	
/*Get method 
*
* @return revid
*/

	public String getRevid() {
		return revid;
	}
	
/*Set method 
*
* @param revid The revid thats going to be set
*/

	public void setRevid(String revid) {
		this.revid = revid;
	}
	
/*Get method 
*
* @return classcode
*/

	public String getClasscode() {
		return classcode;
	}
	
/*Set method 
*
* @param classcode The classcode thats going to be set
*/
	public void setClasscode(String classcode) {
		this.classcode = classcode;
	}

/*Get method 
*
* @return refcode
*/
	public String getRefcode() {
		return refcode;
	}

/*Set method 
*
* @param refcode The refcode thats going to be set
*/
	public void setRefcode(String refcode) {
		this.refcode = refcode;
	}
	
	

}
