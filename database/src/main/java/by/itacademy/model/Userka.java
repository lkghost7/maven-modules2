package by.itacademy.model;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Builder

//@Table(name = "userka", schema = "public")
@Table(name = "userka")
public class Userka {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Userka(String name) {
        this.name = name;
    }

    public Userka(Long id) {
        this.id = id;
    }
}

