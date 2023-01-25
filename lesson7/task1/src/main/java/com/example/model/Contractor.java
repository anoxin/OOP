package com.example.model;

import java.util.List;
// import java.util.Locale;
import java.util.Locale;

public class Contractor extends User {

    private String nick;
    private List<String> phones;
    private List<String> emails;
    private List<String> vk;
    private List<String> addresses;

    public Contractor(String name, String surname, String age,
            String nick,
            List<String> phones,
            List<String> emails,
            List<String> vk,
            List<String> addresses) {
        super(name, surname, age);
        this.nick = nick;
        this.phones = phones;
        this.emails = emails;
        this.vk = vk;
        this.addresses = addresses;

    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public List<String> getVk() {
        return vk;
    }

    public void setVk(List<String> vk) {
        this.vk = vk;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddress(List<String> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toFileString() {
        return super.toFileString() + String.format(Locale.US, ", %s, %s, %s, %s, %s", nick, phones,
                emails, vk, addresses);
    }

    @Override
    public String toString() {
        return "\n" + super.toString() + ", nick = " + nick + ", phones = " + phones + ", emails = " + emails
                + ", vk = " + vk
                + ", addresses = "
                + addresses + ";";
    }

}
