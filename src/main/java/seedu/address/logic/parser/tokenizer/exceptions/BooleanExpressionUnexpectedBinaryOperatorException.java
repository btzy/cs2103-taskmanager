package seedu.address.logic.parser.tokenizer.exceptions;

/**
 * Thrown by a {@code BooleanExpressionParser} to indicate a binary operator is unexpected.
 */
public class BooleanExpressionUnexpectedBinaryOperatorException extends TokenizationMismatchException {

    /**
     * Constructs a {@code BooleanExpressionUnexpectedBinaryOperatorException}, saving a reference
     * to the error message string {@code s} for later retrieval by the
     * {@code getMessage} method.
     *
     * @param beginIndex the begin index in the string.
     * @param endIndex the end index in the string.
     * @param message the detail message.
     */
    public BooleanExpressionUnexpectedBinaryOperatorException(int beginIndex, int endIndex, String message) {
        super(beginIndex, endIndex, message);
    }
}
