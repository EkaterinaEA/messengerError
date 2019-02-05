
public enum MessageKind {

    TYPE ("T");

    private String value;

    MessageKind(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
