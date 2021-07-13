package com.epractice.demo.text.service.impl;

import com.epractice.demo.text.entity.Music;
import com.epractice.demo.text.mapper.MusicMapper;
import com.epractice.demo.text.service.MusicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 音乐存储表 服务实现类
 * </p>
 *
 * @author gzw
 * @since 2021-07-13
 */
@Service
public class MusicServiceImpl extends ServiceImpl<MusicMapper, Music> implements MusicService {

}
