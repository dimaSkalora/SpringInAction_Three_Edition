package part_2.head_08.com.habuma.spitter.mvc;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import part_2.head_08.com.habuma.spitter.service.SpitterService;

@Controller // Объявить как контроллер
public class HomeController {
  public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

  private SpitterService spitterService;

  @Inject // Внедрить SpitterService
  public HomeController(SpitterService spitterService) {
    this.spitterService = spitterService;
  }

  @RequestMapping({"/","/home"}) // Обрабатывать запросы на получение главной страницы
  public String showHomePage(Map<String, Object> model) {
    model.put("spittles", spitterService.getRecentSpittles(
            DEFAULT_SPITTLES_PER_PAGE)); //Добавить сообщения в модель
    return "home"; // Вернуть имя представления
  }
}
