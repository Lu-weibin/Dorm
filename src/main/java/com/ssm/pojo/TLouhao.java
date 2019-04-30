package com.ssm.pojo;

public class TLouhao {
    private Integer id;

    private String louhao;

    private Integer suguanid;

    private String description;

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

    public Integer getSuguanid() {
        return suguanid;
    }

    public void setSuguanid(Integer suguanid) {
        this.suguanid = suguanid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}