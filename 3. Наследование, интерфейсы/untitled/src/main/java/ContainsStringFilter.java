public class ContainsStringFilter implements Filter {
    private final String pattern;

    public ContainsStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public Boolean apply(String sentence) {
        return sentence.contains(pattern);
    }
}
