package com.graduation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContributorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContributorExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andRepositoryidIsNull() {
            addCriterion("repositoryId is null");
            return (Criteria) this;
        }

        public Criteria andRepositoryidIsNotNull() {
            addCriterion("repositoryId is not null");
            return (Criteria) this;
        }

        public Criteria andRepositoryidEqualTo(Long value) {
            addCriterion("repositoryId =", value, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidNotEqualTo(Long value) {
            addCriterion("repositoryId <>", value, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidGreaterThan(Long value) {
            addCriterion("repositoryId >", value, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidGreaterThanOrEqualTo(Long value) {
            addCriterion("repositoryId >=", value, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidLessThan(Long value) {
            addCriterion("repositoryId <", value, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidLessThanOrEqualTo(Long value) {
            addCriterion("repositoryId <=", value, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidIn(List<Long> values) {
            addCriterion("repositoryId in", values, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidNotIn(List<Long> values) {
            addCriterion("repositoryId not in", values, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidBetween(Long value1, Long value2) {
            addCriterion("repositoryId between", value1, value2, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andRepositoryidNotBetween(Long value1, Long value2) {
            addCriterion("repositoryId not between", value1, value2, "repositoryid");
            return (Criteria) this;
        }

        public Criteria andContributorIsNull() {
            addCriterion("contributor is null");
            return (Criteria) this;
        }

        public Criteria andContributorIsNotNull() {
            addCriterion("contributor is not null");
            return (Criteria) this;
        }

        public Criteria andContributorEqualTo(String value) {
            addCriterion("contributor =", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotEqualTo(String value) {
            addCriterion("contributor <>", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorGreaterThan(String value) {
            addCriterion("contributor >", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorGreaterThanOrEqualTo(String value) {
            addCriterion("contributor >=", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLessThan(String value) {
            addCriterion("contributor <", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLessThanOrEqualTo(String value) {
            addCriterion("contributor <=", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorLike(String value) {
            addCriterion("contributor like", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotLike(String value) {
            addCriterion("contributor not like", value, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorIn(List<String> values) {
            addCriterion("contributor in", values, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotIn(List<String> values) {
            addCriterion("contributor not in", values, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorBetween(String value1, String value2) {
            addCriterion("contributor between", value1, value2, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributorNotBetween(String value1, String value2) {
            addCriterion("contributor not between", value1, value2, "contributor");
            return (Criteria) this;
        }

        public Criteria andContributionsIsNull() {
            addCriterion("contributions is null");
            return (Criteria) this;
        }

        public Criteria andContributionsIsNotNull() {
            addCriterion("contributions is not null");
            return (Criteria) this;
        }

        public Criteria andContributionsEqualTo(Integer value) {
            addCriterion("contributions =", value, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsNotEqualTo(Integer value) {
            addCriterion("contributions <>", value, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsGreaterThan(Integer value) {
            addCriterion("contributions >", value, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("contributions >=", value, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsLessThan(Integer value) {
            addCriterion("contributions <", value, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsLessThanOrEqualTo(Integer value) {
            addCriterion("contributions <=", value, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsIn(List<Integer> values) {
            addCriterion("contributions in", values, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsNotIn(List<Integer> values) {
            addCriterion("contributions not in", values, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsBetween(Integer value1, Integer value2) {
            addCriterion("contributions between", value1, value2, "contributions");
            return (Criteria) this;
        }

        public Criteria andContributionsNotBetween(Integer value1, Integer value2) {
            addCriterion("contributions not between", value1, value2, "contributions");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
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