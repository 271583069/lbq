package edu.tinzel.mybatis.entity;

import java.io.Serializable;

public class Users implements Serializable {
		private int id;
		private String username;
		private String userpwd;
		private String age;
		private String minage;
		private String maxage;
		
		public String getMinage() {
			return minage;
		}
		public void setMinage(String minage) {
			this.minage = minage;
		}
		public String getMaxage() {
			return maxage;
		}
		public void setMaxage(String maxage) {
			this.maxage = maxage;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
	
		public String getUserpwd() {
			return userpwd;
		}
		public void setUserpwd(String userpwd) {
			this.userpwd = userpwd;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		public Users(int id, String username, String userpwd, String age) {
			super();
			this.id = id;
			this.username = username;
			this.userpwd = userpwd;
			this.age = age;
		}
		public Users(String username, String userpwd, String age) {
			super();
			this.username = username;
			this.userpwd = userpwd;
			this.age = age;
		}
		
		
		
		
		public Users(String username, String userpwd) {
			super();
			this.username = username;
			this.userpwd = userpwd;
		}
		@Override
		public String toString() {
			return "Users [id=" + id + ", username=" + username + ", userpwd="
					+ userpwd + ", age=" + age + "]";
		}
		public Users() {
			super();
		}
	
		
}
