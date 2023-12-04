public class Bank 
{
    public void interestRate() {
        System.out.println("Base Bank Interest Rate: 5%");
        }
       }
       class SBI extends Bank {
        public void interestRate() {
        System.out.println("SBI Interest Rate: 8%");
        }
       }
       class ICICI extends Bank {
        public void interestRate() {
        System.out.println("ICICI Interest Rate: 7%");
        }
       }
public class InterestRate
 {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        sbi.interestRate();
        Bank icici = new ICICI();
        icici.interestRate();
 }
}
