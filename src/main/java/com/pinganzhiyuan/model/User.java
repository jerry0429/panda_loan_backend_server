package com.pinganzhiyuan.model;

import java.util.Date;

public class User {

    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.username
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private String username;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.password
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private String password;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.regist_time
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Long registTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column user.created_at
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Date createdAt;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.id
	 * @return  the value of user.id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.id
	 * @param id  the value for user.id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.username
	 * @return  the value of user.username
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.username
	 * @param username  the value for user.username
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.password
	 * @return  the value of user.password
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.password
	 * @param password  the value for user.password
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.regist_time
	 * @return  the value of user.regist_time
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Long getRegistTime() {
		return registTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.regist_time
	 * @param registTime  the value for user.regist_time
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setRegistTime(Long registTime) {
		this.registTime = registTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column user.created_at
	 * @return  the value of user.created_at
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column user.created_at
	 * @param createdAt  the value for user.created_at
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	private String name;
    private String identityNo;
    private String residenceAddr;
    private Boolean isMan;
    private String nation;
    private Date birthday;
    private String identityAuth;
    private Date identityExpiration;
    private String education;
    private String guarantee;
    private String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    public String getResidenceAddr() {
        return residenceAddr;
    }

    public void setResidenceAddr(String residenceAddr) {
        this.residenceAddr = residenceAddr;
    }

    public Boolean getIsMan() {
        return isMan;
    }

    public void setIsMan(Boolean isMan) {
        this.isMan = isMan;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdentityAuth() {
        return identityAuth;
    }

    public void setIdentityAuth(String identityAuth) {
        this.identityAuth = identityAuth;
    }

    public Date getIdentityExpiration() {
        return identityExpiration;
    }

    public void setIdentityExpiration(Date identityExpiration) {
        this.identityExpiration = identityExpiration;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    
}