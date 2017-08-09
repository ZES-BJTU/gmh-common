package com.zes.squad.gmh.common.exception;

public class ErrorMessage {

    public static String paramIsNull                                   = "参数为空";
    public static String pageNumIsError                                = "分页页码错误";
    public static String pageSizeIsError                               = "分页大小错误";

    public static String administratorBelongsToNoStore                 = "管理员不对应具体门店";

    public static String loginAgain                                    = "登录已过期, 请重新登录";
    public static String accountIsNull                                 = "用户名为空";
    public static String passwordIsNull                                = "密码为空";
    public static String originalPasswordIsNull                        = "原密码为空";
    public static String newPasswordIsNull                             = "新密码为空";
    public static String originalPasswordEqualsNewPassword             = "原密码和新密码相同";
    public static String passwordIsError                               = "密码错误";
    public static String originalPasswordIsError                       = "原密码错误";
    public static String emailIsNull                                   = "邮箱为空";
    public static String authCodeIsNull                                = "验证码为空";
    public static String storeIsNull                                   = "门店为空";
    public static String staffLevelIsNull                              = "用户级别为空";
    public static String staffLevelIsError                             = "用户级别错误";
    public static String staffNameIsNull                               = "用户姓名为空";
    public static String staffMobileIsNull                             = "用户手机号为空";
    public static String staffMobileIsError                            = "用户手机号格式错误";
    public static String staffIdIsNull                                 = "用户标识为空";
    public static String staffNotSelectedForDelete                     = "请选择要删除的用户";
    public static String staffNotFound                                 = "未找到用户";
    public static String staffAlreadyExist                             = "用户已存在";
    public static String staffIsNull                                   = "用户为空";

    public static String storeNotFound                                 = "未找到对应门店";

    public static String projectTopTypeIsNull                          = "美容项顶层分类为空";
    public static String projectTopTypeIsError                         = "美容项顶层分类错误";
    public static String projectTypeIdIsNull                           = "美容项分类标识为空";
    public static String projectTypeNameIsNull                         = "美容项分类名称为空";
    public static String projectTypeNotSelectedForDelete               = "请选择要删除的美容项分类";
    public static String projectIdIsNull                               = "美容项标识为空";
    public static String projectNotSelectedForDelete                   = "请选择要删除的美容项";
    public static String projectTypeNotFound                           = "未找到美容项对应分类";
    public static String projectNameIsNull                             = "美容项目名称为空";
    public static String projectRetailPriceIsNull                      = "美容项目原价为空";
    public static String projectNotFound                               = "未找到对应美容项目";
    public static String projectNotSelected                            = "请选择美容项目";

    public static String stockTypeNameIsNull                           = "库存分类名称为空";
    public static String stockTypeIdIsNull                             = "库存分类标识为空";
    public static String stockTypeNotSelectedForDelete                 = "请选择要删除的库存分类";
    public static String stockTypeNotFound                             = "未找到对应库存分类";
    public static String stockNameIsNull                               = "库存名称为空";
    public static String stockUnitIsNull                               = "库存单位为空";
    public static String stockAmountIsError                            = "库存数量错误";
    public static String stockIdIsError                                = "库存标识为空";
    public static String stockNotSelectedForDelete                     = "请选择要删除的库存";

    public static String memberLevelNameIsNull                         = "会员等级名称为空";
    public static String memberLevelIdIsNull                           = "会员等级标识为空";
    public static String memberLevelNotSelectedForDelete               = "请选择要删除的会员等级";
    public static String memberLevelNotFound                           = "未找到对应会员等级";
    public static String memberIdIsNull                                = "会员标识为空";
    public static String memberMobileIsNull                            = "会员手机号为空";
    public static String memberNameIsNull                              = "会员姓名为空";
    public static String memberMobileIsError                           = "会员手机号格式错误";
    public static String memberSexIsNull                               = "会员性别为空";
    public static String memberAgeIsNull                               = "会员年龄为空";
    public static String memberSexIsError                              = "会员性别错误";
    public static String memberBirthdayIsNull                          = "会员生日为空";
    public static String memberCardOpenDateIsNull                      = "会员开卡日期为空";
    public static String memberCardValidDateIsNull                     = "会员卡有效期为空";
    public static String memberCardOpenDateAfterValidDate              = "会员卡有效期应该在开卡期后";
    public static String memberNailMoneyIsError                        = "会员美甲美睫储值错误";
    public static String memberBeautyMoneyIsError                      = "会员美容储值错误";
    public static String memberExistInStore                            = "该用户已是门店会员";
    public static String memberNotFound                                = "未找到该会员";
    public static String memberNotNullForDeleteLevel                   = "该会员等级已关联会员, 无法删除";

    public static String employeeJobTypeIsNull                         = "员工工种为空";
    public static String employeeJobTypeIsError                        = "员工工种错误";
    public static String employeeIdIsNull                              = "员工标识为空";
    public static String employeeNotSelected                           = "请选择员工";
    public static String employeeNotFound                              = "未找到对应操作员";
    public static String employeeJobNotFound                           = "未找到操作员对应工种";
    public static String counselorNotFound                             = "未找到咨询师或经理";

    public static String appointmentBeginingTimeIsNull                 = "预约开始时间为空";
    public static String appointmentBeginingTimeIsError                = "预约开始时间错误";
    public static String appointmentEndingTimeIsNull                   = "预约结束时间为空";
    public static String appointmentEndingTimeShouldAfterBeginningTime = "预约结束时间应晚于开始时间";
    public static String appointmentLineIsNull                         = "预约是否点排为空";
    public static String appointmentIdIsNull                           = "预约标识为空";
    public static String memberTimeIsConflict                          = "会员时间冲突";
    public static String appointmentProjectIdIsNull                    = "预约项目为空";
    public static String appointmentEmployeeIdIsNull                   = "预约操作员为空";
    public static String appointmentIsNull                             = "未找到预约记录";
    public static String appointmentNotSelected                        = "请选择预约信息";
    public static String appointmentNotFound                           = "未找到对应预约信息";
    public static String nailMoneyNotEnough                            = "美甲美睫储值不足";
    public static String beautyMoneyNotEnough                          = "美容储值不足";
    public static String appointmentEmployeeTimeIsConflicted           = "操作员时间冲突";
    public static String appointmentMemberTimeIsConflicted             = "会员时间冲突";

    public static String consumeRecordChargeIsNull                     = "消费金额为空";
    public static String consumeRecordChargeIsError                    = "消费金额错误";
    public static String consumeRecordChargeWayIsNull                  = "消费金额支付方式为空";
    public static String consumeRecordChargeWayIsError                 = "消费金额支付方式错误";
    public static String consumeRecordDiscountIsError                  = "消费金额折扣错误";
    public static String consumeRecordIsEmpty                          = "消费记录为空";
    public static String consumeRecordMobileIsNull                     = "手机号为空";
    public static String consumeRecordMobileIsError                    = "手机号格式错误";
    public static String consumerNameIsError                           = "消费者姓名为空";
    public static String consumerShouldChooseCash                      = "非会员不能使用会员卡支付";
    public static String consumerSexIsNull                             = "消费者性别为空";
    public static String consumerSexIsError                            = "消费者性别错误";
    public static String consumeRecordStartTimeIsError                 = "消费记录开始时间错误";
    public static String consumeRecordStartTimeIsAfterEndTime          = "消费记录结束时间应在开始时间之后";
    public static String consumeRecordEndTimeIsError                   = "消费记录结束时间错误";
    public static String exportOccursFail                              = "导出失败";

}
