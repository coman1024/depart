package com.sio.depart.api.acct.web.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "帳號Api")
@RestController
@RequestMapping("/acct")
public class AcctApi {

    @ApiOperation(value = "新增帳號", notes = "新增帳號")
    @PostMapping("/")
    public void acctCreat() {

    }

    @ApiOperation(value = "查詢帳號", notes = "查詢全部帳號")
    @GetMapping("/")
    public void acctFind() {

    }

    @ApiOperation(value = "查詢帳號", notes = "查詢:id帳號")
    @GetMapping("/{id}")
    public void acctFindById(@PathVariable String id) {

    }

    @ApiOperation(value = "修改帳號", notes = "修改:id帳號")
    @PutMapping("/{id}")
    public void acctEdit(@PathVariable String id) {

    }

    @ApiOperation(value = "刪除帳號", notes = "刪除:id帳號")
    @DeleteMapping("/{id}")
    public void acctDelete(@PathVariable String id) {

    }
}
