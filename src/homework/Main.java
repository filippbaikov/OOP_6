package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Reporter reporter=new Reporter();
        Saver saver=new Saver();
        saver.saveUser(user);
        reporter.report(user);

        User user1=new User("Ibrashka");
        User user2=new User("Kazbek");

        saver.saveUser(user1);
        reporter.report(user2);


        // решил вот так, если по принципам solid вроде правильно, задача слишком вариативная, например возможно репорт
        // делать нельзя если юзер не сохранен, и тд

    }
}