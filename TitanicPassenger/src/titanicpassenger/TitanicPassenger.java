/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titanicpassenger;

/**
 *
 * @author 20115
 */
public class TitanicPassenger {

    private String pclass;
    private String survived;
    private String name;
    private String sex;
    private float age;
    private String sibsp;
    private String parch;
    private String ticket;
    private float fare;
    private String cabin;
    private String embarked;
    private String boat;
    private String body;
    private String home_dist;

    public void setAge(float age) {
        this.age = age;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public void setHome_dist(String home_dist) {
        this.home_dist = home_dist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParch(String parch) {
        this.parch = parch;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSibsp(String sibsp) {
        this.sibsp = sibsp;
    }

    public void setSurvived(String survived) {
        this.survived = survived;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public float getAge() {
        return age;
    }

    public String getBoat() {
        return boat;
    }

    public String getBody() {
        return body;
    }

    public String getCabin() {
        return cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public float getFare() {
        return fare;
    }

    public String getHome_dist() {
        return home_dist;
    }

    public String getName() {
        return name;
    }

    public String getParch() {
        return parch;
    }

    public String getPclass() {
        return pclass;
    }

    public String getSex() {
        return sex;
    }

    public String getSibsp() {
        return sibsp;
    }

    public String getSurvived() {
        return survived;
    }

    public String getTicket() {
        return ticket;
    }
    
    @Override
    public String toString() {
        return " pclass: " + pclass+
                " , survived: " +survived+
                " , name: " + name+
                " , sex: " + sex+
                " , age: " + age+
                " , sibsp: " + sibsp+
                " , parch: " + parch+
                " , ticket: " + ticket+
                " , fare: " + fare+
                " , cabin: " + cabin+
                " , embarked: " + embarked+
                " , boat " + boat+
                " , body: " + body+
                ", home_dist: " + home_dist+"\n";
    }

}

    

