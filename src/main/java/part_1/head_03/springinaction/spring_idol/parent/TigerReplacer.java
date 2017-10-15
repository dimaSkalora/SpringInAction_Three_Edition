package part_1.head_03.springinaction.spring_idol.parent;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class TigerReplacer implements MethodReplacer {
    public TigerReplacer() {
    }

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
