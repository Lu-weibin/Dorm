package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStudentExample() {
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

        public Criteria andXuehaoIsNull() {
            addCriterion("xuehao is null");
            return (Criteria) this;
        }

        public Criteria andXuehaoIsNotNull() {
            addCriterion("xuehao is not null");
            return (Criteria) this;
        }

        public Criteria andXuehaoEqualTo(String value) {
            addCriterion("xuehao =", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotEqualTo(String value) {
            addCriterion("xuehao <>", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoGreaterThan(String value) {
            addCriterion("xuehao >", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoGreaterThanOrEqualTo(String value) {
            addCriterion("xuehao >=", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoLessThan(String value) {
            addCriterion("xuehao <", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoLessThanOrEqualTo(String value) {
            addCriterion("xuehao <=", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoLike(String value) {
            addCriterion("xuehao like", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotLike(String value) {
            addCriterion("xuehao not like", value, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoIn(List<String> values) {
            addCriterion("xuehao in", values, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotIn(List<String> values) {
            addCriterion("xuehao not in", values, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoBetween(String value1, String value2) {
            addCriterion("xuehao between", value1, value2, "xuehao");
            return (Criteria) this;
        }

        public Criteria andXuehaoNotBetween(String value1, String value2) {
            addCriterion("xuehao not between", value1, value2, "xuehao");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNull() {
            addCriterion("banji is null");
            return (Criteria) this;
        }

        public Criteria andBanjiIsNotNull() {
            addCriterion("banji is not null");
            return (Criteria) this;
        }

        public Criteria andBanjiEqualTo(String value) {
            addCriterion("banji =", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotEqualTo(String value) {
            addCriterion("banji <>", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThan(String value) {
            addCriterion("banji >", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiGreaterThanOrEqualTo(String value) {
            addCriterion("banji >=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThan(String value) {
            addCriterion("banji <", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLessThanOrEqualTo(String value) {
            addCriterion("banji <=", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiLike(String value) {
            addCriterion("banji like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotLike(String value) {
            addCriterion("banji not like", value, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiIn(List<String> values) {
            addCriterion("banji in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotIn(List<String> values) {
            addCriterion("banji not in", values, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiBetween(String value1, String value2) {
            addCriterion("banji between", value1, value2, "banji");
            return (Criteria) this;
        }

        public Criteria andBanjiNotBetween(String value1, String value2) {
            addCriterion("banji not between", value1, value2, "banji");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andLouhaoIsNull() {
            addCriterion("louhao is null");
            return (Criteria) this;
        }

        public Criteria andLouhaoIsNotNull() {
            addCriterion("louhao is not null");
            return (Criteria) this;
        }

        public Criteria andLouhaoEqualTo(String value) {
            addCriterion("louhao =", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoNotEqualTo(String value) {
            addCriterion("louhao <>", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoGreaterThan(String value) {
            addCriterion("louhao >", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoGreaterThanOrEqualTo(String value) {
            addCriterion("louhao >=", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoLessThan(String value) {
            addCriterion("louhao <", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoLessThanOrEqualTo(String value) {
            addCriterion("louhao <=", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoLike(String value) {
            addCriterion("louhao like", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoNotLike(String value) {
            addCriterion("louhao not like", value, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoIn(List<String> values) {
            addCriterion("louhao in", values, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoNotIn(List<String> values) {
            addCriterion("louhao not in", values, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoBetween(String value1, String value2) {
            addCriterion("louhao between", value1, value2, "louhao");
            return (Criteria) this;
        }

        public Criteria andLouhaoNotBetween(String value1, String value2) {
            addCriterion("louhao not between", value1, value2, "louhao");
            return (Criteria) this;
        }

        public Criteria andDormNumIsNull() {
            addCriterion("dorm_num is null");
            return (Criteria) this;
        }

        public Criteria andDormNumIsNotNull() {
            addCriterion("dorm_num is not null");
            return (Criteria) this;
        }

        public Criteria andDormNumEqualTo(String value) {
            addCriterion("dorm_num =", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumNotEqualTo(String value) {
            addCriterion("dorm_num <>", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumGreaterThan(String value) {
            addCriterion("dorm_num >", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumGreaterThanOrEqualTo(String value) {
            addCriterion("dorm_num >=", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumLessThan(String value) {
            addCriterion("dorm_num <", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumLessThanOrEqualTo(String value) {
            addCriterion("dorm_num <=", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumLike(String value) {
            addCriterion("dorm_num like", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumNotLike(String value) {
            addCriterion("dorm_num not like", value, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumIn(List<String> values) {
            addCriterion("dorm_num in", values, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumNotIn(List<String> values) {
            addCriterion("dorm_num not in", values, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumBetween(String value1, String value2) {
            addCriterion("dorm_num between", value1, value2, "dormNum");
            return (Criteria) this;
        }

        public Criteria andDormNumNotBetween(String value1, String value2) {
            addCriterion("dorm_num not between", value1, value2, "dormNum");
            return (Criteria) this;
        }

        public Criteria andChuanhaoIsNull() {
            addCriterion("chuanhao is null");
            return (Criteria) this;
        }

        public Criteria andChuanhaoIsNotNull() {
            addCriterion("chuanhao is not null");
            return (Criteria) this;
        }

        public Criteria andChuanhaoEqualTo(String value) {
            addCriterion("chuanhao =", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoNotEqualTo(String value) {
            addCriterion("chuanhao <>", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoGreaterThan(String value) {
            addCriterion("chuanhao >", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoGreaterThanOrEqualTo(String value) {
            addCriterion("chuanhao >=", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoLessThan(String value) {
            addCriterion("chuanhao <", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoLessThanOrEqualTo(String value) {
            addCriterion("chuanhao <=", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoLike(String value) {
            addCriterion("chuanhao like", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoNotLike(String value) {
            addCriterion("chuanhao not like", value, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoIn(List<String> values) {
            addCriterion("chuanhao in", values, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoNotIn(List<String> values) {
            addCriterion("chuanhao not in", values, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoBetween(String value1, String value2) {
            addCriterion("chuanhao between", value1, value2, "chuanhao");
            return (Criteria) this;
        }

        public Criteria andChuanhaoNotBetween(String value1, String value2) {
            addCriterion("chuanhao not between", value1, value2, "chuanhao");
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