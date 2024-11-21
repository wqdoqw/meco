package com.meco.main.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.meco.main.vo.UserVo;

@Mapper
public interface UserMapper {
	List<UserVo> getUserList();
}
