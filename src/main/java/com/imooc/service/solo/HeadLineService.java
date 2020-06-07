package com.imooc.service.solo;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.dto.Result;

import java.util.List;

public interface HeadLineService {
    // 添加头条
    Result<Boolean> addHeadLine(HeadLine headLine);

    // 删除头条
    Result<Boolean> removeHeadLine(int headLineId);

    // 修改头条
    Result<Boolean> modifyHeadLine(HeadLine headLine);

    // 获取具体头条信息
    Result<HeadLine> queryHeadLineById(int headLineId);

    // 获取头条列表
    Result<List<HeadLine>> queryHeadLine(HeadLine headLineCondition, int pageIndex, int pageSize);
}
