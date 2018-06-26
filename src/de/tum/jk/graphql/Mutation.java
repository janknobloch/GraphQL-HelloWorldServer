package de.tum.jk.graphql;
import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {

	private final LinkRepository linkRepository;
	private final UserRepository userRepository;

	public Mutation(LinkRepository linkRepository, UserRepository userRepository) {
		this.linkRepository = linkRepository;
		this.userRepository = userRepository;
	}

	public Link createLink(String url, String description) {
		Link newLink = new Link(url, description);
		linkRepository.saveLink(newLink);
		return newLink;
	}

	public void removeLink(int id) {
		linkRepository.removeLink(id);

	}

	public User addLinktoUser(String name, Link link)
	{
//		linkRepository.a
//		userRepository.saveUser(user);
		return null;
		
	}
}