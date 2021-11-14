package com.example.mysqldemo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * @Author: luoxianming
  * @Date: 2021/4/30 15:22
 */
public class TBsCollegeAreasRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBsCollegeAreasRelationExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidIsNull() {
            addCriterion("identity_guid is null");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidIsNotNull() {
            addCriterion("identity_guid is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidEqualTo(String value) {
            addCriterion("identity_guid =", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidNotEqualTo(String value) {
            addCriterion("identity_guid <>", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidGreaterThan(String value) {
            addCriterion("identity_guid >", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidGreaterThanOrEqualTo(String value) {
            addCriterion("identity_guid >=", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidLessThan(String value) {
            addCriterion("identity_guid <", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidLessThanOrEqualTo(String value) {
            addCriterion("identity_guid <=", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidLike(String value) {
            addCriterion("identity_guid like", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidNotLike(String value) {
            addCriterion("identity_guid not like", value, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidIn(List<String> values) {
            addCriterion("identity_guid in", values, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidNotIn(List<String> values) {
            addCriterion("identity_guid not in", values, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidBetween(String value1, String value2) {
            addCriterion("identity_guid between", value1, value2, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andIdentityGuidNotBetween(String value1, String value2) {
            addCriterion("identity_guid not between", value1, value2, "identityGuid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdIsNull() {
            addCriterion("bs_college_areas_id is null");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdIsNotNull() {
            addCriterion("bs_college_areas_id is not null");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdEqualTo(Integer value) {
            addCriterion("bs_college_areas_id =", value, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdNotEqualTo(Integer value) {
            addCriterion("bs_college_areas_id <>", value, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdGreaterThan(Integer value) {
            addCriterion("bs_college_areas_id >", value, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bs_college_areas_id >=", value, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdLessThan(Integer value) {
            addCriterion("bs_college_areas_id <", value, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdLessThanOrEqualTo(Integer value) {
            addCriterion("bs_college_areas_id <=", value, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdIn(List<Integer> values) {
            addCriterion("bs_college_areas_id in", values, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdNotIn(List<Integer> values) {
            addCriterion("bs_college_areas_id not in", values, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdBetween(Integer value1, Integer value2) {
            addCriterion("bs_college_areas_id between", value1, value2, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bs_college_areas_id not between", value1, value2, "bsCollegeAreasId");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameIsNull() {
            addCriterion("bs_college_areas_name is null");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameIsNotNull() {
            addCriterion("bs_college_areas_name is not null");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameEqualTo(String value) {
            addCriterion("bs_college_areas_name =", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameNotEqualTo(String value) {
            addCriterion("bs_college_areas_name <>", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameGreaterThan(String value) {
            addCriterion("bs_college_areas_name >", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameGreaterThanOrEqualTo(String value) {
            addCriterion("bs_college_areas_name >=", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameLessThan(String value) {
            addCriterion("bs_college_areas_name <", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameLessThanOrEqualTo(String value) {
            addCriterion("bs_college_areas_name <=", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameLike(String value) {
            addCriterion("bs_college_areas_name like", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameNotLike(String value) {
            addCriterion("bs_college_areas_name not like", value, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameIn(List<String> values) {
            addCriterion("bs_college_areas_name in", values, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameNotIn(List<String> values) {
            addCriterion("bs_college_areas_name not in", values, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameBetween(String value1, String value2) {
            addCriterion("bs_college_areas_name between", value1, value2, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andBsCollegeAreasNameNotBetween(String value1, String value2) {
            addCriterion("bs_college_areas_name not between", value1, value2, "bsCollegeAreasName");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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