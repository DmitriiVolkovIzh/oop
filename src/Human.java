public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    String noInfo = " <информация не указана>";


    public String toString(){
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году.Я работаю на должности " + jobTitle + ".  Будем знакомы!";
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0)
            this.yearOfBirth = yearOfBirth;
        else this.yearOfBirth = Math.abs(yearOfBirth);
        if(name == null || name.isEmpty()) this.name = noInfo;
        else this.name = name;
        if(town == null || town.isEmpty()) this.town = noInfo;
        else this.town = town;
        if(jobTitle == null || jobTitle.isEmpty()) this.jobTitle = noInfo;
        else this.jobTitle = jobTitle;

    }
}
