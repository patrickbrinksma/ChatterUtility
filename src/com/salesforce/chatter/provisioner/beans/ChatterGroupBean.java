/**
 * 
 */
//Copyright (c) 2012, Felix J. Rivas, Strategice Services, Salesforce.com Inc.
//All rights reserved.
//
//Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//1.    Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. 
//2.    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the
//      documentation and/or other materials provided with the distribution.
//3.    Neither the name of the salesforce.com nor the names of its contributors may be used to endorse or promote products derived from this
//      software without specific prior written permission. 
//
//THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
//INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
//DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
//SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; 
//LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
//CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 
//EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

package com.salesforce.chatter.provisioner.beans;

/**
 * @author frivas
 *
 */
public class ChatterGroupBean {
	public String GroupId = null;
	public String GroupName = null;
	public String CollaborationType = null;
	public String OwnerEmail = null;
	public String getGroupId() {
		return GroupId;
	}
	public void setGroupId(String groupId) {
		GroupId = groupId;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public String getCollaborationType() {
		return CollaborationType;
	}
	public void setCollaborationType(String collaborationType) {
		CollaborationType = collaborationType;
	}
	public String getOwnerEmail() {
		return OwnerEmail;
	}
	public void setOwnerEmail(String ownerEmail) {
		OwnerEmail = ownerEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((GroupName == null) ? 0 : GroupName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChatterGroupBean other = (ChatterGroupBean) obj;
		if (GroupName == null) {
			if (other.GroupName != null)
				return false;
		} else if (!GroupName.equals(other.GroupName))
			return false;
		return true;
	}
}
