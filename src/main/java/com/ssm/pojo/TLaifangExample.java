package com.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TLaifangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLaifangExample() {
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

        public Criteria andLaifangrenIsNull() {
            addCriterion("laifangren is null");
            return (Criteria) this;
        }

        public Criteria andLaifangrenIsNotNull() {
            addCriterion("laifangren is not null");
            return (Criteria) this;
        }

        public Criteria andLaifangrenEqualTo(String value) {
            addCriterion("laifangren =", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenNotEqualTo(String value) {
            addCriterion("laifangren <>", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenGreaterThan(String value) {
            addCriterion("laifangren >", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenGreaterThanOrEqualTo(String value) {
            addCriterion("laifangren >=", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenLessThan(String value) {
            addCriterion("laifangren <", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenLessThanOrEqualTo(String value) {
            addCriterion("laifangren <=", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenLike(String value) {
            addCriterion("laifangren like", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenNotLike(String value) {
            addCriterion("laifangren not like", value, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenIn(List<String> values) {
            addCriterion("laifangren in", values, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenNotIn(List<String> values) {
            addCriterion("laifangren not in", values, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenBetween(String value1, String value2) {
            addCriterion("laifangren between", value1, value2, "laifangren");
            return (Criteria) this;
        }

        public Criteria andLaifangrenNotBetween(String value1, String value2) {
            addCriterion("laifangren not between", value1, value2, "laifangren");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIsNull() {
            addCriterion("idcardnum is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIsNotNull() {
            addCriterion("idcardnum is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumEqualTo(String value) {
            addCriterion("idcardnum =", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotEqualTo(String value) {
            addCriterion("idcardnum <>", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumGreaterThan(String value) {
            addCriterion("idcardnum >", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumGreaterThanOrEqualTo(String value) {
            addCriterion("idcardnum >=", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLessThan(String value) {
            addCriterion("idcardnum <", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLessThanOrEqualTo(String value) {
            addCriterion("idcardnum <=", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumLike(String value) {
            addCriterion("idcardnum like", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotLike(String value) {
            addCriterion("idcardnum not like", value, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumIn(List<String> values) {
            addCriterion("idcardnum in", values, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotIn(List<String> values) {
            addCriterion("idcardnum not in", values, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumBetween(String value1, String value2) {
            addCriterion("idcardnum between", value1, value2, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andIdcardnumNotBetween(String value1, String value2) {
            addCriterion("idcardnum not between", value1, value2, "idcardnum");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("relation like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("relation not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
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

        public Criteria andMatterIsNull() {
            addCriterion("matter is null");
            return (Criteria) this;
        }

        public Criteria andMatterIsNotNull() {
            addCriterion("matter is not null");
            return (Criteria) this;
        }

        public Criteria andMatterEqualTo(String value) {
            addCriterion("matter =", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotEqualTo(String value) {
            addCriterion("matter <>", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterGreaterThan(String value) {
            addCriterion("matter >", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterGreaterThanOrEqualTo(String value) {
            addCriterion("matter >=", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterLessThan(String value) {
            addCriterion("matter <", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterLessThanOrEqualTo(String value) {
            addCriterion("matter <=", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterLike(String value) {
            addCriterion("matter like", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotLike(String value) {
            addCriterion("matter not like", value, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterIn(List<String> values) {
            addCriterion("matter in", values, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotIn(List<String> values) {
            addCriterion("matter not in", values, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterBetween(String value1, String value2) {
            addCriterion("matter between", value1, value2, "matter");
            return (Criteria) this;
        }

        public Criteria andMatterNotBetween(String value1, String value2) {
            addCriterion("matter not between", value1, value2, "matter");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("ltime is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("ltime is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(String value) {
            addCriterion("ltime =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(String value) {
            addCriterion("ltime <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(String value) {
            addCriterion("ltime >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(String value) {
            addCriterion("ltime >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(String value) {
            addCriterion("ltime <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(String value) {
            addCriterion("ltime <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLike(String value) {
            addCriterion("ltime like", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotLike(String value) {
            addCriterion("ltime not like", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<String> values) {
            addCriterion("ltime in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<String> values) {
            addCriterion("ltime not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(String value1, String value2) {
            addCriterion("ltime between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(String value1, String value2) {
            addCriterion("ltime not between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andQtimeIsNull() {
            addCriterion("qtime is null");
            return (Criteria) this;
        }

        public Criteria andQtimeIsNotNull() {
            addCriterion("qtime is not null");
            return (Criteria) this;
        }

        public Criteria andQtimeEqualTo(String value) {
            addCriterion("qtime =", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotEqualTo(String value) {
            addCriterion("qtime <>", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeGreaterThan(String value) {
            addCriterion("qtime >", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeGreaterThanOrEqualTo(String value) {
            addCriterion("qtime >=", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLessThan(String value) {
            addCriterion("qtime <", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLessThanOrEqualTo(String value) {
            addCriterion("qtime <=", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeLike(String value) {
            addCriterion("qtime like", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotLike(String value) {
            addCriterion("qtime not like", value, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeIn(List<String> values) {
            addCriterion("qtime in", values, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotIn(List<String> values) {
            addCriterion("qtime not in", values, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeBetween(String value1, String value2) {
            addCriterion("qtime between", value1, value2, "qtime");
            return (Criteria) this;
        }

        public Criteria andQtimeNotBetween(String value1, String value2) {
            addCriterion("qtime not between", value1, value2, "qtime");
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