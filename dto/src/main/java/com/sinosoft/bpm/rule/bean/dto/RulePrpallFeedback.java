package com.sinosoft.bpm.rule.bean.dto;

import java.io.Serializable;


/**
 * 承保反馈
 * @author chao
 *
 */
public class RulePrpallFeedback implements Serializable{
	

	public RulePrpallFeedback() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String serializationConfig;

	public String getSerializationConfig() {
		return serializationConfig;
	}

	public void setSerializationConfig(String serializationConfig) {
		this.serializationConfig = serializationConfig;
	}
	

}
