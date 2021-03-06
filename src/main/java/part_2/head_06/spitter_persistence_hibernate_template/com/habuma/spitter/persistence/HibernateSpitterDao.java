package part_2.head_06.spitter_persistence_hibernate_template.com.habuma.spitter.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;
import part_2.head_06.spitter_persistence_common.com.habuma.spitter.persistence.SpitterDao;
import part_2.spitter_domain_plain.com.habuma.spitter.domain.Spitter;
import part_2.spitter_domain_plain.com.habuma.spitter.domain.Spittle;


@Component
public class HibernateSpitterDao implements SpitterDao {
  @Autowired
  private HibernateTemplate template;
  
  public void addSpitter(Spitter spitter) {
    template.saveOrUpdate(spitter);
  }

  public Spitter getSpitterById(long id) {
    return template.get(Spitter.class, id);
  }

  public void saveSpitter(Spitter spitter) {
    template.update(spitter);
  }

  public List<Spittle> getRecentSpittle() {
    return template.loadAll(Spittle.class); // this isn't right...just a placeholder for now
  }

  public void saveSpittle(Spittle spittle) {
    template.save(spittle);
  }

  public List<Spittle> getSpittlesForSpitter(
          Spitter spitter) {
    // TODO Auto-generated method stub
    return null;
  }
  

  public Spitter getSpitterByUsername(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  public void deleteSpittle(long id) {
    template.delete(getSpittleById(id));
  }

  public Spittle getSpittleById(long id) {
    return template.get(Spittle.class, id);
  }
  
  public List<Spitter> findAllSpitters() {
    // TODO Auto-generated method stub
    return null;
  }
}
