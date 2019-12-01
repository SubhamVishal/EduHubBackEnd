package com.edu.hub.model;

import java.io.File;

public class User {
	private String userName;
	private String passWord;
	private String firstName;
	private String middleName;
	private String lastName;
	private File profilePic;
	private School school;
	private Account account;
	private String className;

	public User() {
	}

	public User(String userName, String passWord, String firstName, String middleName, String lastName, File profilePic,
			School school, Account account, String className) {
		this.userName = userName;
		this.passWord = passWord;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.profilePic = profilePic;
		this.school = school;
		this.account = account;
		this.className = className;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public File getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(File profilePic) {
		this.profilePic = profilePic;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", profilePic=" + profilePic + ", school=" + school
				+ ", account=" + account + ", className=" + className + "]";
	}

}
