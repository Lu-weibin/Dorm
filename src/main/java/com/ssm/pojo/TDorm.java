package com.ssm.pojo;

public class TDorm {
    private Integer id;

    private String louhao;

    private String sushehao;

    private String rongliang;

    private String dangqianrenshu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLouhao() {
        return louhao;
    }

    public void setLouhao(String louhao) {
        this.louhao = louhao == null ? null : louhao.trim();
    }

    public String getSushehao() {
        return sushehao;
    }

    public void setSushehao(String sushehao) {
        this.sushehao = sushehao == null ? null : sushehao.trim();
    }

    public String getRongliang() {
        return rongliang;
    }

    public void setRongliang(String rongliang) {
        this.rongliang = rongliang == null ? null : rongliang.trim();
    }

    public String getDangqianrenshu() {
        return dangqianrenshu;
    }

    public void setDangqianrenshu(String dangqianrenshu) {
        this.dangqianrenshu = dangqianrenshu == null ? null : dangqianrenshu.trim();
    }

	@Override
	public String toString() {
		return "TDorm [id=" + id + ", louhao=" + louhao + ", sushehao=" + sushehao + ", rongliang=" + rongliang
				+ ", dangqianrenshu=" + dangqianrenshu + "]";
	}
    
    
}