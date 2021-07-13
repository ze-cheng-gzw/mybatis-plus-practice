package com.epractice.demo;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.epractice.demo.text.VO.PlaylistMusicVO;
import com.epractice.demo.text.entity.Member;
import com.epractice.demo.text.entity.Music;
import com.epractice.demo.text.mapper.MemberMapper;
import com.epractice.demo.text.mapper.MusicMapper;
import com.epractice.demo.text.service.MusicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private MusicService musicService;

    @Test
    public void testSelect() {
        //根据主键id进行查询
//        Music music = musicMapper.selectById(1);
//        System.out.println(music.toString());

        //根据主键列表进行查询
//        List<Long> ids = new ArrayList<>();
//        ids.add(1L);
//        ids.add(2L);
//        ids.add(3L);
//        ids.add(4L);
//        List<Music> musicList = musicMapper.selectBatchIds(ids);
//        System.out.println(musicList.size());
//        for (Music music:musicList) {
//            System.out.println(music.toString());
//        }

        //根据表字段条件进行查询
//        Map<String, Object> map = new HashMap<>();
//        map.put("to_vip", 0);
//        map.put("music_time_length", "03:32");
//        List<Music> musicList = musicMapper.selectByMap(map);
//        System.out.println(musicList.size());
//        for (Music music:musicList) {
//            System.out.println(music.toString());
//        }

        //添加
//        Member member = new Member();
//        member.setMemberMobile("15946902054");
//        member.setMemberName("桂志伟");
//        member.setMemberUrl("头像链接");
//        member.setPassword("eeasdgasydgasdgasjdgaskjd");
//        member.setPasswordSalt("dsadasdasdqweasd");
//        member.setVipLevel(0);
//        int addCount = memberMapper.insert(member);
//        System.out.println("添加的数量：" + addCount);
//        System.out.println("添加时返回的id：" + member.getMemberId());

        //修改 --- 根据主键id进行修改
//        Member member = new Member();
//        member.setMemberId(14L);
//        member.setMemberMobile("15946902053");
//        member.setMemberName("桂志伟更改");
//        member.setMemberUrl("头像链接更改");
//        member.setPassword("eeasdgasydgasdgasjdgaskjd123");
//        member.setPasswordSalt("dsadasdasdqweasd456");
//        member.setVipLevel(1);
//        int uppCount = memberMapper.updateById(member);
//        System.out.println("修改的数量：" + uppCount);

        //修改 --- 根据 updateWrapper 条件修改实体对象
//        Member member = new Member();
//        member.setMemberMobile("15946902053");
//        member.setMemberName("桂志伟使用Wrapper更改");
//        member.setMemberUrl("头像链接使用Wrapper更改");
//        member.setPassword("eeasdgasydgasdgasjdgaskjd123123");
//        member.setPasswordSalt("dsadasdasdqweasd456456");
//
//        QueryWrapper<Member> queryWrapper = new QueryWrapper<Member>();
//        queryWrapper.eq("vip_level", 1).eq("member_id", 14);
//
//        int uppCount = memberMapper.update(member, queryWrapper);
//        System.out.println("修改的数量：" + uppCount);
    }

    @Test
    public void testPage() {
        // Step1：创建一个 Page 对象
        // Page<Music> page = new Page<>();
        Page<Music> page = new Page<>(1, 3);
        // Step2：调用 mybatis-plus 提供的分页查询方法
        musicService.page(page, null);
        // Step3：获取分页数据
        System.out.println(page.getCurrent()); // 获取当前页
        System.out.println(page.getTotal()); // 获取总记录数
        System.out.println(page.getSize()); // 获取每页的条数
        System.out.println(page.getRecords()); // 获取每页数据的集合
        System.out.println(page.getPages()); // 获取总页数
        System.out.println(page.hasNext()); // 是否存在下一页
        System.out.println(page.hasPrevious()); // 是否存在上一页
    }

    @Test
    public void testQueryWrapper() {
        // Step1：创建一个 QueryWrapper 对象
        QueryWrapper<Music> queryWrapper = new QueryWrapper<>();

        // Step2： 构造查询条件  select表示需要返回的字段
        queryWrapper.select("music_name", "music_url", "music_time_length").eq("music_time_length", "03:32");

        // Step3：执行查询
        Page<Music> page = new Page<>(1, 3);
        musicService.page(page, queryWrapper);
        System.out.println(page.getRecords()); // 获取每页数据的集合
        System.out.println(page.getCurrent()); // 获取当前页
        System.out.println(page.getTotal()); // 获取总记录数
        System.out.println(page.getSize()); // 获取每页的条数
        System.out.println(page.getPages()); // 获取总页数
        System.out.println(page.hasNext()); // 是否存在下一页
        System.out.println(page.hasPrevious()); // 是否存在上一页
    }


    /**
     * 多表查询
     */
//    @Test
//    public void testQueryWrapperInner() {
//        // Step1：创建一个 QueryWrapper 对象
//        QueryWrapper<PlaylistMusicVO> queryWrapper = new QueryWrapper<>();
//
//        // Step2： 构造查询条件  select表示需要返回的字段
//        queryWrapper.select("music_name", "music_url", "music_time_length").eq("music_time_length", "03:32");
//
//        // Step3：执行查询
//        Page<Music> page = new Page<>(1, 3);
//        musicService.page(page, queryWrapper);
//        System.out.println(page.getRecords()); // 获取每页数据的集合
//        System.out.println(page.getCurrent()); // 获取当前页
//        System.out.println(page.getTotal()); // 获取总记录数
//        System.out.println(page.getSize()); // 获取每页的条数
//        System.out.println(page.getPages()); // 获取总页数
//        System.out.println(page.hasNext()); // 是否存在下一页
//        System.out.println(page.hasPrevious()); // 是否存在上一页
//    }

}
