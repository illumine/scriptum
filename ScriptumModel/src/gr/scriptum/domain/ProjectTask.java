package gr.scriptum.domain;

// Generated Oct 16, 2011 11:00:47 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ProjectTask generated by hbm2java
 */
public class ProjectTask implements java.io.Serializable {

	private Integer id;
	private Project project;
	private Users usersByUserDispatcherId;
	private TaskResult taskResult;
	private ProjectTask projectTask;
	private Users usersByUserCreatorId;
	private Contact contact;
	private TaskType taskType;
	private TaskState taskState;
	private TaskPriority taskPriority;
	private String name;
	private String description;
	private Integer taskNo;
	private Date startDt;
	private Date expectedDt;
	private Date closedDt;
	private String comments;
	private Integer timesRevised;
	private Integer timesContactExternal;
	private Integer reviewerScore;
	private Date createDt;
	private Date updateTs;
	private Boolean dispatcherCloseable;
	private Date endDt;
	private Set<ProjectTask> projectTasks = new HashSet<ProjectTask>(0);
	private Set<TaskDocument> taskDocuments = new HashSet<TaskDocument>(0);
	private Set<TaskMessage> taskMessages = new HashSet<TaskMessage>(0);

	public ProjectTask() {
	}

	public ProjectTask(Users usersByUserDispatcherId, TaskResult taskResult,
			Users usersByUserCreatorId, TaskType taskType, TaskState taskState,
			TaskPriority taskPriority) {
		this.usersByUserDispatcherId = usersByUserDispatcherId;
		this.taskResult = taskResult;
		this.usersByUserCreatorId = usersByUserCreatorId;
		this.taskType = taskType;
		this.taskState = taskState;
		this.taskPriority = taskPriority;
	}

	public ProjectTask(Project project, Users usersByUserDispatcherId,
			TaskResult taskResult, ProjectTask projectTask,
			Users usersByUserCreatorId, Contact contact, TaskType taskType,
			TaskState taskState, TaskPriority taskPriority, String name,
			String description, Integer taskNo, Date startDt, Date expectedDt,
			Date closedDt, String comments, Integer timesRevised,
			Integer timesContactExternal, Integer reviewerScore, Date createDt,
			Date updateTs, Boolean dispatcherCloseable, Date endDt,
			Set<ProjectTask> projectTasks, Set<TaskDocument> taskDocuments,
			Set<TaskMessage> taskMessages) {
		this.project = project;
		this.usersByUserDispatcherId = usersByUserDispatcherId;
		this.taskResult = taskResult;
		this.projectTask = projectTask;
		this.usersByUserCreatorId = usersByUserCreatorId;
		this.contact = contact;
		this.taskType = taskType;
		this.taskState = taskState;
		this.taskPriority = taskPriority;
		this.name = name;
		this.description = description;
		this.taskNo = taskNo;
		this.startDt = startDt;
		this.expectedDt = expectedDt;
		this.closedDt = closedDt;
		this.comments = comments;
		this.timesRevised = timesRevised;
		this.timesContactExternal = timesContactExternal;
		this.reviewerScore = reviewerScore;
		this.createDt = createDt;
		this.updateTs = updateTs;
		this.dispatcherCloseable = dispatcherCloseable;
		this.endDt=endDt;
		this.projectTasks = projectTasks;
		this.taskDocuments = taskDocuments;
		this.taskMessages = taskMessages;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Users getUsersByUserDispatcherId() {
		return this.usersByUserDispatcherId;
	}

	public void setUsersByUserDispatcherId(Users usersByUserDispatcherId) {
		this.usersByUserDispatcherId = usersByUserDispatcherId;
	}

	public TaskResult getTaskResult() {
		return this.taskResult;
	}

	public void setTaskResult(TaskResult taskResult) {
		this.taskResult = taskResult;
	}

	public ProjectTask getProjectTask() {
		return this.projectTask;
	}

	public void setProjectTask(ProjectTask projectTask) {
		this.projectTask = projectTask;
	}

	public Users getUsersByUserCreatorId() {
		return this.usersByUserCreatorId;
	}

	public void setUsersByUserCreatorId(Users usersByUserCreatorId) {
		this.usersByUserCreatorId = usersByUserCreatorId;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public TaskType getTaskType() {
		return this.taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public TaskState getTaskState() {
		return this.taskState;
	}

	public void setTaskState(TaskState taskState) {
		this.taskState = taskState;
	}

	public TaskPriority getTaskPriority() {
		return this.taskPriority;
	}

	public void setTaskPriority(TaskPriority taskPriority) {
		this.taskPriority = taskPriority;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTaskNo() {
		return this.taskNo;
	}

	public void setTaskNo(Integer taskNo) {
		this.taskNo = taskNo;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public Date getExpectedDt() {
		return this.expectedDt;
	}

	public void setExpectedDt(Date expectedDt) {
		this.expectedDt = expectedDt;
	}

	public Date getClosedDt() {
		return this.closedDt;
	}

	public void setClosedDt(Date closedDt) {
		this.closedDt = closedDt;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getTimesRevised() {
		return this.timesRevised;
	}

	public void setTimesRevised(Integer timesRevised) {
		this.timesRevised = timesRevised;
	}

	public Integer getTimesContactExternal() {
		return this.timesContactExternal;
	}

	public void setTimesContactExternal(Integer timesContactExternal) {
		this.timesContactExternal = timesContactExternal;
	}

	public Integer getReviewerScore() {
		return this.reviewerScore;
	}

	public void setReviewerScore(Integer reviewerScore) {
		this.reviewerScore = reviewerScore;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public Boolean getDispatcherCloseable() {
		return this.dispatcherCloseable;
	}

	public void setDispatcherCloseable(Boolean dispatcherCloseable) {
		this.dispatcherCloseable = dispatcherCloseable;
	}

	public Set<ProjectTask> getProjectTasks() {
		return this.projectTasks;
	}

	public void setProjectTasks(Set<ProjectTask> projectTasks) {
		this.projectTasks = projectTasks;
	}

	public Set<TaskDocument> getTaskDocuments() {
		return this.taskDocuments;
	}

	public void setTaskDocuments(Set<TaskDocument> taskDocuments) {
		this.taskDocuments = taskDocuments;
	}

	public Set<TaskMessage> getTaskMessages() {
		return this.taskMessages;
	}

	public void setTaskMessages(Set<TaskMessage> taskMessages) {
		this.taskMessages = taskMessages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectTask other = (ProjectTask) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Date getEndDt() {
		return endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

}
