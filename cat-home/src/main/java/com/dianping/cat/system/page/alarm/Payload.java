package com.dianping.cat.system.page.alarm;

import com.dianping.cat.system.SystemPage;
import com.site.web.mvc.ActionContext;
import com.site.web.mvc.ActionPayload;
import com.site.web.mvc.payload.annotation.FieldMeta;

public class Payload implements ActionPayload<SystemPage, Action> {
	@FieldMeta("op")
	private Action m_action;

	@FieldMeta("alarmRecordId")
	private int m_alarmRecordId;

	@FieldMeta("alarmRuleId")
	private int m_alarmRuleId;

	@FieldMeta("scheduledReportId")
	private int m_scheduledReportId;
	
	@FieldMeta("alarmTemplateId")
	private int m_alarmTemplateId;
	
	@FieldMeta("content")
	private String m_content;
	
	@FieldMeta("domain")
	private String m_domain;
	
	private SystemPage m_page;

	@FieldMeta("templateName")
	private String m_templateName;
	
	@FieldMeta("type")
	private String m_type;

	@FieldMeta("subState")
	private int m_userSubState;
	
	@Override
	public Action getAction() {
		return m_action;
	}

	public int getAlarmRecordId() {
		return m_alarmRecordId;
	}

	public int getAlarmRuleId() {
		return m_alarmRuleId;
	}

	public int getAlarmTemplateId() {
		return m_alarmTemplateId;
	}
	
	public String getContent() {
		return m_content;
	}

	public String getDomain() {
		return m_domain;
	}

	@Override
	public SystemPage getPage() {
		return m_page;
	}
	
	public String getReportType() {
		return "";
	}

	public String getTemplateName() {
		return m_templateName;
	}

	public String getType() {
		return m_type;
	}

	public int getUserSubState() {
		return m_userSubState;
	}

	public void setAction(String action) {
		m_action = Action.getByName(action, Action.ALARM_RECORD_LIST);
	}

	public void setAlarmRecordId(int alarmRecordId) {
		m_alarmRecordId = alarmRecordId;
	}

	public void setAlarmRuleId(int alarmRuleId) {
		m_alarmRuleId = alarmRuleId;
	}

	public void setAlarmTemplateId(int alarmTemplateId) {
		m_alarmTemplateId = alarmTemplateId;
	}

	public void setContent(String content) {
		m_content = content;
	}
	
	public void setDomain(String domain) {
		m_domain = domain;
	}

	@Override
	public void setPage(String page) {
		m_page = SystemPage.getByName(page, SystemPage.ALARM);
	}

	public void setTemplateName(String templateName) {
		m_templateName = templateName;
	}

	public void setType(String type) {
		m_type = type;
	}

	public void setUserSubState(int userSubState) {
		m_userSubState = userSubState;
	}
	
	public int getScheduledReportId() {
		return m_scheduledReportId;
	}

	public void setScheduledReportId(int scheduledReportId) {
		m_scheduledReportId = scheduledReportId;
	}

	@Override
	public void validate(ActionContext<?> ctx) {
		if (m_action == null) {
			m_action = Action.ALARM_RECORD_LIST;
		}
	}
}
