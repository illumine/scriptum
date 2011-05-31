package gr.scriptum.domain;

// Generated May 31, 2011 10:47:04 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * DiavgeiaSubjectGroup generated by hbm2java
 */
public class DiavgeiaSubjectGroup implements java.io.Serializable {

	private Integer id;
	private String uid;
	private String description;
	private Date createDt;

	public DiavgeiaSubjectGroup() {
	}

	public DiavgeiaSubjectGroup(String uid, String description, Date createDt) {
		this.uid = uid;
		this.description = description;
		this.createDt = createDt;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

}
