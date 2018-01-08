package ifactory.module.call;

import ifactory.module.call.Callrecord;
import ifactory.module.call.CallrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallrecordMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	long countByExample(CallrecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	int deleteByExample(CallrecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	int insert(Callrecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	int insertSelective(Callrecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */List<Callrecord> selectByExample(CallrecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	Callrecord selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */int updateByExampleSelective(@Param("record") Callrecord record,@Param("example") CallrecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */int updateByExample(@Param("record") Callrecord record,@Param("example") CallrecordExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	int updateByPrimaryKeySelective(Callrecord record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table callRecord
	 * @mbg.generated  Fri Dec 29 11:11:58 CST 2017
	 */
	int updateByPrimaryKey(Callrecord record);
}