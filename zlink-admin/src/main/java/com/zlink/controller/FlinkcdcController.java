package com.zlink.controller;

import com.zlink.common.utils.JacksonObject;
import com.zlink.model.ApiResponse;
import com.zlink.service.FlinkcdcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author zs
 * @date 2022/12/9
 */
@RestController
@RequestMapping("/cdc")
@RequiredArgsConstructor
@CrossOrigin
public class FlinkcdcController {
    private final FlinkcdcService flinkcdcService;

    /**
     * 本地模式 flink cdc
     */
    @RequestMapping(value = "/localFlinkCDC", method = RequestMethod.POST)
    public ApiResponse localFlinkCDC(@RequestBody JacksonObject json) {
        return ApiResponse.ofSuccess(flinkcdcService.localFlinkCDC(json));
    }

    /**
     * 获取 flink 状态
     */
    @RequestMapping(value = "/getLocalFlinkInfo", method = RequestMethod.GET)
    public ApiResponse getFlinkInfo() {
        return ApiResponse.ofSuccess(flinkcdcService.getLocalFlinkInfo());
    }

}
