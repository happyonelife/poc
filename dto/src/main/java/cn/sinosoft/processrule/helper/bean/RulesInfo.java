package cn.sinosoft.processrule.helper.bean;

public class RulesInfo {
	private String ruleModule = "process";//模块 流程process，业务buiness，派工dispatcher，同步sync
	private String ruleContainerVersion = "";//规则容器版本
	private String ruleProcessName = "main";//主流程
	private String sessionName = "main";//会话名字
	private String isSubmitRemoteRuleEX = "N";
	public String getRuleModule() {
		return ruleModule;
	}
	public void setRuleModule(String ruleModule) {
		this.ruleModule = ruleModule;
	}
	public String getRuleContainerVersion() {
		return ruleContainerVersion;
	}
	public void setRuleContainerVersion(String ruleContainerVersion) {
		this.ruleContainerVersion = ruleContainerVersion;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public String getRuleProcessName() {
		return ruleProcessName;
	}
	public void setRuleProcessName(String ruleProcessName) {
		this.ruleProcessName = ruleProcessName;
	}
	public String getIsSubmitRemoteRuleEX() {
		return isSubmitRemoteRuleEX;
	}
	public void setIsSubmitRemoteRuleEX(String isSubmitRemoteRuleEX) {
		this.isSubmitRemoteRuleEX = isSubmitRemoteRuleEX;
	}
	
	
}
