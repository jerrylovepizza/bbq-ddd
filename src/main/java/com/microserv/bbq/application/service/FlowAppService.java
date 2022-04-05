package com.microserv.bbq.application.service;

import com.microserv.bbq.infrastructure.share.page.PageQueryParam;
import com.microserv.bbq.infrastructure.general.extension.annotation.ddd.ApplicationService;
import com.microserv.bbq.infrastructure.share.page.PageResult;
import lombok.extern.slf4j.Slf4j;

/**
 * 流程配置- 应用层服务
 *
 * @author mingjie
 * @date 2022/3/27
 */
@Slf4j
@ApplicationService
public class FlowAppService {
    public PageResult getConfigListByPage(PageQueryParam queryParam) {
        log.info("返回分页查询结果");
        return PageResult.valueOf(queryParam);
    }
}
