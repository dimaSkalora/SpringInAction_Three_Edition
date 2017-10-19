package part_2.head_06.spitter_persistence_common.com.habuma.spitter.persistence;

import part_2.spitter_domain_plain.com.habuma.spitter.domain.Spitter;
import part_2.spitter_domain_plain.com.habuma.spitter.domain.Spittle;

import java.util.List;

public interface SpitterDao {
    void addSpitter(Spitter spitter);

    void saveSpitter(Spitter spitter);

    Spitter getSpitterById(long id);

    List<Spittle> getRecentSpittle();

    void saveSpittle(Spittle spittle);

    List<Spittle> getSpittlesForSpitter(Spitter spitter);

    Spitter getSpitterByUsername(String username);

    void deleteSpittle(long id);

    Spittle getSpittleById(long id);

    List<Spitter> findAllSpitters();

}
