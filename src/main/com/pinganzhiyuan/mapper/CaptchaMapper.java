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
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    long countByExample(CaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    int deleteByExample(CaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    @Delete({ "delete from captcha", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    @Insert({ "insert into captcha (cookie, captcha, ", "expired, is_passed)",
            "values (#{cookie,jdbcType=VARCHAR}, #{captcha,jdbcType=VARCHAR}, ",
            "#{expired,jdbcType=INTEGER}, #{isPassed,jdbcType=TINYINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Captcha record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    int insertSelective(Captcha record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    List<Captcha> selectByExample(CaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    @Select({ "select", "id, cookie, captcha, expired, is_passed", "from captcha", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.CaptchaMapper.BaseResultMap")
    Captcha selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    int updateByExampleSelective(@Param("record") Captcha record, @Param("example") CaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    int updateByExample(@Param("record") Captcha record, @Param("example") CaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    int updateByPrimaryKeySelective(Captcha record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table captcha
     * @mbg.generated  Fri Dec 08 18:46:58 CST 2017
     */
    @Update({ "update captcha", "set cookie = #{cookie,jdbcType=VARCHAR},", "captcha = #{captcha,jdbcType=VARCHAR},",
            "expired = #{expired,jdbcType=INTEGER},", "is_passed = #{isPassed,jdbcType=TINYINT}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Captcha record);
}