package engine;

public interface Printer {
    static Printer SILENT = SilentPrinter.INSTANCE;

    void println();
    void println(String template, Object... params);
    void println(Localizable<String> template, Object... params);
}