package part_1.head_04.annotation.com.springinaction.spring_idol.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.instrument.Guitar;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.instrument.Instrument;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.instrument.Piano;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.performer.Instrumentalist;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.performer.Juggler;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.performer.Performer;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.performer.PoeticJuggler;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.poem.Poem;
import part_1.head_04.annotation.com.springinaction.spring_idol.java_config.poem.Sonnet29;

@Configuration
public class SpringIdolConfig {
    //<start id="duke_bean" />
    @Bean
    public Performer duke() {
        return new Juggler();
    }
    //<end id="duke_bean" />

    @Bean
    public Performer duke15(){
        return new Juggler(15);
    }

    @Bean
    public Performer kenny() {
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        kenny.setInstrument(guitar());
        return kenny;
    }

    @Bean
    Instrument guitar(){
        return new Guitar();
    }

    @Bean
    Poem sonnet29() {
        return new Sonnet29();
    }

    @Bean
    public Performer poeticDuke() {
        return new PoeticJuggler(sonnet29());
    }

    @Bean
    public Instrument piano(){
        return new Piano();
    }

}
