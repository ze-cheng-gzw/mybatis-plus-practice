package com.epractice.demo;

import com.epractice.entity.Music;
import com.epractice.mapper.MusicMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private MusicMapper musicMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        Music music = musicMapper.selectById(1);
        System.out.println(music.toString());
//        List<Music> musicList = musicMapper.selectList(null);
//        for (int i = 0; i < 10; i++) {
//            System.out.println(musicList.get(i).toString());
//        }
    }

}
