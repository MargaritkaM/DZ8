public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 10;
        post.birthday.year = 1988;
        post.name = "Иван";
        post.passport = "1234 № 123456";
        post.patronymic = "Иванович";
        post.phone = "+7 (916)-904-55-55";
        post.surname = "Иванов";
        post.subscription = true;
    }
}
