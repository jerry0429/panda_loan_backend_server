package com.pinganzhiyuan.model;

import java.util.Date;

public class SMSLog {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.capt_id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Long captId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.phone
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.req_msg
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private String reqMsg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.resp_msg
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private String respMsg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.send_time
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Date sendTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sms_log.channel_id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	private Byte channelId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.id
	 * @return  the value of sms_log.id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.id
	 * @param id  the value for sms_log.id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.capt_id
	 * @return  the value of sms_log.capt_id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Long getCaptId() {
		return captId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.capt_id
	 * @param captId  the value for sms_log.capt_id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setCaptId(Long captId) {
		this.captId = captId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.phone
	 * @return  the value of sms_log.phone
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.phone
	 * @param phone  the value for sms_log.phone
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.req_msg
	 * @return  the value of sms_log.req_msg
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public String getReqMsg() {
		return reqMsg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.req_msg
	 * @param reqMsg  the value for sms_log.req_msg
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setReqMsg(String reqMsg) {
		this.reqMsg = reqMsg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.resp_msg
	 * @return  the value of sms_log.resp_msg
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public String getRespMsg() {
		return respMsg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.resp_msg
	 * @param respMsg  the value for sms_log.resp_msg
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.send_time
	 * @return  the value of sms_log.send_time
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Date getSendTime() {
		return sendTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.send_time
	 * @param sendTime  the value for sms_log.send_time
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sms_log.channel_id
	 * @return  the value of sms_log.channel_id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Byte getChannelId() {
		return channelId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sms_log.channel_id
	 * @param channelId  the value for sms_log.channel_id
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setChannelId(Byte channelId) {
		this.channelId = channelId;
	}
}