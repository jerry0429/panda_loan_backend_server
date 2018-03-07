package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Captcha;
import com.pinganzhiyuan.model.CaptchaExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CaptchaMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	long countByExample(CaptchaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int deleteByExample(CaptchaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Delete({ "delete from captcha", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Insert({ "insert into captcha (captcha, is_expired, ", "applied_time)",
			"values (#{captcha,jdbcType=VARCHAR}, #{isExpired,jdbcType=BIT}, ", "#{appliedTime,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Captcha record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int insertSelective(Captcha record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	List<Captcha> selectByExample(CaptchaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Select({ "select", "id, captcha, is_expired, applied_time", "from captcha", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.CaptchaMapper.BaseResultMap")
	Captcha selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Captcha record, @Param("example") CaptchaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByExample(@Param("record") Captcha record, @Param("example") CaptchaExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByPrimaryKeySelective(Captcha record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Update({ "update captcha", "set captcha = #{captcha,jdbcType=VARCHAR},", "is_expired = #{isExpired,jdbcType=BIT},",
			"applied_time = #{appliedTime,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Captcha record);
}