public class IllegalStateException extends Exception {

    public IllegalStateException() {
        super("Не хватает обязательных полей (Имя и Фамилия)");
    }
}
