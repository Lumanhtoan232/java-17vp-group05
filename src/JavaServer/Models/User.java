package JavaServer.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {
    @SerializedName("name")
    private String name;

    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("history")
    private List<History> histories;

    @SerializedName("win")
    private Integer win;

    @SerializedName("lose")
    private Integer lose;

    @SerializedName("money")
    private Integer money;

    @SerializedName("activate")
    private Integer activate;

    public User(String name, String username, String password, List<History> histories,
                Integer win, Integer lose, Integer money) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.histories = histories;
        this.win = win;
        this.lose = lose;
        this.money = money;
        this.activate = 1;
    }

    public void printUser(){
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("History: ");
        for (History his : histories){
            his.printHistory();
        }
        System.out.println("Win: " + win);
        System.out.println("Lose: " + lose);
        System.out.println("Money: " + money);
        System.out.println("Activate: " + activate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<History> getHistory() {
        return histories;
    }

    public void setHistory(List<History> histories) {
        this.histories = histories;
    }

    public Integer getWin() {
        return win;
    }

    public void setWin(Integer win) {
        this.win = win;
    }

    public Integer getLose() {
        return lose;
    }

    public void setLose(Integer lose) {
        this.lose = lose;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getActivate() {
        return activate;
    }

    public void setActivate(Integer activate) {
        this.activate = activate;
    }
}
