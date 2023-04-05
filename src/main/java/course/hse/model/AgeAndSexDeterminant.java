package course.hse.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@NoArgsConstructor
public class AgeAndSexDeterminant {

    private String fullName;
    private LocalDate dateOfBirth;
    private String age = "";
    private String sex = "";

    public void define() {
        this.sex = defineSex();
        this.age = defineAge();
    }

    private String defineSex() {
        String[] fullNameSplit = fullName.split(" ");
        if (fullNameSplit.length != 3) {
            return "Введите фамилию, имя и отчество через пробел";
        }
        String middleName = fullNameSplit[2];
        if (middleName.endsWith("ич")) {
            return "Ваш пол: Мужчина";
        } else if (middleName.endsWith("на")) {
            return "Ваш пол: Женщина";
        } else {
            return "Невозможно определить, отчество должно идти на 3 месте";
        }
    }

    private String defineAge() {
        if (this.dateOfBirth == null) {
            return "Введите дату рождения";
        }
        this.dateOfBirth.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return "Ваш возраст: " + Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
}
