package edu.ynu.docmanagesystem.po;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public SectionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
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
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
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

        public Criteria andSectionidIsNull() {
            addCriterion("sectionId is null");
            return (Criteria) this;
        }

        public Criteria andSectionidIsNotNull() {
            addCriterion("sectionId is not null");
            return (Criteria) this;
        }

        public Criteria andSectionidEqualTo(Integer value) {
            addCriterion("sectionId =", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotEqualTo(Integer value) {
            addCriterion("sectionId <>", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThan(Integer value) {
            addCriterion("sectionId >", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sectionId >=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThan(Integer value) {
            addCriterion("sectionId <", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidLessThanOrEqualTo(Integer value) {
            addCriterion("sectionId <=", value, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidIn(List<Integer> values) {
            addCriterion("sectionId in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotIn(List<Integer> values) {
            addCriterion("sectionId not in", values, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidBetween(Integer value1, Integer value2) {
            addCriterion("sectionId between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectionidNotBetween(Integer value1, Integer value2) {
            addCriterion("sectionId not between", value1, value2, "sectionid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidIsNull() {
            addCriterion("sectionCascadeId is null");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidIsNotNull() {
            addCriterion("sectionCascadeId is not null");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidEqualTo(String value) {
            addCriterion("sectionCascadeId =", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidNotEqualTo(String value) {
            addCriterion("sectionCascadeId <>", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidGreaterThan(String value) {
            addCriterion("sectionCascadeId >", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidGreaterThanOrEqualTo(String value) {
            addCriterion("sectionCascadeId >=", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidLessThan(String value) {
            addCriterion("sectionCascadeId <", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidLessThanOrEqualTo(String value) {
            addCriterion("sectionCascadeId <=", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidLike(String value) {
            addCriterion("sectionCascadeId like", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidNotLike(String value) {
            addCriterion("sectionCascadeId not like", value, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidIn(List<String> values) {
            addCriterion("sectionCascadeId in", values, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidNotIn(List<String> values) {
            addCriterion("sectionCascadeId not in", values, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidBetween(String value1, String value2) {
            addCriterion("sectionCascadeId between", value1, value2, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectioncascadeidNotBetween(String value1, String value2) {
            addCriterion("sectionCascadeId not between", value1, value2, "sectioncascadeid");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeIsNull() {
            addCriterion("sectionDescribe is null");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeIsNotNull() {
            addCriterion("sectionDescribe is not null");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeEqualTo(String value) {
            addCriterion("sectionDescribe =", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeNotEqualTo(String value) {
            addCriterion("sectionDescribe <>", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeGreaterThan(String value) {
            addCriterion("sectionDescribe >", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeGreaterThanOrEqualTo(String value) {
            addCriterion("sectionDescribe >=", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeLessThan(String value) {
            addCriterion("sectionDescribe <", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeLessThanOrEqualTo(String value) {
            addCriterion("sectionDescribe <=", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeLike(String value) {
            addCriterion("sectionDescribe like", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeNotLike(String value) {
            addCriterion("sectionDescribe not like", value, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeIn(List<String> values) {
            addCriterion("sectionDescribe in", values, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeNotIn(List<String> values) {
            addCriterion("sectionDescribe not in", values, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeBetween(String value1, String value2) {
            addCriterion("sectionDescribe between", value1, value2, "sectiondescribe");
            return (Criteria) this;
        }

        public Criteria andSectiondescribeNotBetween(String value1, String value2) {
            addCriterion("sectionDescribe not between", value1, value2, "sectiondescribe");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table section
     *
     * @mbggenerated do_not_delete_during_merge Sat Jun 11 16:05:23 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table section
     *
     * @mbggenerated Sat Jun 11 16:05:23 CST 2016
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