package ifactory.module.push;

import java.util.ArrayList;
import java.util.List;

public class SecsubscriptionExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */public SecsubscriptionExample(){oredCriteria=new ArrayList<Criteria>();}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */public List<Criteria> getOredCriteria(){return oredCriteria;}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */protected abstract static class GeneratedCriteria {protected List<Criterion> criteria;protected GeneratedCriteria(){super();criteria=new ArrayList<Criterion>();}public boolean isValid(){return criteria.size() > 0;}public List<Criterion> getAllCriteria(){return criteria;}public List<Criterion> getCriteria(){return criteria;}protected void addCriterion(String condition){if (condition == null){throw new RuntimeException("Value for condition cannot be null");}criteria.add(new Criterion(condition));}protected void addCriterion(String condition,Object value,String property){if (value == null){throw new RuntimeException("Value for " + property + " cannot be null");}criteria.add(new Criterion(condition,value));}protected void addCriterion(String condition,Object value1,Object value2,String property){if (value1 == null || value2 == null){throw new RuntimeException("Between values for " + property + " cannot be null");}criteria.add(new Criterion(condition,value1,value2));}public Criteria andIdIsNull(){addCriterion("id is null");return (Criteria)this;}public Criteria andIdIsNotNull(){addCriterion("id is not null");return (Criteria)this;}public Criteria andIdEqualTo(Integer value){addCriterion("id =",value,"id");return (Criteria)this;}public Criteria andIdNotEqualTo(Integer value){addCriterion("id <>",value,"id");return (Criteria)this;}public Criteria andIdGreaterThan(Integer value){addCriterion("id >",value,"id");return (Criteria)this;}public Criteria andIdGreaterThanOrEqualTo(Integer value){addCriterion("id >=",value,"id");return (Criteria)this;}public Criteria andIdLessThan(Integer value){addCriterion("id <",value,"id");return (Criteria)this;}public Criteria andIdLessThanOrEqualTo(Integer value){addCriterion("id <=",value,"id");return (Criteria)this;}public Criteria andIdIn(List<Integer> values){addCriterion("id in",values,"id");return (Criteria)this;}public Criteria andIdNotIn(List<Integer> values){addCriterion("id not in",values,"id");return (Criteria)this;}public Criteria andIdBetween(Integer value1,Integer value2){addCriterion("id between",value1,value2,"id");return (Criteria)this;}public Criteria andIdNotBetween(Integer value1,Integer value2){addCriterion("id not between",value1,value2,"id");return (Criteria)this;}public Criteria andCompanyCodeIsNull(){addCriterion("companyCode is null");return (Criteria)this;}public Criteria andCompanyCodeIsNotNull(){addCriterion("companyCode is not null");return (Criteria)this;}public Criteria andCompanyCodeEqualTo(String value){addCriterion("companyCode =",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeNotEqualTo(String value){addCriterion("companyCode <>",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeGreaterThan(String value){addCriterion("companyCode >",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeGreaterThanOrEqualTo(String value){addCriterion("companyCode >=",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeLessThan(String value){addCriterion("companyCode <",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeLessThanOrEqualTo(String value){addCriterion("companyCode <=",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeLike(String value){addCriterion("companyCode like",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeNotLike(String value){addCriterion("companyCode not like",value,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeIn(List<String> values){addCriterion("companyCode in",values,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeNotIn(List<String> values){addCriterion("companyCode not in",values,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeBetween(String value1,String value2){addCriterion("companyCode between",value1,value2,"companyCode");return (Criteria)this;}public Criteria andCompanyCodeNotBetween(String value1,String value2){addCriterion("companyCode not between",value1,value2,"companyCode");return (Criteria)this;}public Criteria andUserIdIsNull(){addCriterion("userId is null");return (Criteria)this;}public Criteria andUserIdIsNotNull(){addCriterion("userId is not null");return (Criteria)this;}public Criteria andUserIdEqualTo(String value){addCriterion("userId =",value,"userId");return (Criteria)this;}public Criteria andUserIdNotEqualTo(String value){addCriterion("userId <>",value,"userId");return (Criteria)this;}public Criteria andUserIdGreaterThan(String value){addCriterion("userId >",value,"userId");return (Criteria)this;}public Criteria andUserIdGreaterThanOrEqualTo(String value){addCriterion("userId >=",value,"userId");return (Criteria)this;}public Criteria andUserIdLessThan(String value){addCriterion("userId <",value,"userId");return (Criteria)this;}public Criteria andUserIdLessThanOrEqualTo(String value){addCriterion("userId <=",value,"userId");return (Criteria)this;}public Criteria andUserIdLike(String value){addCriterion("userId like",value,"userId");return (Criteria)this;}public Criteria andUserIdNotLike(String value){addCriterion("userId not like",value,"userId");return (Criteria)this;}public Criteria andUserIdIn(List<String> values){addCriterion("userId in",values,"userId");return (Criteria)this;}public Criteria andUserIdNotIn(List<String> values){addCriterion("userId not in",values,"userId");return (Criteria)this;}public Criteria andUserIdBetween(String value1,String value2){addCriterion("userId between",value1,value2,"userId");return (Criteria)this;}public Criteria andUserIdNotBetween(String value1,String value2){addCriterion("userId not between",value1,value2,"userId");return (Criteria)this;}public Criteria andTypeIsNull(){addCriterion("type is null");return (Criteria)this;}public Criteria andTypeIsNotNull(){addCriterion("type is not null");return (Criteria)this;}public Criteria andTypeEqualTo(String value){addCriterion("type =",value,"type");return (Criteria)this;}public Criteria andTypeNotEqualTo(String value){addCriterion("type <>",value,"type");return (Criteria)this;}public Criteria andTypeGreaterThan(String value){addCriterion("type >",value,"type");return (Criteria)this;}public Criteria andTypeGreaterThanOrEqualTo(String value){addCriterion("type >=",value,"type");return (Criteria)this;}public Criteria andTypeLessThan(String value){addCriterion("type <",value,"type");return (Criteria)this;}public Criteria andTypeLessThanOrEqualTo(String value){addCriterion("type <=",value,"type");return (Criteria)this;}public Criteria andTypeLike(String value){addCriterion("type like",value,"type");return (Criteria)this;}public Criteria andTypeNotLike(String value){addCriterion("type not like",value,"type");return (Criteria)this;}public Criteria andTypeIn(List<String> values){addCriterion("type in",values,"type");return (Criteria)this;}public Criteria andTypeNotIn(List<String> values){addCriterion("type not in",values,"type");return (Criteria)this;}public Criteria andTypeBetween(String value1,String value2){addCriterion("type between",value1,value2,"type");return (Criteria)this;}public Criteria andTypeNotBetween(String value1,String value2){addCriterion("type not between",value1,value2,"type");return (Criteria)this;}public Criteria andDeviceIdIsNull(){addCriterion("deviceId is null");return (Criteria)this;}public Criteria andDeviceIdIsNotNull(){addCriterion("deviceId is not null");return (Criteria)this;}public Criteria andDeviceIdEqualTo(String value){addCriterion("deviceId =",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdNotEqualTo(String value){addCriterion("deviceId <>",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdGreaterThan(String value){addCriterion("deviceId >",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdGreaterThanOrEqualTo(String value){addCriterion("deviceId >=",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdLessThan(String value){addCriterion("deviceId <",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdLessThanOrEqualTo(String value){addCriterion("deviceId <=",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdLike(String value){addCriterion("deviceId like",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdNotLike(String value){addCriterion("deviceId not like",value,"deviceId");return (Criteria)this;}public Criteria andDeviceIdIn(List<String> values){addCriterion("deviceId in",values,"deviceId");return (Criteria)this;}public Criteria andDeviceIdNotIn(List<String> values){addCriterion("deviceId not in",values,"deviceId");return (Criteria)this;}public Criteria andDeviceIdBetween(String value1,String value2){addCriterion("deviceId between",value1,value2,"deviceId");return (Criteria)this;}public Criteria andDeviceIdNotBetween(String value1,String value2){addCriterion("deviceId not between",value1,value2,"deviceId");return (Criteria)this;}public Criteria andSecretKeyIsNull(){addCriterion("secretKey is null");return (Criteria)this;}public Criteria andSecretKeyIsNotNull(){addCriterion("secretKey is not null");return (Criteria)this;}public Criteria andSecretKeyEqualTo(String value){addCriterion("secretKey =",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyNotEqualTo(String value){addCriterion("secretKey <>",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyGreaterThan(String value){addCriterion("secretKey >",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyGreaterThanOrEqualTo(String value){addCriterion("secretKey >=",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyLessThan(String value){addCriterion("secretKey <",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyLessThanOrEqualTo(String value){addCriterion("secretKey <=",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyLike(String value){addCriterion("secretKey like",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyNotLike(String value){addCriterion("secretKey not like",value,"secretKey");return (Criteria)this;}public Criteria andSecretKeyIn(List<String> values){addCriterion("secretKey in",values,"secretKey");return (Criteria)this;}public Criteria andSecretKeyNotIn(List<String> values){addCriterion("secretKey not in",values,"secretKey");return (Criteria)this;}public Criteria andSecretKeyBetween(String value1,String value2){addCriterion("secretKey between",value1,value2,"secretKey");return (Criteria)this;}public Criteria andSecretKeyNotBetween(String value1,String value2){addCriterion("secretKey not between",value1,value2,"secretKey");return (Criteria)this;}public Criteria andDepartmentIsNull(){addCriterion("department is null");return (Criteria)this;}public Criteria andDepartmentIsNotNull(){addCriterion("department is not null");return (Criteria)this;}public Criteria andDepartmentEqualTo(String value){addCriterion("department =",value,"department");return (Criteria)this;}public Criteria andDepartmentNotEqualTo(String value){addCriterion("department <>",value,"department");return (Criteria)this;}public Criteria andDepartmentGreaterThan(String value){addCriterion("department >",value,"department");return (Criteria)this;}public Criteria andDepartmentGreaterThanOrEqualTo(String value){addCriterion("department >=",value,"department");return (Criteria)this;}public Criteria andDepartmentLessThan(String value){addCriterion("department <",value,"department");return (Criteria)this;}public Criteria andDepartmentLessThanOrEqualTo(String value){addCriterion("department <=",value,"department");return (Criteria)this;}public Criteria andDepartmentLike(String value){addCriterion("department like",value,"department");return (Criteria)this;}public Criteria andDepartmentNotLike(String value){addCriterion("department not like",value,"department");return (Criteria)this;}public Criteria andDepartmentIn(List<String> values){addCriterion("department in",values,"department");return (Criteria)this;}public Criteria andDepartmentNotIn(List<String> values){addCriterion("department not in",values,"department");return (Criteria)this;}public Criteria andDepartmentBetween(String value1,String value2){addCriterion("department between",value1,value2,"department");return (Criteria)this;}public Criteria andDepartmentNotBetween(String value1,String value2){addCriterion("department not between",value1,value2,"department");return (Criteria)this;}public Criteria andAliasIsNull(){addCriterion("alias is null");return (Criteria)this;}public Criteria andAliasIsNotNull(){addCriterion("alias is not null");return (Criteria)this;}public Criteria andAliasEqualTo(String value){addCriterion("alias =",value,"alias");return (Criteria)this;}public Criteria andAliasNotEqualTo(String value){addCriterion("alias <>",value,"alias");return (Criteria)this;}public Criteria andAliasGreaterThan(String value){addCriterion("alias >",value,"alias");return (Criteria)this;}public Criteria andAliasGreaterThanOrEqualTo(String value){addCriterion("alias >=",value,"alias");return (Criteria)this;}public Criteria andAliasLessThan(String value){addCriterion("alias <",value,"alias");return (Criteria)this;}public Criteria andAliasLessThanOrEqualTo(String value){addCriterion("alias <=",value,"alias");return (Criteria)this;}public Criteria andAliasLike(String value){addCriterion("alias like",value,"alias");return (Criteria)this;}public Criteria andAliasNotLike(String value){addCriterion("alias not like",value,"alias");return (Criteria)this;}public Criteria andAliasIn(List<String> values){addCriterion("alias in",values,"alias");return (Criteria)this;}public Criteria andAliasNotIn(List<String> values){addCriterion("alias not in",values,"alias");return (Criteria)this;}public Criteria andAliasBetween(String value1,String value2){addCriterion("alias between",value1,value2,"alias");return (Criteria)this;}public Criteria andAliasNotBetween(String value1,String value2){addCriterion("alias not between",value1,value2,"alias");return (Criteria)this;}public Criteria andStationIsNull(){addCriterion("station is null");return (Criteria)this;}public Criteria andStationIsNotNull(){addCriterion("station is not null");return (Criteria)this;}public Criteria andStationEqualTo(String value){addCriterion("station =",value,"station");return (Criteria)this;}public Criteria andStationNotEqualTo(String value){addCriterion("station <>",value,"station");return (Criteria)this;}public Criteria andStationGreaterThan(String value){addCriterion("station >",value,"station");return (Criteria)this;}public Criteria andStationGreaterThanOrEqualTo(String value){addCriterion("station >=",value,"station");return (Criteria)this;}public Criteria andStationLessThan(String value){addCriterion("station <",value,"station");return (Criteria)this;}public Criteria andStationLessThanOrEqualTo(String value){addCriterion("station <=",value,"station");return (Criteria)this;}public Criteria andStationLike(String value){addCriterion("station like",value,"station");return (Criteria)this;}public Criteria andStationNotLike(String value){addCriterion("station not like",value,"station");return (Criteria)this;}public Criteria andStationIn(List<String> values){addCriterion("station in",values,"station");return (Criteria)this;}public Criteria andStationNotIn(List<String> values){addCriterion("station not in",values,"station");return (Criteria)this;}public Criteria andStationBetween(String value1,String value2){addCriterion("station between",value1,value2,"station");return (Criteria)this;}public Criteria andStationNotBetween(String value1,String value2){addCriterion("station not between",value1,value2,"station");return (Criteria)this;}public Criteria andFactoryIsNull(){addCriterion("factory is null");return (Criteria)this;}public Criteria andFactoryIsNotNull(){addCriterion("factory is not null");return (Criteria)this;}public Criteria andFactoryEqualTo(String value){addCriterion("factory =",value,"factory");return (Criteria)this;}public Criteria andFactoryNotEqualTo(String value){addCriterion("factory <>",value,"factory");return (Criteria)this;}public Criteria andFactoryGreaterThan(String value){addCriterion("factory >",value,"factory");return (Criteria)this;}public Criteria andFactoryGreaterThanOrEqualTo(String value){addCriterion("factory >=",value,"factory");return (Criteria)this;}public Criteria andFactoryLessThan(String value){addCriterion("factory <",value,"factory");return (Criteria)this;}public Criteria andFactoryLessThanOrEqualTo(String value){addCriterion("factory <=",value,"factory");return (Criteria)this;}public Criteria andFactoryLike(String value){addCriterion("factory like",value,"factory");return (Criteria)this;}public Criteria andFactoryNotLike(String value){addCriterion("factory not like",value,"factory");return (Criteria)this;}public Criteria andFactoryIn(List<String> values){addCriterion("factory in",values,"factory");return (Criteria)this;}public Criteria andFactoryNotIn(List<String> values){addCriterion("factory not in",values,"factory");return (Criteria)this;}public Criteria andFactoryBetween(String value1,String value2){addCriterion("factory between",value1,value2,"factory");return (Criteria)this;}public Criteria andFactoryNotBetween(String value1,String value2){addCriterion("factory not between",value1,value2,"factory");return (Criteria)this;}}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table secsubscription
	 * @mbg.generated  Thu Dec 28 14:54:10 CST 2017
	 */public static class Criterion {private String condition;private Object value;private Object secondValue;private boolean noValue;private boolean singleValue;private boolean betweenValue;private boolean listValue;private String typeHandler;public String getCondition(){return condition;}public Object getValue(){return value;}public Object getSecondValue(){return secondValue;}public boolean isNoValue(){return noValue;}public boolean isSingleValue(){return singleValue;}public boolean isBetweenValue(){return betweenValue;}public boolean isListValue(){return listValue;}public String getTypeHandler(){return typeHandler;}protected Criterion(String condition){super();this.condition=condition;this.typeHandler=null;this.noValue=true;}protected Criterion(String condition,Object value,String typeHandler){super();this.condition=condition;this.value=value;this.typeHandler=typeHandler;if (value instanceof List<?>){this.listValue=true;} else {this.singleValue=true;}}protected Criterion(String condition,Object value){this(condition,value,null);}protected Criterion(String condition,Object value,Object secondValue,String typeHandler){super();this.condition=condition;this.value=value;this.secondValue=secondValue;this.typeHandler=typeHandler;this.betweenValue=true;}protected Criterion(String condition,Object value,Object secondValue){this(condition,value,secondValue,null);}}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table secsubscription
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 28 14:41:00 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}