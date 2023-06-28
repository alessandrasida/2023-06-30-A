package it.polito.tdp.exam.model;

import java.time.LocalDate;

public class People implements Comparable<People>{

    private String playerID;
    private String birthCountry;
    private String birthCity;
    private String deathCountry;
    private String deathCity;
    private String nameFirst;
    private String nameLast;
    private Integer weight;
    private Integer height;
    private String bats;
    private String throwString;
    private LocalDate birthDate;
    private LocalDate debutDate;
    private LocalDate finalgameDate;
    private LocalDate deathDate;

    

    public People(String playerID, String birthCountry, String birthCity, String deathCountry, String deathCity,
			String nameFirst, String nameLast, Integer weight, Integer height, String bats, String throwString,
			LocalDate birthDate, LocalDate debutDate, LocalDate finalgameDate, LocalDate deathDate) {
		super();
		this.playerID = playerID;
		this.birthCountry = birthCountry;
		this.birthCity = birthCity;
		this.deathCountry = deathCountry;
		this.deathCity = deathCity;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.weight = weight;
		this.height = height;
		this.bats = bats;
		this.throwString = throwString;
		this.birthDate = birthDate;
		this.debutDate = debutDate;
		this.finalgameDate = finalgameDate;
		this.deathDate = deathDate;
	}

	public String getPlayerID(){
        return playerID;
    }

    public void setPlayerID(String playerID){
        this.playerID=playerID;
    }

    public String getBirthCountry(){
        return birthCountry;
    }

    public void setBirthCountry(String birthCountry){
        this.birthCountry=birthCountry;
    }

    public String getBirthCity(){
        return birthCity;
    }

    public void setBirthCity(String birthCity){
        this.birthCity=birthCity;
    }

    public String getDeathCountry(){
        return deathCountry;
    }

    public void setDeathCountry(String deathCountry){
        this.deathCountry=deathCountry;
    }

    public String getDeathCity(){
        return deathCity;
    }

    public void setDeathCity(String deathCity){
        this.deathCity=deathCity;
    }

    public String getNameFirst(){
        return nameFirst;
    }

    public void setNameFirst(String nameFirst){
        this.nameFirst=nameFirst;
    }

    public String getNameLast(){
        return nameLast;
    }

    public void setNameLast(String nameLast){
        this.nameLast=nameLast;
    }

    public Integer getWeight(){
        return weight;
    }

    public void setWeight(Integer weight){
        this.weight=weight;
    }

    public Integer getHeight(){
        return height;
    }

    public void setHeight(Integer height){
        this.height=height;
    }

    public String getBats(){
        return bats;
    }

    public void setBats(String bats){
        this.bats=bats;
    }

    public String getThrows(){
        return throwString;
    }

    public void setThrows(String throwString){
        this.throwString=throwString;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate){
        this.birthDate=birthDate;
    }

    public LocalDate getDebutDate(){
        return debutDate;
    }

    public void setDebutDate(LocalDate debutDate){
        this.debutDate=debutDate;
    }

    public LocalDate getFinalgameDate(){
        return finalgameDate;
    }

    public void setFinalgameDate(LocalDate finalgameDate){
        this.finalgameDate=finalgameDate;
    }

    public LocalDate getDeathDate(){
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate){
        this.deathDate=deathDate;
    }

	@Override
	public int hashCode() {
		return playerID.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return this.equals(other.playerID);
	}

	@Override
	public String toString() {
		return nameFirst + " " + nameLast;
	}

	@Override
	public int compareTo(People o) {
		// TODO Auto-generated method stub
		return (this.nameLast+this.nameFirst).compareTo(o.nameLast+o.nameFirst);
	}
    
    

}

