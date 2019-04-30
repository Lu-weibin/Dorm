package com.ssm.pojo;

public class TStudent {
    private String xuehao;

    private String password;

    private String name;

    private String sex;

    private String banji;

    private String phone;

    private String louhao;

    private String dormNum;

    private String chuanhao;

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao == null ? null : xuehao.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji == null ? null : banji.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getLouhao() {
        return louhao;
    }

    public void setLouhao(String louhao) {
        this.louhao = louhao == null ? null : louhao.trim();
    }

    public String getDormNum() {
        return dormNum;
    }

    public void setDormNum(String dormNum) {
        this.dormNum = dormNum == null ? null : dormNum.trim();
    }

    public String getChuanhao() {
        return chuanhao;
    }

    public void setChuanhao(String chuanhao) {
        this.chuanhao = chuanhao == null ? null : chuanhao.trim();
    }

	@Override
	public String toString() {
		return "TStudent [xuehao=" + xuehao + ", password=" + password + ", name=" + name + ", sex=" + sex + ", banji="
				+ banji + ", phone=" + phone + ", louhao=" + louhao + ", dormNum=" + dormNum + ", chuanhao=" + chuanhao
				+ "]";
	}
    
    
}