package com.pinganzhiyuan.model;

public class GuaranteeTypeMapping {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column guarantee_type_mapping.id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    private Long id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column guarantee_type_mapping.guarantee_id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    private Long guaranteeId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column guarantee_type_mapping.product_type_id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    private Long productTypeId;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column guarantee_type_mapping.id
     * @return  the value of guarantee_type_mapping.id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column guarantee_type_mapping.id
     * @param id  the value for guarantee_type_mapping.id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column guarantee_type_mapping.guarantee_id
     * @return  the value of guarantee_type_mapping.guarantee_id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    public Long getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column guarantee_type_mapping.guarantee_id
     * @param guaranteeId  the value for guarantee_type_mapping.guarantee_id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    public void setGuaranteeId(Long guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column guarantee_type_mapping.product_type_id
     * @return  the value of guarantee_type_mapping.product_type_id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    public Long getProductTypeId() {
        return productTypeId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column guarantee_type_mapping.product_type_id
     * @param productTypeId  the value for guarantee_type_mapping.product_type_id
     * @mbg.generated  Mon Jan 29 11:35:42 CST 2018
     */
    public void setProductTypeId(Long productTypeId) {
        this.productTypeId = productTypeId;
    }
}