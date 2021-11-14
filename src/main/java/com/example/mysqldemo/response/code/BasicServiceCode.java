package com.example.mysqldemo.response.code;

import java.util.stream.Stream;

/**
 * 基础服务Code
 *
 * @author Sunny.Zeng
 * @date 2020-09-11
 */
public enum BasicServiceCode implements ServiceCode {

    // Basic
    SUCCESS(0, "请求成功"),
    FAILED(1, "请求失败"),

    // 9000
    SYSTEM_ERROR(15129000, "系统异常"),

    // 91xx 领取异常
    CLUE_UNCLAIMED_NOT_EXISTS(15129100, "[15129100]领取异常，请重试~"),
    CLUE_NOT_EXISTS(15129101, "[15129101]领取异常，请重试~"),

    // 94xx
    UNAUTHORIZED(15129401, "未授权，请登录"),
    BAD_REQUEST(15129402, "请求参数错误"),
    PAGE_INDEX_ERROR(15129402, "页码必须大于0"),
    REJECT(15129403, "请求异常，拒绝访问"),
    FORBIDDEN(15129403, "拒绝访问"),
    NOT_FOUND(15129404, "资源不存在"),
    METHOD_NOT_ALLOWED(15129405, "请求错误"),
    TIME_OUT(15129408, "响应超时"),

    // 95xx
    SERVER_ERROR(15129500, "服务器内部错误，请稍后重试"),
    SERVICE_UNAVAILABLE(15129503, "服务不可用，请稍后重试"),

    // 96xx
    REDIS_ERROR(15129600, "Redis服务异常"),
    RABBITMQ_ERROR(15129601, "RabbitMQ服务异常"),
    KAFKA_ERROR(15129602, "Kafka服务异常"),
    ROCKETMQ_ERROR(15129603, "RocketMQ服务异常"),

    // 97 任务
    CLUE_AUTOMATIC_RECYCLING_LOCK_ERROR(15129700, "回收任务正在执行中，请勿重复请求。"),
    CLUE_RETENTION_AUTOMATIC_RECYCLING_LOCK_ERROR(15129701, "线索滞留回收任务正在执行中，请勿重复请求。"),
    CLUE_DEAL_TRANSFER_EDS_LOCK_ERROR(15129702, "成交客户线索流转学管任务正在执行中，请勿重复请求。"),
    SEND_MESSAGE_TASK_LOCK_ERROR(15129703, "根据标签发送短信任务正在执行中，请勿重复请求。"),
    SEND_MESSAGE_TASK_RETRY_LOCK_ERROR(15129704, "失败短信重试任务正在执行中，请勿重复请求。"),
    ERP_CLUE_AUTOMATIC_RECYCLING_LOCK_ERROR(15129705, "ERP回收任务正在执行中，请勿重复请求。"),

    ;


    BasicServiceCode(int status, String info) {
        this.status = status;
        this.info = info;
    }

    private int status;
    private String info;

    public static BasicServiceCode parse(int status) {
        return Stream.of(values())
            .filter(baseCode -> baseCode.getStatus() == status)
            .findFirst()
            .orElse(SERVER_ERROR);
    }

    public static BasicServiceCode findInfo(String info) {
        return Stream.of(values())
            .filter(baseCode -> baseCode.getInfo().equals(info))
            .findFirst()
            .orElse(SERVER_ERROR);
    }

    @Override
    public int getStatus() {
        return status;
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}

