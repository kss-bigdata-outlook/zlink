package com.zlink.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * flink 配置信息
 * </p>
 *
 * @author zs
 * @since 2022-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("job_flink_conf")
public class JobFlinkConf extends BaseEntity {

    /**
     * 自增主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * flink 集群名字
     */
    @TableField("name")
    private String name;

    /**
     * flink 集群模式
     */
    @TableField("model")
    private String model;

    /**
     * ip
     */
    @TableField("ip")
    private String ip;

    /**
     * 端口
     */
    @TableField("port")
    private String port;

    /**
     * System 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * System 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

}
