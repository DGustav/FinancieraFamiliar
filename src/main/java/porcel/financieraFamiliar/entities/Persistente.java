package porcel.financieraFamiliar.entities;


import jakarta.persistence.*;

@MappedSuperclass

public abstract class Persistente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
