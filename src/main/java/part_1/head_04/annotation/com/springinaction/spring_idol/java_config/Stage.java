package part_1.head_04.annotation.com.springinaction.spring_idol.java_config;

public class Stage {
    private Stage(){

    }

    private static class StageSingletonHolder{
        static Stage instance = new Stage(); // Создание экземпляра
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance;   // Возвращает экземпляр
    }
}
