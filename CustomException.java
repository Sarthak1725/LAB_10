class InvalidThreadDataException extends Exception {
    public InvalidThreadDataException(String message) {
    super(message); // Pass custom error message to Exception class
    }
    }
    // Custom exception for thread timeout scenarios
    class ThreadTimeoutException extends Exception {
    public ThreadTimeoutException(String message) {
    super(message);
    }
    }
