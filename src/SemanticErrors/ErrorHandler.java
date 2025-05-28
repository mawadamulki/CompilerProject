package SemanticErrors;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class ErrorHandler {
    private static final String ERROR_LOG_FILE = "angular_semantic_errors.log";

    public static void logSelectorCollision(SelectorCollisionsException e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getFormattedMessage());
        } catch (IOException ioException) {
            System.err.println("Failed to write to error log: " + ioException.getMessage());
        }
    }

    public static void logTemplateMissing(TemplateMissingException e) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getFormattedMessage());
        } catch (IOException ioException) {
            System.err.println("Failed to write to error log: " + ioException.getMessage());
        }
    }
<<<<<<< HEAD

    public static void logBindingError(BindingErrorException e) {
=======
    public static void logFunctionCallError(FunctionCallErrorException e) {
>>>>>>> b8b033330c02b5d4b4abb1409c6b13ebf666ea47
        try (PrintWriter writer = new PrintWriter(new FileWriter(ERROR_LOG_FILE, true))) {
            writer.println("[" + LocalDateTime.now() + "] " + e.getFormattedMessage());
        } catch (IOException ioException) {
            System.err.println("Failed to write to error log: " + ioException.getMessage());
        }
    }
}