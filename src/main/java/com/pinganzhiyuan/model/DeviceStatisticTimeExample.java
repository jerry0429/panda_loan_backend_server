package com.pinganzhiyuan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DeviceStatisticTimeExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public DeviceStatisticTimeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device_time
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table statistic_device_time
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

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

		public Criteria andStatisticDateIsNull() {
			addCriterion("statistic_date is null");
			return (Criteria) this;
		}

		public Criteria andStatisticDateIsNotNull() {
			addCriterion("statistic_date is not null");
			return (Criteria) this;
		}

		public Criteria andStatisticDateEqualTo(Date value) {
			addCriterionForJDBCDate("statistic_date =", value, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("statistic_date <>", value, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateGreaterThan(Date value) {
			addCriterionForJDBCDate("statistic_date >", value, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("statistic_date >=", value, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateLessThan(Date value) {
			addCriterionForJDBCDate("statistic_date <", value, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("statistic_date <=", value, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateIn(List<Date> values) {
			addCriterionForJDBCDate("statistic_date in", values, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("statistic_date not in", values, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("statistic_date between", value1, value2, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("statistic_date not between", value1, value2, "statisticDate");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeIsNull() {
			addCriterion("statistic_time is null");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeIsNotNull() {
			addCriterion("statistic_time is not null");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeEqualTo(Date value) {
			addCriterion("statistic_time =", value, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeNotEqualTo(Date value) {
			addCriterion("statistic_time <>", value, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeGreaterThan(Date value) {
			addCriterion("statistic_time >", value, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("statistic_time >=", value, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeLessThan(Date value) {
			addCriterion("statistic_time <", value, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeLessThanOrEqualTo(Date value) {
			addCriterion("statistic_time <=", value, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeIn(List<Date> values) {
			addCriterion("statistic_time in", values, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeNotIn(List<Date> values) {
			addCriterion("statistic_time not in", values, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeBetween(Date value1, Date value2) {
			addCriterion("statistic_time between", value1, value2, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andStatisticTimeNotBetween(Date value1, Date value2) {
			addCriterion("statistic_time not between", value1, value2, "statisticTime");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountIsNull() {
			addCriterion("activate_device_count is null");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountIsNotNull() {
			addCriterion("activate_device_count is not null");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountEqualTo(Integer value) {
			addCriterion("activate_device_count =", value, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountNotEqualTo(Integer value) {
			addCriterion("activate_device_count <>", value, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountGreaterThan(Integer value) {
			addCriterion("activate_device_count >", value, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountGreaterThanOrEqualTo(Integer value) {
			addCriterion("activate_device_count >=", value, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountLessThan(Integer value) {
			addCriterion("activate_device_count <", value, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountLessThanOrEqualTo(Integer value) {
			addCriterion("activate_device_count <=", value, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountIn(List<Integer> values) {
			addCriterion("activate_device_count in", values, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountNotIn(List<Integer> values) {
			addCriterion("activate_device_count not in", values, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountBetween(Integer value1, Integer value2) {
			addCriterion("activate_device_count between", value1, value2, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andActivateDeviceCountNotBetween(Integer value1, Integer value2) {
			addCriterion("activate_device_count not between", value1, value2, "activateDeviceCount");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNull() {
			addCriterion("created_at is null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIsNotNull() {
			addCriterion("created_at is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedAtEqualTo(Date value) {
			addCriterion("created_at =", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotEqualTo(Date value) {
			addCriterion("created_at <>", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThan(Date value) {
			addCriterion("created_at >", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
			addCriterion("created_at >=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThan(Date value) {
			addCriterion("created_at <", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
			addCriterion("created_at <=", value, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtIn(List<Date> values) {
			addCriterion("created_at in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotIn(List<Date> values) {
			addCriterion("created_at not in", values, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtBetween(Date value1, Date value2) {
			addCriterion("created_at between", value1, value2, "createdAt");
			return (Criteria) this;
		}

		public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
			addCriterion("created_at not between", value1, value2, "createdAt");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table statistic_device_time
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
     * This class corresponds to the database table device_statistic_time
     *
     * @mbg.generated do_not_delete_during_merge Sun Dec 31 20:11:23 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}