// Name: Sarthak 
// PRN: 23070126088
//Batch-AIML_B1
public class MainThreadDemo {
    public static void main(String[] args) {
        try {
            // Create thread instances by wrapping Runnable implementations
            Thread numberThread = new Thread(new PrintNumbers());
            Thread alphabetThread = new Thread(new PrintAlphabets());
            Thread greetingThread = new Thread(new PrintGreetings());
            // Start all threads simultaneously
            numberThread.start();
            alphabetThread.start();
            greetingThread.start();
            } catch (Exception e) {
            // Handle any unexpected errors during thread initialization
            System.out.println("Main thread encountered an error: " +
            e.getMessage());
            }

    }
    
}
