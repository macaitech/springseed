/**
 * 
 */
package com.macaitech.springseed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.macaitech.springseed.config.SpringSeedConfig;

/**
 * 
 * @author yuhui.tang  
 * 2018年5月8日 下午3:58:06
 *
 */
@SpringBootApplication
public class SpringSeedApplication implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private SpringSeedConfig springSeedConfig;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringSeedApplication.class, args);
	}
	
	//@Override
	public void onApplicationEvent(final ContextRefreshedEvent event) {
		springSeedConfig.setWebRoot(event.getApplicationContext().getApplicationName() + "/");
		springSeedConfig.setAbsoluteWebRoot(this.getClass().getResource("/").getPath().replaceFirst("/", ""));
		
	}
	
}
