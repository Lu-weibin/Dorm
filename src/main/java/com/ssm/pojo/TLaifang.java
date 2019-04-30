package com.ssm.pojo;

public class TLaifang {
    private Integer id;

    private String laifangren;

    private String idcardnum;

    private String relation;

    private String xuehao;

    private String name;

    private String matter;

    private String ltime;

    private String qtime;

    private String louhao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLaifangren() {
        return laifangren;
    }

    public void setLaifangren(String laifangren) {
        this.laifangren = laifangren == null ? null : laifangren.trim();
    }

    public String getIdcardnum() {
        return idcardnum;
    }

    public void setIdcardnum(String idcardnum) {
        this.idcardnum = idcardnum == null ? null : idcardnum.trim();
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao == null ? null : xuehao.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter == null ? null : matter.trim();
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime == null ? null : ltime.trim();
    }

    public String getQtime() {
        return qtime;
    }

    public void setQtime(String qtime) {
        this.qtime = qtime == null ? null : qtime.trim();
    }

    public String getLouhao() {
        return louhao;
    }

    public void setLouhao(String louhao) {
        this.louhao = louhao == null ? null : louhao.trim();
    }

	@Override
	public String toString() {
		return "TLaifang [id=" + id + ", laifangren=" + laifangren + ", idcardnum=" + idcardnum + ", relation="
				+ relation + ", xuehao=" + xuehao + ", name=" + name + ", matter=" + matter + ", ltime=" + ltime
				+ ", qtime=" + qtime + ", louhao=" + louhao + "]";
	}
    
    
}