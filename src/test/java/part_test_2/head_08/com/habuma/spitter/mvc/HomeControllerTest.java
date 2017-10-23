package part_test_2.head_08.com.habuma.spitter.mvc;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static part_2.head_08.com.habuma.spitter.mvc.HomeController.DEFAULT_SPITTLES_PER_PAGE;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import part_2.head_08.com.habuma.spitter.mvc.HomeController;
import part_2.head_08.com.habuma.spitter.service.SpitterService;
import part_2.spitter_domain_jpa.com.habuma.spitter.domain.Spittle;

public class HomeControllerTest {
  @Test
  public void shouldDisplayRecentSpittles() {
    List<Spittle> expectedSpittles =
      asList(new Spittle(), new Spittle(), new Spittle());

    SpitterService spitterService = mock(SpitterService.class);//<co id="co_mockSpitterService"/>

    when(spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE)).
        thenReturn(expectedSpittles);

    HomeController controller =
                   new HomeController(spitterService); //<co id="co_createController"/>

    HashMap<String, Object> model = new HashMap<String, Object>();
    String viewName = controller.showHomePage(model); //<co id="co_callShowHomePage"/>

    assertEquals("home", viewName);

    assertSame(expectedSpittles, model.get("spittles")); //<co id="co_assertResults"/>
    verify(spitterService).getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE);
  }
}
