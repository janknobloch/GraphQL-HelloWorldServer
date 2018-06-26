package de.tum.jk.graphql;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {

	private final List<User> users;

	public UserRepository() {
		users = new ArrayList<>();
		// add some links to start off with
		LinkedList<Link> links = new LinkedList<Link>();
		links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
		links.add(new Link("http://graphql.org/learn/", "The official docks"));
		users.add(new User("jan", links));

	}

	public List<User> getAllUsers() {
		return users;
	}

	public User getUserById(int id) {
		return users.get(id);

	}

	public void saveUser(User user) {
		users.add(user);
	}

	public void removeUser(int id) {
		users.remove(users.get(id));

	}
}