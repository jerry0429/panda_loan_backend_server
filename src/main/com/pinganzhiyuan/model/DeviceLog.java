package com.pinganzhiyuan.model;

public class DeviceLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_log.id
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_log.uri
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    private String uri;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_log.user_id
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_log.user_agent
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    private String userAgent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_log.version
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_log.id
     *
     * @return the value of device_log.id
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_log.id
     *
     * @param id the value for device_log.id
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_log.uri
     *
     * @return the value of device_log.uri
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public String getUri() {
        return uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_log.uri
     *
     * @param uri the value for device_log.uri
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_log.user_id
     *
     * @return the value of device_log.user_id
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_log.user_id
     *
     * @param userId the value for device_log.user_id
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_log.user_agent
     *
     * @return the value of device_log.user_agent
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_log.user_agent
     *
     * @param userAgent the value for device_log.user_agent
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_log.version
     *
     * @return the value of device_log.version
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_log.version
     *
     * @param version the value for device_log.version
     *
     * @mbg.generated Fri Dec 08 11:34:49 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}