package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TDormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TDormExample() {
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

        public Criteria andSushehaoIsNull() {
            addCriterion("sushehao is null");
            return (Criteria) this;
        }

        public Criteria andSushehaoIsNotNull() {
            addCriterion("sushehao is not null");
            return (Criteria) this;
        }

        public Criteria andSushehaoEqualTo(String value) {
            addCriterion("sushehao =", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotEqualTo(String value) {
            addCriterion("sushehao <>", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoGreaterThan(String value) {
            addCriterion("sushehao >", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoGreaterThanOrEqualTo(String value) {
            addCriterion("sushehao >=", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoLessThan(String value) {
            addCriterion("sushehao <", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoLessThanOrEqualTo(String value) {
            addCriterion("sushehao <=", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoLike(String value) {
            addCriterion("sushehao like", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotLike(String value) {
            addCriterion("sushehao not like", value, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoIn(List<String> values) {
            addCriterion("sushehao in", values, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotIn(List<String> values) {
            addCriterion("sushehao not in", values, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoBetween(String value1, String value2) {
            addCriterion("sushehao between", value1, value2, "sushehao");
            return (Criteria) this;
        }

        public Criteria andSushehaoNotBetween(String value1, String value2) {
            addCriterion("sushehao not between", value1, value2, "sushehao");
            return (Criteria) this;
        }

        public Criteria andRongliangIsNull() {
            addCriterion("rongliang is null");
            return (Criteria) this;
        }

        public Criteria andRongliangIsNotNull() {
            addCriterion("rongliang is not null");
            return (Criteria) this;
        }

        public Criteria andRongliangEqualTo(String value) {
            addCriterion("rongliang =", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangNotEqualTo(String value) {
            addCriterion("rongliang <>", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangGreaterThan(String value) {
            addCriterion("rongliang >", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangGreaterThanOrEqualTo(String value) {
            addCriterion("rongliang >=", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangLessThan(String value) {
            addCriterion("rongliang <", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangLessThanOrEqualTo(String value) {
            addCriterion("rongliang <=", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangLike(String value) {
            addCriterion("rongliang like", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangNotLike(String value) {
            addCriterion("rongliang not like", value, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangIn(List<String> values) {
            addCriterion("rongliang in", values, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangNotIn(List<String> values) {
            addCriterion("rongliang not in", values, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangBetween(String value1, String value2) {
            addCriterion("rongliang between", value1, value2, "rongliang");
            return (Criteria) this;
        }

        public Criteria andRongliangNotBetween(String value1, String value2) {
            addCriterion("rongliang not between", value1, value2, "rongliang");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuIsNull() {
            addCriterion("dangqianrenshu is null");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuIsNotNull() {
            addCriterion("dangqianrenshu is not null");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuEqualTo(String value) {
            addCriterion("dangqianrenshu =", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuNotEqualTo(String value) {
            addCriterion("dangqianrenshu <>", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuGreaterThan(String value) {
            addCriterion("dangqianrenshu >", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuGreaterThanOrEqualTo(String value) {
            addCriterion("dangqianrenshu >=", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuLessThan(String value) {
            addCriterion("dangqianrenshu <", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuLessThanOrEqualTo(String value) {
            addCriterion("dangqianrenshu <=", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuLike(String value) {
            addCriterion("dangqianrenshu like", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuNotLike(String value) {
            addCriterion("dangqianrenshu not like", value, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuIn(List<String> values) {
            addCriterion("dangqianrenshu in", values, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuNotIn(List<String> values) {
            addCriterion("dangqianrenshu not in", values, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuBetween(String value1, String value2) {
            addCriterion("dangqianrenshu between", value1, value2, "dangqianrenshu");
            return (Criteria) this;
        }

        public Criteria andDangqianrenshuNotBetween(String value1, String value2) {
            addCriterion("dangqianrenshu not between", value1, value2, "dangqianrenshu");
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