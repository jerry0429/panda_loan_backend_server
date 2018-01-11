package com.pinganzhiyuan.model;

import java.util.ArrayList;
import java.util.List;

public class GuaranteeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public GuaranteeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
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

		public Criteria andCreditGuaranteeIsNull() {
			addCriterion("credit_guarantee is null");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeIsNotNull() {
			addCriterion("credit_guarantee is not null");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeEqualTo(String value) {
			addCriterion("credit_guarantee =", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeNotEqualTo(String value) {
			addCriterion("credit_guarantee <>", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeGreaterThan(String value) {
			addCriterion("credit_guarantee >", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeGreaterThanOrEqualTo(String value) {
			addCriterion("credit_guarantee >=", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeLessThan(String value) {
			addCriterion("credit_guarantee <", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeLessThanOrEqualTo(String value) {
			addCriterion("credit_guarantee <=", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeLike(String value) {
			addCriterion("credit_guarantee like", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeNotLike(String value) {
			addCriterion("credit_guarantee not like", value, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeIn(List<String> values) {
			addCriterion("credit_guarantee in", values, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeNotIn(List<String> values) {
			addCriterion("credit_guarantee not in", values, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeBetween(String value1, String value2) {
			addCriterion("credit_guarantee between", value1, value2, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andCreditGuaranteeNotBetween(String value1, String value2) {
			addCriterion("credit_guarantee not between", value1, value2, "creditGuarantee");
			return (Criteria) this;
		}

		public Criteria andSquencyIsNull() {
			addCriterion("squency is null");
			return (Criteria) this;
		}

		public Criteria andSquencyIsNotNull() {
			addCriterion("squency is not null");
			return (Criteria) this;
		}

		public Criteria andSquencyEqualTo(Byte value) {
			addCriterion("squency =", value, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyNotEqualTo(Byte value) {
			addCriterion("squency <>", value, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyGreaterThan(Byte value) {
			addCriterion("squency >", value, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyGreaterThanOrEqualTo(Byte value) {
			addCriterion("squency >=", value, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyLessThan(Byte value) {
			addCriterion("squency <", value, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyLessThanOrEqualTo(Byte value) {
			addCriterion("squency <=", value, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyIn(List<Byte> values) {
			addCriterion("squency in", values, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyNotIn(List<Byte> values) {
			addCriterion("squency not in", values, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyBetween(Byte value1, Byte value2) {
			addCriterion("squency between", value1, value2, "squency");
			return (Criteria) this;
		}

		public Criteria andSquencyNotBetween(Byte value1, Byte value2) {
			addCriterion("squency not between", value1, value2, "squency");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table guarantee
	 * @mbg.generated  Thu Jan 11 10:59:20 CST 2018
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
     * This class corresponds to the database table guarantee
     *
     * @mbg.generated do_not_delete_during_merge Fri Dec 22 17:57:42 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}