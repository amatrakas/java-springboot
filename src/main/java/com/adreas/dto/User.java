package com.adreas.dto;
import javax.persistence.*;


@Entity
@Table(name="user")
public class User {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        @Column(name="id")
        private int id;

        private String name;

        private String surname;

        private String password;

        private int phone;

        private String email;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "profession_id",referencedColumnName = "id")
        private Profession profession;

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public String getName() {
            return name;
        }


    public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getPhone() {
            return phone;
        }



       public void setPhone(int phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


