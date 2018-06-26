package de.tum.jk.graphql;
import java.util.LinkedList;
import java.util.List;

public class User {
	String name;
	List<Link> links;

	public User(String name, LinkedList<Link> links) {
		super();
		this.name = name;
		this.links = links;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
