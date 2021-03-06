package ifactory.module.secretary;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import ifactory.module.secretary.Secretary;
import ifactory.module.secretary.SecretaryExample;

public interface SecretaryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	long countByExample(SecretaryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	int deleteByExample(SecretaryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	int insert(Secretary record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	int insertSelective(Secretary record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */List<Secretary> selectByExample(SecretaryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	Secretary selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */int updateByExampleSelective(@Param("record") Secretary record,@Param("example") SecretaryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */int updateByExample(@Param("record") Secretary record,@Param("example") SecretaryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	int updateByPrimaryKeySelective(Secretary record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secretary
	 * @mbg.generated  Thu Dec 28 14:36:51 CST 2017
	 */
	int updateByPrimaryKey(Secretary record);

	List<Secretary> selectByCondition(SecretaryExample example);
}