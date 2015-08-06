package com.gdjr.dataInquery;


import com.gdjr.dataInquery.domain.User;
import com.gdjr.dataInquery.page.Page;
import com.gdjr.dataInquery.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

import java.util.List;


/**
 *
 */
@Controller
@Scope("prototype")





public class UserAction extends ActionSupport {




    Logger log = Logger.getLogger(UserAction.class);
	@Autowired
	private UserService userService;
	private User user;
	private List<User> userList;
    private Page p = new Page();
	public String execute() throws Exception {
		return null;
	}

	public String login() {
		if (user != null) {
			User user2 = userService.login(user);
			if (user2 != null) {
                log.info("login success !");
				return SUCCESS;
			}
		}
        log.info("login failed !");
		this.addFieldError("user.username", "用户名或密码错误!");
		return INPUT;
	}

	public String addUI() {
		return "addUser";
	}

	public String updateUI() {
		user = userService.findUserById(user.getId());
		return "updateUser";
	}

	public String add() {
		userService.addUser(user);
		return SUCCESS;
	}

	public String delete() {
		userService.deleteUser(user.getId());
		return SUCCESS;
	}

	public String update() {
		userService.updateUser(user);
		return SUCCESS;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String queryAllUser() {
		//userList = userService.findAllUser();


        int lines=userService.lines();
        p.setLines(lines);
        p.setPageSize(2);
        System.out.println("页码："+p.getPage());
        userList = userService.users(p);


		return "userList";
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

    public Page getP() {
		return p;
    }
	public void setP(Page p) {
    		this.p = p;
	}
}