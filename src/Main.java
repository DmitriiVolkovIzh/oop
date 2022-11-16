public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988,"Максим","Минск","бренд-менеджер");
        maksim.introduceYourself();

        Human anna = new Human(1993,"Аня","Москва","методист образовательных программ");
        anna.introduceYourself();

        Human kate = new Human(1992,"Катя","Калининград","продакт-менеджер");
        kate.introduceYourself();

        Human artem = new Human(1995,"Артём","Москва","директор по развитию бизнеса");
        artem.introduceYourself();
    }
}