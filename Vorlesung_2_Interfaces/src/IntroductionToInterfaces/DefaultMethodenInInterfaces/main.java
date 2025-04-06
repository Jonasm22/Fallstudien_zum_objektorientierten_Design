package IntroductionToInterfaces.DefaultMethodenInInterfaces;

public class main {
        public static void main(String[] args) {
            Printer printer = new ConsolePrinter();
            printer.printWelcome();
            printer.print("Das ist eine benutzerdefinierte Nachricht.");
        }
}
