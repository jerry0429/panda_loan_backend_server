package com.pinganzhiyuan.model;

import java.util.ArrayList;
import java.util.List;

public class IdVerificationExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public IdVerificationExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andIdentityIsNull() {
			addCriterion("identity is null");
			return (Criteria) this;
		}

		public Criteria andIdentityIsNotNull() {
			addCriterion("identity is not null");
			return (Criteria) this;
		}

		public Criteria andIdentityEqualTo(String value) {
			addCriterion("identity =", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityNotEqualTo(String value) {
			addCriterion("identity <>", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityGreaterThan(String value) {
			addCriterion("identity >", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityGreaterThanOrEqualTo(String value) {
			addCriterion("identity >=", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityLessThan(String value) {
			addCriterion("identity <", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityLessThanOrEqualTo(String value) {
			addCriterion("identity <=", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityLike(String value) {
			addCriterion("identity like", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityNotLike(String value) {
			addCriterion("identity not like", value, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityIn(List<String> values) {
			addCriterion("identity in", values, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityNotIn(List<String> values) {
			addCriterion("identity not in", values, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityBetween(String value1, String value2) {
			addCriterion("identity between", value1, value2, "identity");
			return (Criteria) this;
		}

		public Criteria andIdentityNotBetween(String value1, String value2) {
			addCriterion("identity not between", value1, value2, "identity");
			return (Criteria) this;
		}

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(String value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(String value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(String value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(String value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(String value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(String value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLike(String value) {
			addCriterion("code like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotLike(String value) {
			addCriterion("code not like", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<String> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<String> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(String value1, String value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(String value1, String value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNull() {
			addCriterion("description is null");
			return (Criteria) this;
		}

		public Criteria andDescriptionIsNotNull() {
			addCriterion("description is not null");
			return (Criteria) this;
		}

		public Criteria andDescriptionEqualTo(String value) {
			addCriterion("description =", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotEqualTo(String value) {
			addCriterion("description <>", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThan(String value) {
			addCriterion("description >", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
			addCriterion("description >=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThan(String value) {
			addCriterion("description <", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLessThanOrEqualTo(String value) {
			addCriterion("description <=", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionLike(String value) {
			addCriterion("description like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotLike(String value) {
			addCriterion("description not like", value, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionIn(List<String> values) {
			addCriterion("description in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotIn(List<String> values) {
			addCriterion("description not in", values, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionBetween(String value1, String value2) {
			addCriterion("description between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andDescriptionNotBetween(String value1, String value2) {
			addCriterion("description not between", value1, value2, "description");
			return (Criteria) this;
		}

		public Criteria andPhotoIsNull() {
			addCriterion("photo is null");
			return (Criteria) this;
		}

		public Criteria andPhotoIsNotNull() {
			addCriterion("photo is not null");
			return (Criteria) this;
		}

		public Criteria andPhotoEqualTo(String value) {
			addCriterion("photo =", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotEqualTo(String value) {
			addCriterion("photo <>", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoGreaterThan(String value) {
			addCriterion("photo >", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoGreaterThanOrEqualTo(String value) {
			addCriterion("photo >=", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLessThan(String value) {
			addCriterion("photo <", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLessThanOrEqualTo(String value) {
			addCriterion("photo <=", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoLike(String value) {
			addCriterion("photo like", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotLike(String value) {
			addCriterion("photo not like", value, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoIn(List<String> values) {
			addCriterion("photo in", values, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotIn(List<String> values) {
			addCriterion("photo not in", values, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoBetween(String value1, String value2) {
			addCriterion("photo between", value1, value2, "photo");
			return (Criteria) this;
		}

		public Criteria andPhotoNotBetween(String value1, String value2) {
			addCriterion("photo not between", value1, value2, "photo");
			return (Criteria) this;
		}

		public Criteria andTransIdIsNull() {
			addCriterion("trans_id is null");
			return (Criteria) this;
		}

		public Criteria andTransIdIsNotNull() {
			addCriterion("trans_id is not null");
			return (Criteria) this;
		}

		public Criteria andTransIdEqualTo(String value) {
			addCriterion("trans_id =", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdNotEqualTo(String value) {
			addCriterion("trans_id <>", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdGreaterThan(String value) {
			addCriterion("trans_id >", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdGreaterThanOrEqualTo(String value) {
			addCriterion("trans_id >=", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdLessThan(String value) {
			addCriterion("trans_id <", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdLessThanOrEqualTo(String value) {
			addCriterion("trans_id <=", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdLike(String value) {
			addCriterion("trans_id like", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdNotLike(String value) {
			addCriterion("trans_id not like", value, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdIn(List<String> values) {
			addCriterion("trans_id in", values, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdNotIn(List<String> values) {
			addCriterion("trans_id not in", values, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdBetween(String value1, String value2) {
			addCriterion("trans_id between", value1, value2, "transId");
			return (Criteria) this;
		}

		public Criteria andTransIdNotBetween(String value1, String value2) {
			addCriterion("trans_id not between", value1, value2, "transId");
			return (Criteria) this;
		}

		public Criteria andTradeNoIsNull() {
			addCriterion("trade_no is null");
			return (Criteria) this;
		}

		public Criteria andTradeNoIsNotNull() {
			addCriterion("trade_no is not null");
			return (Criteria) this;
		}

		public Criteria andTradeNoEqualTo(String value) {
			addCriterion("trade_no =", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoNotEqualTo(String value) {
			addCriterion("trade_no <>", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoGreaterThan(String value) {
			addCriterion("trade_no >", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
			addCriterion("trade_no >=", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoLessThan(String value) {
			addCriterion("trade_no <", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoLessThanOrEqualTo(String value) {
			addCriterion("trade_no <=", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoLike(String value) {
			addCriterion("trade_no like", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoNotLike(String value) {
			addCriterion("trade_no not like", value, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoIn(List<String> values) {
			addCriterion("trade_no in", values, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoNotIn(List<String> values) {
			addCriterion("trade_no not in", values, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoBetween(String value1, String value2) {
			addCriterion("trade_no between", value1, value2, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andTradeNoNotBetween(String value1, String value2) {
			addCriterion("trade_no not between", value1, value2, "tradeNo");
			return (Criteria) this;
		}

		public Criteria andFeeIsNull() {
			addCriterion("fee is null");
			return (Criteria) this;
		}

		public Criteria andFeeIsNotNull() {
			addCriterion("fee is not null");
			return (Criteria) this;
		}

		public Criteria andFeeEqualTo(String value) {
			addCriterion("fee =", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotEqualTo(String value) {
			addCriterion("fee <>", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeGreaterThan(String value) {
			addCriterion("fee >", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeGreaterThanOrEqualTo(String value) {
			addCriterion("fee >=", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeLessThan(String value) {
			addCriterion("fee <", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeLessThanOrEqualTo(String value) {
			addCriterion("fee <=", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeLike(String value) {
			addCriterion("fee like", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotLike(String value) {
			addCriterion("fee not like", value, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeIn(List<String> values) {
			addCriterion("fee in", values, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotIn(List<String> values) {
			addCriterion("fee not in", values, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeBetween(String value1, String value2) {
			addCriterion("fee between", value1, value2, "fee");
			return (Criteria) this;
		}

		public Criteria andFeeNotBetween(String value1, String value2) {
			addCriterion("fee not between", value1, value2, "fee");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table identity_verification
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table identity_verification
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 22 17:57:42 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}