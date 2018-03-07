package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Role;
import com.pinganzhiyuan.model.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RoleMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	long countByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int deleteByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Delete({ "delete from role", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Insert({ "insert into role (name, description, ", "resource_ids, is_enable)",
			"values (#{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
			"#{resourceIds,jdbcType=VARCHAR}, #{isEnable,jdbcType=BIT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int insertSelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	List<Role> selectByExample(RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Select({ "select", "id, name, description, resource_ids, is_enable", "from role",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.RoleMapper.BaseResultMap")
	Role selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	int updateByPrimaryKeySelective(Role record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table role
	 * @mbg.generated  Wed Mar 07 15:51:36 CST 2018
	 */
	@Update({ "update role", "set name = #{name,jdbcType=VARCHAR},", "description = #{description,jdbcType=VARCHAR},",
			"resource_ids = #{resourceIds,jdbcType=VARCHAR},", "is_enable = #{isEnable,jdbcType=BIT}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Role record);
}