package com.weiyh.augur.controller;/**
 * <Description> <br>
 *
 * @author weiyh<br>
 * @taskId: <br>
 * @version 1.0<br>
 * @createDate 2019/10/30 14:43 <br>
 * @see com.weiyh.augur.controller <br>
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyh
 * @description 寻找hi
 * @date 2019/10/30
 */
@RestController
public class FindHiController {

    @RequestMapping(value = "/getTodayBest", method = RequestMethod.GET)
    public String getTodayBest(String keyWorld) {
        String best = "人们该如何去理解自己的不自由";
        return best;
    }


}
