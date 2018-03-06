package com.pinganzhiyuan.mapper;

import com.pinganzhiyuan.model.Device;
import com.pinganzhiyuan.model.DeviceExample;
import com.pinganzhiyuan.model.DeviceLog;
import com.pinganzhiyuan.model.DeviceStatisticalData;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface DeviceMapper {

    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	long countByExample(DeviceExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	int deleteByExample(DeviceExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	@Delete({ "delete from statistic_device", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	@Insert({ "insert into statistic_device (device_id, device_brand, ", "device_system_version, maiden_start_time, ",
			"maiden_start_ip, maiden_start_longitude, ", "maiden_start_latitude, channel_id, ",
			"channel_name, app_product_id, ", "app_product_name, app_product_version, ", "is_root, created_at)",
			"values (#{deviceId,jdbcType=VARCHAR}, #{deviceBrand,jdbcType=VARCHAR}, ",
			"#{deviceSystemVersion,jdbcType=VARCHAR}, #{maidenStartTime,jdbcType=TIMESTAMP}, ",
			"#{maidenStartIp,jdbcType=VARCHAR}, #{maidenStartLongitude,jdbcType=DOUBLE}, ",
			"#{maidenStartLatitude,jdbcType=DOUBLE}, #{channelId,jdbcType=BIGINT}, ",
			"#{channelName,jdbcType=VARCHAR}, #{appProductId,jdbcType=BIGINT}, ",
			"#{appProductName,jdbcType=VARCHAR}, #{appProductVersion,jdbcType=VARCHAR}, ",
			"#{isRoot,jdbcType=BIT}, #{createdAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Device record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	int insertSelective(Device record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	List<Device> selectByExample(DeviceExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	@Select({ "select", "id, device_id, device_brand, device_system_version, maiden_start_time, maiden_start_ip, ",
			"maiden_start_longitude, maiden_start_latitude, channel_id, channel_name, app_product_id, ",
			"app_product_name, app_product_version, is_root, created_at", "from statistic_device",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.pinganzhiyuan.mapper.DeviceMapper.BaseResultMap")
	Device selectByPrimaryKey(Long id);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	int updateByPrimaryKeySelective(Device record);


	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table statistic_device
	 * @mbg.generated  Fri Mar 02 16:38:19 CST 2018
	 */
	@Update({ "update statistic_device", "set device_id = #{deviceId,jdbcType=VARCHAR},",
			"device_brand = #{deviceBrand,jdbcType=VARCHAR},",
			"device_system_version = #{deviceSystemVersion,jdbcType=VARCHAR},",
			"maiden_start_time = #{maidenStartTime,jdbcType=TIMESTAMP},",
			"maiden_start_ip = #{maidenStartIp,jdbcType=VARCHAR},",
			"maiden_start_longitude = #{maidenStartLongitude,jdbcType=DOUBLE},",
			"maiden_start_latitude = #{maidenStartLatitude,jdbcType=DOUBLE},",
			"channel_id = #{channelId,jdbcType=BIGINT},", "channel_name = #{channelName,jdbcType=VARCHAR},",
			"app_product_id = #{appProductId,jdbcType=BIGINT},",
			"app_product_name = #{appProductName,jdbcType=VARCHAR},",
			"app_product_version = #{appProductVersion,jdbcType=VARCHAR},", "is_root = #{isRoot,jdbcType=BIT},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Device record);


	@Select({ "select d.device_id, d.user_id, d.user_agent, d.version, d.channel_id, d.record_date from \n" + 
            "(select * from device_log \n" + 
            "where created_at between date(#{startDate}) and date(#{endDate}) group by device_id\n" + 
            ") as a join device as d on a.device_id = d.device_id" })
    @ResultMap("com.pinganzhiyuan.mapper.DeviceMapper.BaseResultMap")
    List<Device> getExisitDeviceDataList(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
    
	
	@Select({ "select count(*) as countNumber , channel_id , app_product_id , channel_name , app_product_name from statistic_device " + 
            "where maiden_start_time between date(#{startDate}) and date(#{endDate}) group by channel_id , app_product_id"})
    @ResultMap("com.pinganzhiyuan.mapper.DeviceMapper.DeviceStatisticalDataMap")
    List<DeviceStatisticalData> getDeviceStatisticalDataList(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

	@Select({ "select count(*) as countNumber from statistic_device " + 
    "where maiden_start_time between timestamp(#{startDate}) and timestamp(#{endDate})"})
	@ResultMap("com.pinganzhiyuan.mapper.DeviceMapper.ResultOfInteger")
	int getDeviceStatisticTimeCount(@Param("startDate") Timestamp startDate, @Param("endDate") Timestamp endDate);
  
	
}