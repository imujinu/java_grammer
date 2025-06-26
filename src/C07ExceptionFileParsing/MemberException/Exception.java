package C07ExceptionFileParsing.MemberException;

public class Exception {
    public static class DuplicateEmailException extends IllegalArgumentException {
        public DuplicateEmailException(String message) {
            super(message);
        }
    }

    public static class InvalidPasswordException extends IllegalArgumentException {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }
}
