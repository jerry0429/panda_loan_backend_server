package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.TopRightEntry;
import com.pinganzhiyuan.model.TopRightEntryExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TopRightEntryMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    long countByExample(TopRightEntryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int deleteByExample(TopRightEntryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Delete({ "delete from top_right_entry", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Insert({ "insert into top_right_entry (title, subtitle, ", "icon_url, url)",
            "values (#{title,jdbcType=VARCHAR}, #{subtitle,jdbcType=VARCHAR}, ",
            "#{iconUrl,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(TopRightEntry record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int insertSelective(TopRightEntry record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    List<TopRightEntry> selectByExample(TopRightEntryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Select({ "select", "id, title, subtitle, icon_url, url", "from top_right_entry",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.TopRightEntryMapper.BaseResultMap")
    TopRightEntry selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") TopRightEntry record, @Param("example") TopRightEntryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int updateByExample(@Param("record") TopRightEntry record, @Param("example") TopRightEntryExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int updateByPrimaryKeySelective(TopRightEntry record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table top_right_entry
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Update({ "update top_right_entry", "set title = #{title,jdbcType=VARCHAR},",
            "subtitle = #{subtitle,jdbcType=VARCHAR},", "icon_url = #{iconUrl,jdbcType=VARCHAR},",
            "url = #{url,jdbcType=VARCHAR}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(TopRightEntry record);
}