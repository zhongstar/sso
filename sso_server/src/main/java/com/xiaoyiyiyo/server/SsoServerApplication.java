package com.xiaoyiyiyo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class SsoServerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SsoServerApplication.class);
    }
}
