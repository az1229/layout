package ks.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andKsIdIsNull() {
            addCriterion("KS_ID is null");
            return (Criteria) this;
        }

        public Criteria andKsIdIsNotNull() {
            addCriterion("KS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKsIdEqualTo(Integer value) {
            addCriterion("KS_ID =", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotEqualTo(Integer value) {
            addCriterion("KS_ID <>", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdGreaterThan(Integer value) {
            addCriterion("KS_ID >", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("KS_ID >=", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLessThan(Integer value) {
            addCriterion("KS_ID <", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdLessThanOrEqualTo(Integer value) {
            addCriterion("KS_ID <=", value, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdIn(List<Integer> values) {
            addCriterion("KS_ID in", values, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotIn(List<Integer> values) {
            addCriterion("KS_ID not in", values, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdBetween(Integer value1, Integer value2) {
            addCriterion("KS_ID between", value1, value2, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("KS_ID not between", value1, value2, "ksId");
            return (Criteria) this;
        }

        public Criteria andKsNameIsNull() {
            addCriterion("KS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andKsNameIsNotNull() {
            addCriterion("KS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andKsNameEqualTo(String value) {
            addCriterion("KS_NAME =", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotEqualTo(String value) {
            addCriterion("KS_NAME <>", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameGreaterThan(String value) {
            addCriterion("KS_NAME >", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameGreaterThanOrEqualTo(String value) {
            addCriterion("KS_NAME >=", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLessThan(String value) {
            addCriterion("KS_NAME <", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLessThanOrEqualTo(String value) {
            addCriterion("KS_NAME <=", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLike(String value) {
            addCriterion("KS_NAME like", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotLike(String value) {
            addCriterion("KS_NAME not like", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameIn(List<String> values) {
            addCriterion("KS_NAME in", values, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotIn(List<String> values) {
            addCriterion("KS_NAME not in", values, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameBetween(String value1, String value2) {
            addCriterion("KS_NAME between", value1, value2, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotBetween(String value1, String value2) {
            addCriterion("KS_NAME not between", value1, value2, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsEmailIsNull() {
            addCriterion("KS_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andKsEmailIsNotNull() {
            addCriterion("KS_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andKsEmailEqualTo(String value) {
            addCriterion("KS_EMAIL =", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailNotEqualTo(String value) {
            addCriterion("KS_EMAIL <>", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailGreaterThan(String value) {
            addCriterion("KS_EMAIL >", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailGreaterThanOrEqualTo(String value) {
            addCriterion("KS_EMAIL >=", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailLessThan(String value) {
            addCriterion("KS_EMAIL <", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailLessThanOrEqualTo(String value) {
            addCriterion("KS_EMAIL <=", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailLike(String value) {
            addCriterion("KS_EMAIL like", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailNotLike(String value) {
            addCriterion("KS_EMAIL not like", value, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailIn(List<String> values) {
            addCriterion("KS_EMAIL in", values, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailNotIn(List<String> values) {
            addCriterion("KS_EMAIL not in", values, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailBetween(String value1, String value2) {
            addCriterion("KS_EMAIL between", value1, value2, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsEmailNotBetween(String value1, String value2) {
            addCriterion("KS_EMAIL not between", value1, value2, "ksEmail");
            return (Criteria) this;
        }

        public Criteria andKsSubjectIsNull() {
            addCriterion("KS_SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andKsSubjectIsNotNull() {
            addCriterion("KS_SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andKsSubjectEqualTo(String value) {
            addCriterion("KS_SUBJECT =", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectNotEqualTo(String value) {
            addCriterion("KS_SUBJECT <>", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectGreaterThan(String value) {
            addCriterion("KS_SUBJECT >", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("KS_SUBJECT >=", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectLessThan(String value) {
            addCriterion("KS_SUBJECT <", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectLessThanOrEqualTo(String value) {
            addCriterion("KS_SUBJECT <=", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectLike(String value) {
            addCriterion("KS_SUBJECT like", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectNotLike(String value) {
            addCriterion("KS_SUBJECT not like", value, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectIn(List<String> values) {
            addCriterion("KS_SUBJECT in", values, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectNotIn(List<String> values) {
            addCriterion("KS_SUBJECT not in", values, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectBetween(String value1, String value2) {
            addCriterion("KS_SUBJECT between", value1, value2, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsSubjectNotBetween(String value1, String value2) {
            addCriterion("KS_SUBJECT not between", value1, value2, "ksSubject");
            return (Criteria) this;
        }

        public Criteria andKsMessageIsNull() {
            addCriterion("KS_MESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andKsMessageIsNotNull() {
            addCriterion("KS_MESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andKsMessageEqualTo(String value) {
            addCriterion("KS_MESSAGE =", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageNotEqualTo(String value) {
            addCriterion("KS_MESSAGE <>", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageGreaterThan(String value) {
            addCriterion("KS_MESSAGE >", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageGreaterThanOrEqualTo(String value) {
            addCriterion("KS_MESSAGE >=", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageLessThan(String value) {
            addCriterion("KS_MESSAGE <", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageLessThanOrEqualTo(String value) {
            addCriterion("KS_MESSAGE <=", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageLike(String value) {
            addCriterion("KS_MESSAGE like", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageNotLike(String value) {
            addCriterion("KS_MESSAGE not like", value, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageIn(List<String> values) {
            addCriterion("KS_MESSAGE in", values, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageNotIn(List<String> values) {
            addCriterion("KS_MESSAGE not in", values, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageBetween(String value1, String value2) {
            addCriterion("KS_MESSAGE between", value1, value2, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsMessageNotBetween(String value1, String value2) {
            addCriterion("KS_MESSAGE not between", value1, value2, "ksMessage");
            return (Criteria) this;
        }

        public Criteria andKsDataIsNull() {
            addCriterion("KS_DATA is null");
            return (Criteria) this;
        }

        public Criteria andKsDataIsNotNull() {
            addCriterion("KS_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andKsDataEqualTo(Date value) {
            addCriterion("KS_DATA =", value, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataNotEqualTo(Date value) {
            addCriterion("KS_DATA <>", value, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataGreaterThan(Date value) {
            addCriterion("KS_DATA >", value, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataGreaterThanOrEqualTo(Date value) {
            addCriterion("KS_DATA >=", value, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataLessThan(Date value) {
            addCriterion("KS_DATA <", value, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataLessThanOrEqualTo(Date value) {
            addCriterion("KS_DATA <=", value, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataIn(List<Date> values) {
            addCriterion("KS_DATA in", values, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataNotIn(List<Date> values) {
            addCriterion("KS_DATA not in", values, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataBetween(Date value1, Date value2) {
            addCriterion("KS_DATA between", value1, value2, "ksData");
            return (Criteria) this;
        }

        public Criteria andKsDataNotBetween(Date value1, Date value2) {
            addCriterion("KS_DATA not between", value1, value2, "ksData");
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