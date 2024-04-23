package com.buka.partnermatchingbackend.mapper;

import com.buka.partnermatchingbackend.model.domain.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author SPONGE
* @description 针对表【tag(标签)】的数据库操作Mapper
* @createDate 2024-04-17 13:58:35
* @Entity com.buka.partnermatchingbackend.model.domain.Tag
*/
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}




