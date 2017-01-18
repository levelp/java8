package lambda;

/**
 * JavaDoc - Java documentation
 * <p>
 * Операция (с двумя целыми числами)
 *
 * @author Денис
 * @link java.com
 * @see RuntimeException  ссылка на другой класс
 * @see {@link RuntimeException} http://java.com
 * @see String#equals(Object) equals
 * @see LambdaDemo
 */
@FunctionalInterface
public interface Operation {
    /**
     * Применить <b>операцию</b>
     * Виды операций:
     * <ul>
     * <li>Сложение / умножение</li>
     * <li>Минимум / максимум</li>
     * <li>Что-то ещё</li>
     * </ul>
     *
     * @param a первый параметр
     * @param b второй параметр
     * @return результат операции
     */
    int apply(int a, int b);

    /**
     * @return Название операции
     */
    default String getName() {
        return getClass().getName();
    }
}
