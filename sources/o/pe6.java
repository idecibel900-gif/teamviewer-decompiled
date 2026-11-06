package o;

/* JADX INFO: loaded from: classes.dex */
public final class pe6 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof pe6) {
            return this.a == ((pe6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 0) {
            return "Button";
        }
        if (b == 1) {
            return "Checkbox";
        }
        if (b == 2) {
            return "Switch";
        }
        if (b == 3) {
            return "RadioButton";
        }
        if (b == 4) {
            return "Tab";
        }
        if (b == 5) {
            return "Image";
        }
        if (b == 6) {
            return "DropdownList";
        }
        if (b == 7) {
            return "Picker";
        }
        return b == 8 ? "Carousel" : "Unknown";
    }
}
