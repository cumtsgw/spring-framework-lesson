package org.landy.springwebflux.domain;

/**
 * Created by Landy on 2019/1/16.
 */
public class User {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String message = "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';

        println(message);

        return message;
    }

    public static void println(Object message) {
        System.out.printf("[Thread : %s ] :  %s \n",
                Thread.currentThread().getName(),
                String.valueOf(message)
        );
    }
}
