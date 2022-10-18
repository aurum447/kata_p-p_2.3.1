package myWebApp.model;

import javax.persistence.*;


@Entity
@Table(name = "Users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "socialCredit")
    private long socialCredit;

    public User() {

    }

    public User(String name, String surname, long socialCredit) {
        this.name = name;
        this.surname = surname;
        this.socialCredit = socialCredit;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSocialCredit(long socialCredit) {
        this.socialCredit = socialCredit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getSocialCredit() {
        return socialCredit;
    }
}
