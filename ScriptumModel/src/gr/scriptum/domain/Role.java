package gr.scriptum.domain;

// Generated Jan 19, 2011 4:36:37 PM by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role implements java.io.Serializable {

	private Integer id;
	private String name;
	private String description;
	private Integer isProtocol;
	private Set<Users> userses = new HashSet<Users>(0);
	private Set<Resource> resources = new HashSet<Resource>(0);

	public Role() {
	}

	public Role(String name, String description, Integer isProtocol,
			Set<Users> userses, Set<Resource> resources) {
		this.name = name;
		this.description = description;
		this.isProtocol = isProtocol;
		this.userses = userses;
		this.resources = resources;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getIsProtocol() {
		return isProtocol;
	}

	public void setIsProtocol(Integer isProtocol) {
		this.isProtocol = isProtocol;
	}

	public Set<Users> getUserses() {
		return this.userses;
	}

	public void setUserses(Set<Users> userses) {
		this.userses = userses;
	}

	public Set<Resource> getResources() {
		return this.resources;
	}

	public void setResources(Set<Resource> resources) {
		this.resources = resources;
	}

}