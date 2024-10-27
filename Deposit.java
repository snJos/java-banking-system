package Banking.com;

import java.util.Objects;

public class Deposit {
    private    String FirstName;
    private  String LastName;
    private  int Phon.No;
    private Double intal_Amount;
    private  Double Current_Balance;

    public Deposit(String FirstName, String LastName, int phon.No, Double intal_Amount, Double current_Balance ){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phon.No = phon.No;
        this.intal_Amount = intal_Amount;
        this.Current_Balance = current_Balance;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getPhon() {
        return Phon;
    }

    public Double getIntal_Amount() {
        return intal_Amount;
    }

    public Double getCurrent_Balance() {
        return Current_Balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deposit deposit = (Deposit) o;
        return Phon == deposit.Phon && Objects.equals(FirstName, deposit.FirstName) && Objects.equals(LastName, deposit.LastName) && Objects.equals(intal_Amount, deposit.intal_Amount) && Objects.equals(Current_Balance, deposit.Current_Balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FirstName, LastName, Phon, intal_Amount, Current_Balance);
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Phon=" + Phon +
                ", intal_Amount=" + intal_Amount +
                ", Current_Balance=" + Current_Balance +
                '}';
    }


}
