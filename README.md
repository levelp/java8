Новое в Java 8
==============

Default методы в интерфейсах
----------------------------

```java
public interface Shape {
    String getName();
    default String presentation() {
        return "Реализуйте метод presentation() для класса " + getClass().getName() + ": " + getName();
    }
}
```

[Пример с геометрическими фигурами](src/main/java/defaultimp)

Функциональные интерфейсы
-------------------------

Функциональный интерфейс - интерфейс, в котором надо определить только один метод.
Например: java.lang.Runnable:
```java
@FunctionalInterface
public interface Runnable {
    void run();
}
```

Чтобы определить интерфейс как функциональный используйте @FunctionalInterface, работающая как @Override. \
Она показывает что вы хотите чтобы только один метод надо было перегружать 
не даёт определить второй абстрактный метод в интерфейсе.

Интерфейс может включать сколько угодно default методов и при этом оставаться функциональным, 
потому что default методы - не абстрактные:
```java
@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
    default void doSomeMathOperation(){
        // Реализация метода по-умолчанию
    }
}
```

Лямбда-выражения
----------------
Служат для сокращения и улучшения читаемости кода ("синтаксический сахар").

[Лямбда-выражения для математических операций](src/main/java/lambda)


| Ссылка на метод  | Лямбда-выражение        |
|------------------|-------------------------|
| String::valueOf  | x -> String.valueOf(x)  |
| Object::toString | x -> x.toString()       |
| x::toString      | () -> x.toString()      |
| ArrayList::new   | () -> new ArrayList<>() |
