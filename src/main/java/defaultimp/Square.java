package defaultimp;

/**
 * Квадрат
 * Не реализуем метод presentation
 * используется реализация по-умолчанию
 */
public class Square implements Shape {
    @Override
    public String getName() {
        return "Квадрат";
    }
}
