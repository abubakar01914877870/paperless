package com.paperless.app.objectDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paperless.app.object.Sender;

@Controller
public class SenderRepositoryDAO {

	@Autowired
	private SenderRepository senderRepository;
	
	
	@RequestMapping("/dosavesender")
	public void savesender() {
		Sender sender1=new Sender(1, "Abu", "abubakar@yopmail.com", "992");
		senderRepository.save(sender1);
	}
}
