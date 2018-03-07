package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.StatisticDateTransform;
import com.pinganzhiyuan.model.StatisticDateTransformExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface StatisticDateTransformMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	long countByExample(StatisticDateTransformExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int deleteByExample(StatisticDateTransformExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Delete({ "delete from statistic_date_transform", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Insert({ "insert into statistic_date_transform (device_id, user_id, ", "sid, product_id, product_name, ",
			"product_url, start_visit_time, ", "end_visit_time, stay_time, ", "is_request_code, acquire_code_time, ",
			"is_request_register, submit_register_time, ", "created_at)",
			"values (#{deviceId,jdbcType=BIGINT}, #{userId,jdbcType=BIGINT}, ",
			"#{sid,jdbcType=VARCHAR}, #{productId,jdbcType=BIGINT}, #{productName,jdbcType=VARCHAR}, ",
			"#{productUrl,jdbcType=VARCHAR}, #{startVisitTime,jdbcType=TIMESTAMP}, ",
			"#{endVisitTime,jdbcType=TIMESTAMP}, #{stayTime,jdbcType=INTEGER}, ",
			"#{isRequestCode,jdbcType=BIT}, #{acquireCodeTime,jdbcType=TIMESTAMP}, ",
			"#{isRequestRegister,jdbcType=BIT}, #{submitRegisterTime,jdbcType=TIMESTAMP}, ",
			"#{createdAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(StatisticDateTransform record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int insertSelective(StatisticDateTransform record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	List<StatisticDateTransform> selectByExample(StatisticDateTransformExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Select({ "select", "id, device_id, user_id, sid, product_id, product_name, product_url, start_visit_time, ",
			"end_visit_time, stay_time, is_request_code, acquire_code_time, is_request_register, ",
			"submit_register_time, created_at", "from statistic_date_transform", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.StatisticDateTransformMapper.BaseResultMap")
	StatisticDateTransform selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByExampleSelective(@Param("record") StatisticDateTransform record,
			@Param("example") StatisticDateTransformExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByExample(@Param("record") StatisticDateTransform record,
			@Param("example") StatisticDateTransformExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByPrimaryKeySelective(StatisticDateTransform record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_date_transform
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Update({ "update statistic_date_transform", "set device_id = #{deviceId,jdbcType=BIGINT},",
			"user_id = #{userId,jdbcType=BIGINT},", "sid = #{sid,jdbcType=VARCHAR},",
			"product_id = #{productId,jdbcType=BIGINT},", "product_name = #{productName,jdbcType=VARCHAR},",
			"product_url = #{productUrl,jdbcType=VARCHAR},", "start_visit_time = #{startVisitTime,jdbcType=TIMESTAMP},",
			"end_visit_time = #{endVisitTime,jdbcType=TIMESTAMP},", "stay_time = #{stayTime,jdbcType=INTEGER},",
			"is_request_code = #{isRequestCode,jdbcType=BIT},",
			"acquire_code_time = #{acquireCodeTime,jdbcType=TIMESTAMP},",
			"is_request_register = #{isRequestRegister,jdbcType=BIT},",
			"submit_register_time = #{submitRegisterTime,jdbcType=TIMESTAMP},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(StatisticDateTransform record);
}