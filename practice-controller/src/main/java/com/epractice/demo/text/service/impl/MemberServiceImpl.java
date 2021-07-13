package com.epractice.demo.text.service.impl;

import com.epractice.demo.text.entity.Member;
import com.epractice.demo.text.mapper.MemberMapper;
import com.epractice.demo.text.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gzw
 * @since 2021-07-13
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
