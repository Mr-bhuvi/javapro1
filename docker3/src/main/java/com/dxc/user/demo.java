package com.dxc.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
@RequestMapping(path="hello")
public String v()
{
	return "hello , users there is maintance work going on please wait for some time";
	}
}
