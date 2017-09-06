package com.jeff.swagger.api;

import java.util.List;

import com.jeff.swagger.api.entity.UserInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeff_xu on 2017/9/5.
 *
 * @author Jeff_xu
 * @date 2017/09/05
 */
@RestController
@RequestMapping("/api")
@Api(value = "Api Module")
public class ApiDemo {

    @ApiOperation(value = "获取用户信息", response = UserInfo.class)
    @RequestMapping(value = "/getUserInfo/{userId}", method = RequestMethod.GET)
    public UserInfo getUserInfo(@PathVariable(value = "userId") int userId) {
        return null;
    }

    @ResponseStatus(HttpStatus.FORBIDDEN)
    public class ForbiddenException extends RuntimeException {}

    @ApiOperation(value = "批量获取用户信息", response = UserInfo.class, responseContainer = "List")
    @ApiResponses({
        @ApiResponse(code = 403, message = "forbidden", response = UserInfo.class)
    })
    @RequestMapping(value = "/getUserInfos", method = RequestMethod.GET)
    public List<UserInfo> getUserInfos() {
        throw new ForbiddenException();
        //return null;
    }

    @ApiOperation(value = "更新用户信息")
    @RequestMapping(value = "/updateUserInfo", method = RequestMethod.POST)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "userId", paramType = "form", value = "用户Id", required = true, dataType = "Int"),
        @ApiImplicitParam(name = "userName", paramType = "form", value = "用户名", required = true, dataType = "String"),
        @ApiImplicitParam(name = "phoneNumber", paramType = "form", value = "手机号", required = true, dataType = "String")
    })
    public void updateUserInfo(UserInfo userInfo) {
        return;
    }
}
