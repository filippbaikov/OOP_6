package homework;

public class Saver {
    private User user;

    public Saver() {
    }

    public void saveUser(User user){
        Saver saver = new Saver();
        saver.save(user);
    }

    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }



}
