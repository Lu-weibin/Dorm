package com.ssm.pojo;

public class TWangui {
    private Integer id;

    private String xuehao;

    private String name;

    private String time;

    private String matter;

    private String louhao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter == null ? null : matter.trim();
    }

    public String getLouhao() {
        return louhao;
    }

    public void setLouhao(String louhao) {
        this.louhao = louhao == null ? null : louhao.trim();
    }
}