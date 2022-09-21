package m2i.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GameMenuController {

	@GetMapping("game/game-menu")
	public ModelAndView getGameMenu()
	{
		ModelAndView mv = new ModelAndView("game/game-menu");
		
		return mv;
	}
}
