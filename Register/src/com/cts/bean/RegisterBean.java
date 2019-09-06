package com.cts.bean;

public class RegisterBean {
private String fname;
private String lname;
private String uname;
private String pwd;
private String cpwd;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getCpwd() {
	return cpwd;
}
public void setCpwd(String cpwd) {
	this.cpwd = cpwd;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cpwd == null) ? 0 : cpwd.hashCode());
	result = prime * result + ((fname == null) ? 0 : fname.hashCode());
	result = prime * result + ((lname == null) ? 0 : lname.hashCode());
	result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
	result = prime * result + ((uname == null) ? 0 : uname.hashCode());
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
	RegisterBean other = (RegisterBean) obj;
	if (cpwd == null) {
		if (other.cpwd != null)
			return false;
	} else if (!cpwd.equals(other.cpwd))
		return false;
	if (fname == null) {
		if (other.fname != null)
			return false;
	} else if (!fname.equals(other.fname))
		return false;
	if (lname == null) {
		if (other.lname != null)
			return false;
	} else if (!lname.equals(other.lname))
		return false;
	if (pwd == null) {
		if (other.pwd != null)
			return false;
	} else if (!pwd.equals(other.pwd))
		return false;
	if (uname == null) {
		if (other.uname != null)
			return false;
	} else if (!uname.equals(other.uname))
		return false;
	return true;
}
@Override
public String toString() {
	return "RegisterBean [fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", pwd=" + pwd + ", cpwd=" + cpwd
			+ "]";
}

}
