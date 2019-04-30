package com.ssm.pojo;

public class TBaoxiu {
    private Integer id;

    private String description;

    private Integer state;

    private Integer repairId;

    private String btime;

    private String ctime;

    private String dormNum;
    
    private String repairName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime == null ? null : btime.trim();
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime == null ? null : ctime.trim();
    }

    public String getDormNum() {
        return dormNum;
    }

    public void setDormNum(String dormNum) {
        this.dormNum = dormNum == null ? null : dormNum.trim();
    }

	public String getRepairName() {
		return repairName;
	}

	public void setRepairName(String repairName) {
		this.repairName = repairName;
	}

	@Override
	public String toString() {
		return "TBaoxiu [id=" + id + ", description=" + description + ", state=" + state + ", repairId=" + repairId
				+ ", btime=" + btime + ", ctime=" + ctime + ", dormNum=" + dormNum + ", repairName=" + repairName + "]";
	}
    
    
}