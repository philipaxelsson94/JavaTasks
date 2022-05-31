package ovning11;

public class User {
    private final String name;
    private final String userName;
    private String passWord;

    public User(String name, String userName, String passWord){
        this.name = name;
        this.userName= userName;
        this.passWord = passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String toString(){
        return "" + name;
    }



}
