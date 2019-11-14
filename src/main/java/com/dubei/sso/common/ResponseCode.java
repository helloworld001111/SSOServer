package com.dubei.sso.common;

/**
 * Created by yuyong.zhao on 2017-08-01 11:13.
 */
public enum ResponseCode {
    UOK(200, "success"),
    FAIL(500, "fail"),
    ARGS_ERR(501, "param error"),
    UNKNOWN(10000, "unknown error"),
    TOKEN_ILLEGAL(50000, "token not exist"),
    TOKEN_IS_NULL(50001, "token is null"),
    USER_UNLOGGED(50002, "user not signin"),
    USER_LOGGED(50003, "user has signined"),
    USER_NOT_EXIST(50004, "user not exist"),
    USER_NAME_PWD_ERR(50006, "user name or password error"),
    USER_TOKEN_NOT_MATCH(50007, "token is not match"),
    USER_NICKNAME_DUPLICATED(50008, "nickname duplicated"),
    ;


    private Integer code;
    private String desc;

    ResponseCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public ResponseCode setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public ResponseCode setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String code2Str() {
        return code.toString();
    }

    @Override
    public String toString() {
        return "ResponseCode{" +
                "code=" + code +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String regx = "/\\{([^}]+)\\}/";
        String json = "{\n" +
                "    \"id\": 22, \n" +
                "    \"name\": \"基础数据\", \n" +
                "    \"parentId\": 0, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 23, \n" +
                "    \"name\": \"核心仪表盘\", \n" +
                "    \"parentId\": 22, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 24, \n" +
                "    \"name\": \"核心指标趋势\", \n" +
                "    \"parentId\": 23, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/core/board/trend\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 25, \n" +
                "    \"name\": \"产品分析\", \n" +
                "    \"parentId\": 22, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 26, \n" +
                "    \"name\": \"投资日报\", \n" +
                "    \"parentId\": 25, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/core/product/invest\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 27, \n" +
                "    \"name\": \"终端应用分析\", \n" +
                "    \"parentId\": 22, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 28, \n" +
                "    \"name\": \"移动和桌面端充值日报\", \n" +
                "    \"parentId\": 27, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/core/terminal/recharge\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 29, \n" +
                "    \"name\": \"金融运营数据\", \n" +
                "    \"parentId\": 0, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 30, \n" +
                "    \"name\": \"基础信息\", \n" +
                "    \"parentId\": 29, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 31, \n" +
                "    \"name\": \"标的信息\", \n" +
                "    \"parentId\": 29, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/bid\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 32, \n" +
                "    \"name\": \"产品信息\", \n" +
                "    \"parentId\": 29, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/product\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 33, \n" +
                "    \"name\": \"充提统计\", \n" +
                "    \"parentId\": 30, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/base/funds\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 34, \n" +
                "    \"name\": \"投资统计\", \n" +
                "    \"parentId\": 30, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/base/invest\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 35, \n" +
                "    \"name\": \"预约统计\", \n" +
                "    \"parentId\": 30, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/base/reserve\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 36, \n" +
                "    \"name\": \"无忧宝统计\", \n" +
                "    \"parentId\": 30, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/base/current\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 38, \n" +
                "    \"name\": \"运营日报数据\", \n" +
                "    \"parentId\": 0, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 39, \n" +
                "    \"name\": \"基础数据\", \n" +
                "    \"parentId\": 38, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/event\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 40, \n" +
                "    \"name\": \"金额区间数据\", \n" +
                "    \"parentId\": 38, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/event/interval\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 41, \n" +
                "    \"name\": \"理财产品数据\", \n" +
                "    \"parentId\": 0, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 42, \n" +
                "    \"name\": \"理财产品数据\", \n" +
                "    \"parentId\": 41, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/product\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 44, \n" +
                "    \"name\": \"资金支付数据\", \n" +
                "    \"parentId\": 0, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 45, \n" +
                "    \"name\": \"基础数据\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 46, \n" +
                "    \"name\": \"分支付类型\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay/type\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 47, \n" +
                "    \"name\": \"分终端充值\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay/terminal\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 48, \n" +
                "    \"name\": \"充值失败重试\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay/retry\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 49, \n" +
                "    \"name\": \"分银行/支付类型\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay/bank\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 50, \n" +
                "    \"name\": \"非网银错误码\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay/non-online-banking\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 51, \n" +
                "    \"name\": \"支付类型各银行充值\", \n" +
                "    \"parentId\": 44, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/pay/bank-recharge\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 54, \n" +
                "    \"name\": \"定存宝统计\", \n" +
                "    \"parentId\": 41, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/product/loan\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 57, \n" +
                "    \"name\": \"新客统计\", \n" +
                "    \"parentId\": 41, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/product/report\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 58, \n" +
                "    \"name\": \"提现明细\", \n" +
                "    \"parentId\": 29, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/finance/withdraw\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 59, \n" +
                "    \"name\": \"定存宝续投与再投资\", \n" +
                "    \"parentId\": 41, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/product/loan-cast\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 61, \n" +
                "    \"name\": \"无忧宝产品数据\", \n" +
                "    \"parentId\": 41, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 62, \n" +
                "    \"name\": \"无忧宝去向来源分布\", \n" +
                "    \"parentId\": 61, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/product/current-stock/query-stock-flow\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 63, \n" +
                "    \"name\": \"无忧宝持有分布\", \n" +
                "    \"parentId\": 61, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/console/product/current-stock/query-stock-own\", \n" +
                "    \"enable\": 1\n" +
                "}, \n" +
                "{\n" +
                "    \"id\": 65, \n" +
                "    \"name\": \"asdasda\", \n" +
                "    \"parentId\": 0, \n" +
                "    \"icon\": \"\", \n" +
                "    \"resUrl\": \"/ads\", \n" +
                "    \"enable\": 1\n" +
                "}";
        String[] jsonArr = json.split("},");
        for (String s : jsonArr) {
            s = s.replaceAll("\\{", "");
            String[] arr = s.split(",");

            StringBuilder sb = new StringBuilder();
            for (String s1 : arr) {
                s1 = s1.trim();
                String[] arr2 = s1.split(":");
                if (arr2[0].contains("id")) {
                    sb.append(arr2[1]).append(" = ");
//                    System.out.printf("%s = %s\n", arr2[0], arr2[1]);
                    continue;

                } else if (arr2[0].contains("resUrl")) {
                    sb.append(arr2[1]);
//                    System.out.printf("%s = %s\n", arr2[0], arr2[1]);
                    continue;

                } else {
                    continue;
                }
            }
            System.out.println(sb);

        }

    }
}
