package edu.ynu.docmanagesystem.po;

import java.util.ArrayList;
import java.util.List;

public class ResourcetypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public ResourcetypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andResourcetypeidIsNull() {
            addCriterion("resourceTypeId is null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidIsNotNull() {
            addCriterion("resourceTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidEqualTo(Integer value) {
            addCriterion("resourceTypeId =", value, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidNotEqualTo(Integer value) {
            addCriterion("resourceTypeId <>", value, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidGreaterThan(Integer value) {
            addCriterion("resourceTypeId >", value, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resourceTypeId >=", value, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidLessThan(Integer value) {
            addCriterion("resourceTypeId <", value, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidLessThanOrEqualTo(Integer value) {
            addCriterion("resourceTypeId <=", value, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidIn(List<Integer> values) {
            addCriterion("resourceTypeId in", values, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidNotIn(List<Integer> values) {
            addCriterion("resourceTypeId not in", values, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidBetween(Integer value1, Integer value2) {
            addCriterion("resourceTypeId between", value1, value2, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resourceTypeId not between", value1, value2, "resourcetypeid");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeIsNull() {
            addCriterion("resourceTypeDescribe is null");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeIsNotNull() {
            addCriterion("resourceTypeDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeEqualTo(String value) {
            addCriterion("resourceTypeDescribe =", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeNotEqualTo(String value) {
            addCriterion("resourceTypeDescribe <>", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeGreaterThan(String value) {
            addCriterion("resourceTypeDescribe >", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeGreaterThanOrEqualTo(String value) {
            addCriterion("resourceTypeDescribe >=", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeLessThan(String value) {
            addCriterion("resourceTypeDescribe <", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeLessThanOrEqualTo(String value) {
            addCriterion("resourceTypeDescribe <=", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeLike(String value) {
            addCriterion("resourceTypeDescribe like", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeNotLike(String value) {
            addCriterion("resourceTypeDescribe not like", value, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeIn(List<String> values) {
            addCriterion("resourceTypeDescribe in", values, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeNotIn(List<String> values) {
            addCriterion("resourceTypeDescribe not in", values, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeBetween(String value1, String value2) {
            addCriterion("resourceTypeDescribe between", value1, value2, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcetypedescribeNotBetween(String value1, String value2) {
            addCriterion("resourceTypeDescribe not between", value1, value2, "resourcetypedescribe");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridIsNull() {
            addCriterion("resourceManagerId is null");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridIsNotNull() {
            addCriterion("resourceManagerId is not null");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridEqualTo(String value) {
            addCriterion("resourceManagerId =", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridNotEqualTo(String value) {
            addCriterion("resourceManagerId <>", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridGreaterThan(String value) {
            addCriterion("resourceManagerId >", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridGreaterThanOrEqualTo(String value) {
            addCriterion("resourceManagerId >=", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridLessThan(String value) {
            addCriterion("resourceManagerId <", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridLessThanOrEqualTo(String value) {
            addCriterion("resourceManagerId <=", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridLike(String value) {
            addCriterion("resourceManagerId like", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridNotLike(String value) {
            addCriterion("resourceManagerId not like", value, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridIn(List<String> values) {
            addCriterion("resourceManagerId in", values, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridNotIn(List<String> values) {
            addCriterion("resourceManagerId not in", values, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridBetween(String value1, String value2) {
            addCriterion("resourceManagerId between", value1, value2, "resourcemanagerid");
            return (Criteria) this;
        }

        public Criteria andResourcemanageridNotBetween(String value1, String value2) {
            addCriterion("resourceManagerId not between", value1, value2, "resourcemanagerid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resourceType
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 02 21:43:27 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table resourceType
     *
     * @mbggenerated Thu Jun 02 21:43:27 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}