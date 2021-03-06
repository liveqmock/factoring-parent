package com.ph.shopping.common.core.dto;

import com.ph.shopping.common.core.base.BaseValidate;

import javax.validation.constraints.NotNull;

/**
 * 公共发送验证码
 * @author xwolf
 * @since 1.8
 **/
public class CommonDTO extends BaseValidate {

    @NotNull(message = "手机号码不能为空")
    private String phone;//	用户手机号

    @NotNull(message = "编码不能为空")
    private String codeType ;


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @Override
    public String toString() {
        return "CommonDTO{" +
                "phone='" + phone + '\'' +
                ", codeType='" + codeType + '\'' +
                '}';
    }
}
