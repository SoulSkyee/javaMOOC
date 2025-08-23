public class MainProgram {

    public static void main(String[] args) {
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Paul makan besar, Matt makan hemat
        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        // Mencetak saldo kartu
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul menambah uang 20, Matt makan besar
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        // Mencetak saldo kartu
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        // Paul makan hemat dua kali, Matt menambah uang 50
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);

        // Mencetak saldo kartu
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}