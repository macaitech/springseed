package com.macaitech.springseed.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author yuhui.tang  
 * 2018年5月8日 下午4:10:33
 *
 */
@Configuration
@Data
public class SpringSeedConfig {

    /**
     * 网站的根路径 例如 /springseed
     */
    private String webRoot;

    /**
     * 网站绝对物理路径 例如 D:/Tomcat/webapps/powerteam/WEB-INF/classes/
     */
    private String absoluteWebRoot;

    @Value("${springSeed.title}")
    private String title;

    @Value("${springSeed.pageSize}")
    private Integer pageSize;

    @Value("${springSeed.baiduMapAk}")
    private String baiduMapAk;

    @Value("${spring.mail.username}")
    private String mailFrom;

	public String getWebRoot() {
		return webRoot;
	}

	public void setWebRoot(String webRoot) {
		this.webRoot = webRoot;
	}

	public String getAbsoluteWebRoot() {
		return absoluteWebRoot;
	}

	public void setAbsoluteWebRoot(String absoluteWebRoot) {
		this.absoluteWebRoot = absoluteWebRoot;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getBaiduMapAk() {
		return baiduMapAk;
	}

	public void setBaiduMapAk(String baiduMapAk) {
		this.baiduMapAk = baiduMapAk;
	}

	public String getMailFrom() {
		return mailFrom;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}
    
    
}
