package com.ley.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ley.entity.Account;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface AccountMapper extends BaseMapper<Account> {
    @Select("selectAccountList")
    IPage<Account> selectAccountList(Page page, @Param("name") String name);
}
