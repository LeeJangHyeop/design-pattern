package patterns.structural.templatemethod;

public abstract class AbstractAsset {

    private String name;

    final void build() {
        validate();
        create();
        postProcessing();
        hook();
    }

    abstract void validate();
    abstract void create();
    abstract void postProcessing();

    void hook() {}
}
