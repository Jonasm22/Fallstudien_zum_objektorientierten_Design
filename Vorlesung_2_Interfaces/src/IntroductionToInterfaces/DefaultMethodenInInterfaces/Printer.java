package IntroductionToInterfaces.DefaultMethodenInInterfaces;
/*Ab Java 8 können Interfaces Standardmethoden enthalten,
 die eine Implementierung bereitstellen. Das ermöglicht es,
 neue Methoden zu einem bestehenden Interface hinzuzufügen,
 ohne alle implementierenden Klassen ändern zu müssen.
 Jedoch wird damit das bis vor Java 8 relativ strikte Konzept der Interfaces aufgeweicht,
 da Interfaces nun auch Methoden mit einer Implementierung enthalten können.
 */
    interface Printer {
        void print(String message);

        default void printWelcome() {
            System.out.println("Willkommen beim Printer Interface!");
        }
    }

    class ConsolePrinter implements Printer {
        @Override
        public void print(String message) {
            System.out.println("Time: " + System.currentTimeMillis() + " - " + message);
        }
    }


