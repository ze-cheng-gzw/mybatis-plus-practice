package com.epractice.demo.text.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gzw
 * @since 2021-07-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_member")
public class Member implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 用户Id
     */
    @TableId(value = "member_id", type = IdType.AUTO)
    private Long memberId;

    /**
     * 用户名称
     */
    private String memberName;

    /**
     * 用户手机号
     */
    private String memberMobile;

    /**
     * 用户头像地址
     */
    private String memberUrl;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码加盐
     */
    private String passwordSalt;

    /**
     * vip等级，0表示不是vip，1表示是vip
     */
    private Integer vipLevel;

    /**
     * 创建时间
     */
    private Date createTime;


}
