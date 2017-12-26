package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.GuaranteeProductMapping;
import com.pinganzhiyuan.model.GuaranteeProductMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface GuaranteeProductMappingMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    long countByExample(GuaranteeProductMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int deleteByExample(GuaranteeProductMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Delete({ "delete from guarantee_product_mapping", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Insert({ "insert into guarantee_product_mapping (guarantee_id, product_id)",
            "values (#{guaranteeId,jdbcType=BIGINT}, #{productId,jdbcType=BIGINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(GuaranteeProductMapping record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int insertSelective(GuaranteeProductMapping record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    List<GuaranteeProductMapping> selectByExample(GuaranteeProductMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Select({ "select", "id, guarantee_id, product_id", "from guarantee_product_mapping",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.pinganzhiyuan.mapper.GuaranteeProductMappingMapper.BaseResultMap")
    GuaranteeProductMapping selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") GuaranteeProductMapping record,
            @Param("example") GuaranteeProductMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int updateByExample(@Param("record") GuaranteeProductMapping record,
            @Param("example") GuaranteeProductMappingExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    int updateByPrimaryKeySelective(GuaranteeProductMapping record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table guarantee_product_mapping
     * @mbg.generated  Tue Dec 26 14:11:49 CST 2017
     */
    @Update({ "update guarantee_product_mapping", "set guarantee_id = #{guaranteeId,jdbcType=BIGINT},",
            "product_id = #{productId,jdbcType=BIGINT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(GuaranteeProductMapping record);
}