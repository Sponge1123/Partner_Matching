package com.buka.partnermatchingbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.buka.partnermatchingbackend.model.domain.Tag;
import com.buka.partnermatchingbackend.service.TagService;
import com.buka.partnermatchingbackend.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author SPONGE
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2024-04-17 13:58:35
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




