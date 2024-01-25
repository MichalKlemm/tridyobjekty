package com.engeto.ja.computers;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {  //PascalCase - první slovo Velké písmeno a každé další s velým písmenem

    private String name; //modifikátor přístupu private - princip zapouzdření (encapsulation)

    private LocalDate birthdate;

    private BigDecimal accountState; //camelCase - první malé, druhé velké písmeno

    private int officeNo;

    // Konstruktor


    public Employee(String name, LocalDate birthdate, BigDecimal accountState, int officeNo) {
        this.name = name;
        this.birthdate = birthdate;
        this.accountState = accountState;
        this.officeNo = officeNo;
    }

    public Employee(String name, LocalDate birthdate){
        this(name, birthdate, BigDecimal.ZERO, 115);
    }


    public boolean canBuy(BigDecimal pricePerPiece, int pieces){
        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(pieces));
        return accountState.compareTo(totalPrice) >= 0;
    }

    //region Přístupové metody

    public String getName() {
        return name;
    }

    public void setName(String name) { // v závorce - doplňující parametry
        this.name = name;               // více parametrú odděluji čárkami
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public BigDecimal getAccountstate() {
        return accountState;
    }

    public void setAccountState(BigDecimal accountstate) {
        this.accountState = accountstate;
    }

    public int getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(int officeNo) {
        this.officeNo = officeNo;
    }
    //endregion


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthdate=" + birthdate +
                ", accountState=" + accountState +
                ", officeNo=" + officeNo +
                '}';
    }
}
