package org.hcl.exceptions;

public class Event {
         private String name;
         private String detail;
         private  String ownerName;
         private long typeId;
          public Event()
          {
        	  
          }
          public Event(String name,String detail,String ownerName,long typeId)
          {
        	  this.name=name;
        	  this.detail=detail;
        	  this.ownerName=ownerName;
        	  this.typeId=typeId;
          }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDetail() {
			return detail;
		}
		public void setDetail(String detail) {
			this.detail = detail;
		}
		public String getOwnerName() {
			return ownerName;
		}
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
		public long getTypeId() {
			return typeId;
		}
		public void setTypeId(long typeId) {
			this.typeId = typeId;
		}
          
          
}
