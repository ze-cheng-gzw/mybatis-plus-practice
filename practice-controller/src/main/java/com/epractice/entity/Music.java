package com.epractice.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("tb_music")
public class Music implements Serializable {

    @TableId("music_id")
    private Long musicId;

    @TableField("music_name")
    private String musicName;

    private Long singerId;

    private Long albumId;

    private String coverUrl;

    private Integer toVip;

    private String musicUrl;

    private String musicLyrics;

    private String musicTimeLength;

    private Date createTime;

    @Override
    public String toString() {
        return "Music{" +
                "musicId=" + musicId +
                ", musicName='" + musicName + '\'' +
                ", singerId=" + singerId +
                ", albumId=" + albumId +
                ", coverUrl='" + coverUrl + '\'' +
                ", toVip=" + toVip +
                ", musicUrl='" + musicUrl + '\'' +
                ", musicLyrics='" + musicLyrics + '\'' +
                ", musicTimeLength='" + musicTimeLength + '\'' +
                ", createTime=" + createTime +
                '}';
    }

}