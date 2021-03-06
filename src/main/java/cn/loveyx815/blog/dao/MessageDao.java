package cn.loveyx815.blog.dao;

import cn.loveyx815.blog.entity.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MessageDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    Message selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_message
     *
     * @mbg.generated Mon Apr 22 16:15:48 GMT+08:00 2019
     */
    int updateByPrimaryKey(Message record);

     List<Map<String ,Object>> getAllMessageByPage(@Param("cursize") int cursize,@Param("pagesize") Integer pagesize);

    Integer getMessageCount();
}