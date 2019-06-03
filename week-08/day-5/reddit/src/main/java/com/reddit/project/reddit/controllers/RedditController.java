package com.reddit.project.reddit.controllers;

import com.reddit.project.reddit.models.Post;
import com.reddit.project.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

    private PostRepo postRepo;

    @Autowired
    RedditController(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    @GetMapping("/")
    public String postList (Model model){
        model.addAttribute("listPost", postRepo.findAll());
        return "post";
    }

    @GetMapping("/submit")
    public String addPost(Model model){
        model.addAttribute("addPost", new Post());
        return "post";
    }

    @PostMapping("/submit")
    public String addPost(@ModelAttribute Post post){

        postRepo.save(post);
        return "redirect:/";
    }

}
