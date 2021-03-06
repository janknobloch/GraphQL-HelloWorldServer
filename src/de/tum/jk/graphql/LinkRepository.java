package de.tum.jk.graphql;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkRepository {

	private final List<Link> links;

	public LinkRepository() {
		links = new ArrayList<>();
		//connection to mongodb 
		//mongo.find(item)..
		// add some links to start off with
		links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
		links.add(new Link("http://graphql.org/learn/", "The official docks"));
	}

	public List<Link> getAllLinks() {
		return links;
	}

	public Link getLinkById(int id) {
		return links.get(id);
		
	}

	public void saveLink(Link link) {
		links.add(link);
	}

	public void removeLink(int id) {
		links.remove(links.get(id));
		
	}
}