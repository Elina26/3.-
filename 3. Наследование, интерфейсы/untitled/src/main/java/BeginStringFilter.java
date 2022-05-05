public class BeginStringFilter implements Filter {
    private final String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public Boolean apply(String sentence) {
        return sentence.startsWith(pattern);
    }
}
