package upgrad.controller;

import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import upgrad.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String getAllPosts(Model model) {

        ArrayList <Post> Posts = new ArrayList<>();

        Post post1 = new Post();
        Post post2 = new Post();
        Post post3 = new Post();

        post1.setTitle("Post 1");
        post1.setBody("Post 1 Body");
        post1.setDate(new Date());

        post2.setTitle("Post 2");
        post2.setBody("Post 2 Body");
        post2.setDate(new Date());

        post3.setTitle("Post 3");
        post3.setBody("Post 3 Body");
        post3.setDate(new Date());

        Posts.add(post1);
        Posts.add(post2);
        Posts.add(post3);

        model.addAttribute("Posts",Posts);

        return "Index";

    }
}
