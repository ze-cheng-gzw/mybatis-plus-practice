package com.epractice.demo.text.VO;

import lombok.Data;

import java.io.Serializable;

@Data
public class PlaylistMusicVO implements Serializable {

    private String id;

    private String musicName;

    private String singerName;

    private String musicTimeLength;

}
