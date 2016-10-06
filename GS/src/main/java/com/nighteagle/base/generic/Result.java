package com.nighteagle.base.generic;

/**
 * Created by gaosen1 on 2016/10/6.
 */
public class Result<DTO> {
    private DTO dto;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DTO getDto() {
        return dto;
    }

    public void setDto(DTO dto) {
        this.dto = dto;
    }


}
