package com.ssm.pojo;

public class TRole {
    private Integer id;

    private String name;

    private String password;

    private String phone;

    private Integer role;
    
    private String louhao;
    
    private Integer louhaoid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

	public String getLouhao() {
		return louhao;
	}

	public void setLouhao(String louhao) {
		this.louhao = louhao;
	}
	
	

	public Integer getLouhaoid() {
		return louhaoid;
	}

	public void setLouhaoid(Integer louhaoid) {
		this.louhaoid = louhaoid;
	}

	@Override
	public String toString() {
		return "TRole [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", role=" + role
				+ ", louhao=" + louhao + ", louhaoid=" + louhaoid + "]";
	}
	
}