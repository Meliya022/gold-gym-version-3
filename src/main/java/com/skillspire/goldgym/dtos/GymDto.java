package com.skillspire.goldgym.dtos;

public class GymDto {
    private Long id;
    private String address;
    private String managerName;

    public GymDto() {
    }

    public GymDto(Long id, String address, String managerName) {
        this.id = id;
        this.address = address;
        this.managerName = managerName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
