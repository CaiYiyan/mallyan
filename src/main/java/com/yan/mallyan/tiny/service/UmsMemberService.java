package com.yan.mallyan.tiny.service;

import com.yan.mallyan.tiny.common.api.CommonResult;

/**
 * 会员管理Service
 * Created by macro on 2020/03/07.
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
