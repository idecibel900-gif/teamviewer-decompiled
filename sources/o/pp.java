package o;

/* JADX INFO: loaded from: classes2.dex */
public enum pp {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    public final String m;

    pp(String str) {
        this.m = str == null ? g68.C(name()) : str;
    }
}
