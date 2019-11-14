package com.fuscent.yooli.sso.controller;

import com.fuscent.yooli.sso.common.Result;
import com.fuscent.yooli.sso.utils.VerifyCodeUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping("login")
public class LoginController {
    //方法上必须带上RequestMapping，否则不会被识别为url路径
    @RequestMapping("")
    public String login(){
        return "login";
    }

    @RequestMapping("dologin")
    @ResponseBody
    public Result dologin(String username, String password, String verifyCode, HttpServletRequest request, HttpSession session){
        String verifyCodeSession = (String)session.getAttribute("verifyCode");
        if(StringUtils.isNotEmpty(verifyCodeSession)&&verifyCodeSession.equalsIgnoreCase(verifyCode)){
            if("dubei".equalsIgnoreCase(username)&&"123456".equalsIgnoreCase(password)){
                HashMap<String, Object> params = new HashMap<String, Object>();
                params.put("username","dubei");
                params.put("password","123456");
                params.put("nickname","杜贝");
                session.setAttribute("isLogin",true);
                params.remove("password");
                session.setAttribute("username","dubei");
                return Result.success();
            }else{
                return Result.fail("账号或密码错误");
            }
        }else{
            return Result.fail("验证码错误");
        }
    }

    @RequestMapping("verify")
    @ResponseBody
    public void verify(HttpSession session, HttpServletResponse response) throws IOException {
        String verifyCode = VerifyCodeUtil.outputVerifyImage(100, 40, response.getOutputStream(), 4);
        session.setAttribute("verifyCode",verifyCode);
    }

}
