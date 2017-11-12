package matmic.librarymaneger.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"bookLoan"})
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String author;
    private Integer publishYear;
    private String publisher;
    private String title;
    private String isbn;
    private Integer releaseNumber;
    private String genre;
    private Availability isAvailable;

    @OneToOne
    private BookLoan bookLoan;


}
