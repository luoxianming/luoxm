package com.example.mysqldemo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
  * @Author: luoxianming
  * @Date: 2021/5/19 13:09
 */
public class TpoBaseSchoolExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TpoBaseSchoolExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidIsNull() {
            addCriterion("IdentityGuid is null");
            return (Criteria) this;
        }

        public Criteria andIdentityguidIsNotNull() {
            addCriterion("IdentityGuid is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityguidEqualTo(String value) {
            addCriterion("IdentityGuid =", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidNotEqualTo(String value) {
            addCriterion("IdentityGuid <>", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidGreaterThan(String value) {
            addCriterion("IdentityGuid >", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidGreaterThanOrEqualTo(String value) {
            addCriterion("IdentityGuid >=", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidLessThan(String value) {
            addCriterion("IdentityGuid <", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidLessThanOrEqualTo(String value) {
            addCriterion("IdentityGuid <=", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidLike(String value) {
            addCriterion("IdentityGuid like", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidNotLike(String value) {
            addCriterion("IdentityGuid not like", value, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidIn(List<String> values) {
            addCriterion("IdentityGuid in", values, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidNotIn(List<String> values) {
            addCriterion("IdentityGuid not in", values, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidBetween(String value1, String value2) {
            addCriterion("IdentityGuid between", value1, value2, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityguidNotBetween(String value1, String value2) {
            addCriterion("IdentityGuid not between", value1, value2, "identityguid");
            return (Criteria) this;
        }

        public Criteria andIdentityidIsNull() {
            addCriterion("IdentityId is null");
            return (Criteria) this;
        }

        public Criteria andIdentityidIsNotNull() {
            addCriterion("IdentityId is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityidEqualTo(Integer value) {
            addCriterion("IdentityId =", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotEqualTo(Integer value) {
            addCriterion("IdentityId <>", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidGreaterThan(Integer value) {
            addCriterion("IdentityId >", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdentityId >=", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLessThan(Integer value) {
            addCriterion("IdentityId <", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidLessThanOrEqualTo(Integer value) {
            addCriterion("IdentityId <=", value, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidIn(List<Integer> values) {
            addCriterion("IdentityId in", values, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotIn(List<Integer> values) {
            addCriterion("IdentityId not in", values, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidBetween(Integer value1, Integer value2) {
            addCriterion("IdentityId between", value1, value2, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdentityidNotBetween(Integer value1, Integer value2) {
            addCriterion("IdentityId not between", value1, value2, "identityid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("Id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("Id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`Name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`Name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`Name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`Name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`Name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`Name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`Name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`Name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`Name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`Name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`Name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`Name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`Name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`Name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andAreaguidIsNull() {
            addCriterion("AreaGuid is null");
            return (Criteria) this;
        }

        public Criteria andAreaguidIsNotNull() {
            addCriterion("AreaGuid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaguidEqualTo(String value) {
            addCriterion("AreaGuid =", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidNotEqualTo(String value) {
            addCriterion("AreaGuid <>", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidGreaterThan(String value) {
            addCriterion("AreaGuid >", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidGreaterThanOrEqualTo(String value) {
            addCriterion("AreaGuid >=", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidLessThan(String value) {
            addCriterion("AreaGuid <", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidLessThanOrEqualTo(String value) {
            addCriterion("AreaGuid <=", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidLike(String value) {
            addCriterion("AreaGuid like", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidNotLike(String value) {
            addCriterion("AreaGuid not like", value, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidIn(List<String> values) {
            addCriterion("AreaGuid in", values, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidNotIn(List<String> values) {
            addCriterion("AreaGuid not in", values, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidBetween(String value1, String value2) {
            addCriterion("AreaGuid between", value1, value2, "areaguid");
            return (Criteria) this;
        }

        public Criteria andAreaguidNotBetween(String value1, String value2) {
            addCriterion("AreaGuid not between", value1, value2, "areaguid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CreateBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CreateBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(Integer value) {
            addCriterion("CreateBy =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(Integer value) {
            addCriterion("CreateBy <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(Integer value) {
            addCriterion("CreateBy >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreateBy >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(Integer value) {
            addCriterion("CreateBy <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(Integer value) {
            addCriterion("CreateBy <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<Integer> values) {
            addCriterion("CreateBy in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<Integer> values) {
            addCriterion("CreateBy not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(Integer value1, Integer value2) {
            addCriterion("CreateBy between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(Integer value1, Integer value2) {
            addCriterion("CreateBy not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UpdateBy is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UpdateBy is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(Integer value) {
            addCriterion("UpdateBy =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(Integer value) {
            addCriterion("UpdateBy <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(Integer value) {
            addCriterion("UpdateBy >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(Integer value) {
            addCriterion("UpdateBy >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(Integer value) {
            addCriterion("UpdateBy <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(Integer value) {
            addCriterion("UpdateBy <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<Integer> values) {
            addCriterion("UpdateBy in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<Integer> values) {
            addCriterion("UpdateBy not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(Integer value1, Integer value2) {
            addCriterion("UpdateBy between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(Integer value1, Integer value2) {
            addCriterion("UpdateBy not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andErpguidIsNull() {
            addCriterion("erpguid is null");
            return (Criteria) this;
        }

        public Criteria andErpguidIsNotNull() {
            addCriterion("erpguid is not null");
            return (Criteria) this;
        }

        public Criteria andErpguidEqualTo(String value) {
            addCriterion("erpguid =", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidNotEqualTo(String value) {
            addCriterion("erpguid <>", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidGreaterThan(String value) {
            addCriterion("erpguid >", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidGreaterThanOrEqualTo(String value) {
            addCriterion("erpguid >=", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidLessThan(String value) {
            addCriterion("erpguid <", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidLessThanOrEqualTo(String value) {
            addCriterion("erpguid <=", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidLike(String value) {
            addCriterion("erpguid like", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidNotLike(String value) {
            addCriterion("erpguid not like", value, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidIn(List<String> values) {
            addCriterion("erpguid in", values, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidNotIn(List<String> values) {
            addCriterion("erpguid not in", values, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidBetween(String value1, String value2) {
            addCriterion("erpguid between", value1, value2, "erpguid");
            return (Criteria) this;
        }

        public Criteria andErpguidNotBetween(String value1, String value2) {
            addCriterion("erpguid not between", value1, value2, "erpguid");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidIsNull() {
            addCriterion("province_guid is null");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidIsNotNull() {
            addCriterion("province_guid is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidEqualTo(String value) {
            addCriterion("province_guid =", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidNotEqualTo(String value) {
            addCriterion("province_guid <>", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidGreaterThan(String value) {
            addCriterion("province_guid >", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidGreaterThanOrEqualTo(String value) {
            addCriterion("province_guid >=", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidLessThan(String value) {
            addCriterion("province_guid <", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidLessThanOrEqualTo(String value) {
            addCriterion("province_guid <=", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidLike(String value) {
            addCriterion("province_guid like", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidNotLike(String value) {
            addCriterion("province_guid not like", value, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidIn(List<String> values) {
            addCriterion("province_guid in", values, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidNotIn(List<String> values) {
            addCriterion("province_guid not in", values, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidBetween(String value1, String value2) {
            addCriterion("province_guid between", value1, value2, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andProvinceGuidNotBetween(String value1, String value2) {
            addCriterion("province_guid not between", value1, value2, "provinceGuid");
            return (Criteria) this;
        }

        public Criteria andArea2guidIsNull() {
            addCriterion("area2guid is null");
            return (Criteria) this;
        }

        public Criteria andArea2guidIsNotNull() {
            addCriterion("area2guid is not null");
            return (Criteria) this;
        }

        public Criteria andArea2guidEqualTo(String value) {
            addCriterion("area2guid =", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidNotEqualTo(String value) {
            addCriterion("area2guid <>", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidGreaterThan(String value) {
            addCriterion("area2guid >", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidGreaterThanOrEqualTo(String value) {
            addCriterion("area2guid >=", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidLessThan(String value) {
            addCriterion("area2guid <", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidLessThanOrEqualTo(String value) {
            addCriterion("area2guid <=", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidLike(String value) {
            addCriterion("area2guid like", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidNotLike(String value) {
            addCriterion("area2guid not like", value, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidIn(List<String> values) {
            addCriterion("area2guid in", values, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidNotIn(List<String> values) {
            addCriterion("area2guid not in", values, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidBetween(String value1, String value2) {
            addCriterion("area2guid between", value1, value2, "area2guid");
            return (Criteria) this;
        }

        public Criteria andArea2guidNotBetween(String value1, String value2) {
            addCriterion("area2guid not between", value1, value2, "area2guid");
            return (Criteria) this;
        }

        public Criteria andSecondNameIsNull() {
            addCriterion("second_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondNameIsNotNull() {
            addCriterion("second_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondNameEqualTo(String value) {
            addCriterion("second_name =", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotEqualTo(String value) {
            addCriterion("second_name <>", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameGreaterThan(String value) {
            addCriterion("second_name >", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_name >=", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLessThan(String value) {
            addCriterion("second_name <", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLessThanOrEqualTo(String value) {
            addCriterion("second_name <=", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameLike(String value) {
            addCriterion("second_name like", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotLike(String value) {
            addCriterion("second_name not like", value, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameIn(List<String> values) {
            addCriterion("second_name in", values, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotIn(List<String> values) {
            addCriterion("second_name not in", values, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameBetween(String value1, String value2) {
            addCriterion("second_name between", value1, value2, "secondName");
            return (Criteria) this;
        }

        public Criteria andSecondNameNotBetween(String value1, String value2) {
            addCriterion("second_name not between", value1, value2, "secondName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andAcademyguidIsNull() {
            addCriterion("AcademyGuid is null");
            return (Criteria) this;
        }

        public Criteria andAcademyguidIsNotNull() {
            addCriterion("AcademyGuid is not null");
            return (Criteria) this;
        }

        public Criteria andAcademyguidEqualTo(String value) {
            addCriterion("AcademyGuid =", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidNotEqualTo(String value) {
            addCriterion("AcademyGuid <>", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidGreaterThan(String value) {
            addCriterion("AcademyGuid >", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidGreaterThanOrEqualTo(String value) {
            addCriterion("AcademyGuid >=", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidLessThan(String value) {
            addCriterion("AcademyGuid <", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidLessThanOrEqualTo(String value) {
            addCriterion("AcademyGuid <=", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidLike(String value) {
            addCriterion("AcademyGuid like", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidNotLike(String value) {
            addCriterion("AcademyGuid not like", value, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidIn(List<String> values) {
            addCriterion("AcademyGuid in", values, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidNotIn(List<String> values) {
            addCriterion("AcademyGuid not in", values, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidBetween(String value1, String value2) {
            addCriterion("AcademyGuid between", value1, value2, "academyguid");
            return (Criteria) this;
        }

        public Criteria andAcademyguidNotBetween(String value1, String value2) {
            addCriterion("AcademyGuid not between", value1, value2, "academyguid");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("Deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("Deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("Deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("Deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("Deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("Deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("Deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("Deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("Deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("Deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("Deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("Deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCampusnameIsNull() {
            addCriterion("CampusName is null");
            return (Criteria) this;
        }

        public Criteria andCampusnameIsNotNull() {
            addCriterion("CampusName is not null");
            return (Criteria) this;
        }

        public Criteria andCampusnameEqualTo(String value) {
            addCriterion("CampusName =", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameNotEqualTo(String value) {
            addCriterion("CampusName <>", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameGreaterThan(String value) {
            addCriterion("CampusName >", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameGreaterThanOrEqualTo(String value) {
            addCriterion("CampusName >=", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameLessThan(String value) {
            addCriterion("CampusName <", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameLessThanOrEqualTo(String value) {
            addCriterion("CampusName <=", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameLike(String value) {
            addCriterion("CampusName like", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameNotLike(String value) {
            addCriterion("CampusName not like", value, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameIn(List<String> values) {
            addCriterion("CampusName in", values, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameNotIn(List<String> values) {
            addCriterion("CampusName not in", values, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameBetween(String value1, String value2) {
            addCriterion("CampusName between", value1, value2, "campusname");
            return (Criteria) this;
        }

        public Criteria andCampusnameNotBetween(String value1, String value2) {
            addCriterion("CampusName not between", value1, value2, "campusname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNull() {
            addCriterion("SchoolName is null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIsNotNull() {
            addCriterion("SchoolName is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolnameEqualTo(String value) {
            addCriterion("SchoolName =", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotEqualTo(String value) {
            addCriterion("SchoolName <>", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThan(String value) {
            addCriterion("SchoolName >", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameGreaterThanOrEqualTo(String value) {
            addCriterion("SchoolName >=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThan(String value) {
            addCriterion("SchoolName <", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLessThanOrEqualTo(String value) {
            addCriterion("SchoolName <=", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameLike(String value) {
            addCriterion("SchoolName like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotLike(String value) {
            addCriterion("SchoolName not like", value, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameIn(List<String> values) {
            addCriterion("SchoolName in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotIn(List<String> values) {
            addCriterion("SchoolName not in", values, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameBetween(String value1, String value2) {
            addCriterion("SchoolName between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolnameNotBetween(String value1, String value2) {
            addCriterion("SchoolName not between", value1, value2, "schoolname");
            return (Criteria) this;
        }

        public Criteria andSchoolSidIsNull() {
            addCriterion("school_sid is null");
            return (Criteria) this;
        }

        public Criteria andSchoolSidIsNotNull() {
            addCriterion("school_sid is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolSidEqualTo(Integer value) {
            addCriterion("school_sid =", value, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidNotEqualTo(Integer value) {
            addCriterion("school_sid <>", value, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidGreaterThan(Integer value) {
            addCriterion("school_sid >", value, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_sid >=", value, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidLessThan(Integer value) {
            addCriterion("school_sid <", value, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidLessThanOrEqualTo(Integer value) {
            addCriterion("school_sid <=", value, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidIn(List<Integer> values) {
            addCriterion("school_sid in", values, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidNotIn(List<Integer> values) {
            addCriterion("school_sid not in", values, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidBetween(Integer value1, Integer value2) {
            addCriterion("school_sid between", value1, value2, "schoolSid");
            return (Criteria) this;
        }

        public Criteria andSchoolSidNotBetween(Integer value1, Integer value2) {
            addCriterion("school_sid not between", value1, value2, "schoolSid");
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