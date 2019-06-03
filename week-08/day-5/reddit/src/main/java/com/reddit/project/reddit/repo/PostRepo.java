package com.reddit.project.reddit.repo;

import com.reddit.project.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
}
