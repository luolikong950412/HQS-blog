package com.hello.huqingshan.mapper;

import com.hello.huqingshan.model.Tag;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagMapper {

    List<Tag> selectTags();
}
