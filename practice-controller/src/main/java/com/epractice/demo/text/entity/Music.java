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
 * 音乐存储表
 * </p>
 *
 * @author gzw
 * @since 2021-07-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_music")
public class Music implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 音乐Id
     */
    @TableId(value = "music_id", type = IdType.AUTO)
    private Long musicId;

    /**
     * 音乐名称
     */
    private String musicName;

    /**
     * 歌手Id
     */
    private Long singerId;

    /**
     * 专辑Id
     */
    private Long albumId;

    /**
     * 封面链接
     */
    private String coverUrl;

    /**
     * 	需要vip（0表示false，1表示true）
     */
    private Integer toVip;

    /**
     * 	音频链接
     */
    private String musicUrl;

    /**
     * 音乐歌词
     */
    private String musicLyrics;

    /**
     * 音乐时长
     */
    private String musicTimeLength;

    /**
     * 创建时间
     */
    private Date createTime;


}
