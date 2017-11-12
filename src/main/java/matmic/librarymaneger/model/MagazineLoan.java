package matmic.librarymaneger.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@EqualsAndHashCode(exclude = {"user"})
@Entity
public class MagazineLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loanDate;

    @OneToOne
    private Magazine magazine;

    @ManyToOne
    private LoanLine loanLine;

    public MagazineLoan() {
        setLoanDate();
    }

    public void setLoanDate(){
        SimpleDateFormat formater = new SimpleDateFormat("dd/M/yyyy");
        Date currentDate = new Date();

        loanDate = formater.format(currentDate);

    }
}
