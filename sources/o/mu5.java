package o;

/* JADX INFO: loaded from: classes2.dex */
public enum mu5 implements ol3 {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);

    public final byte m;

    /* JADX WARN: Multi-variable type inference failed */
    mu5(int i) {
        this.m = i;
    }

    public static mu5 a(int i) {
        switch (i) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case ep1.b /* 9 */:
                return CLASS;
            case ep1.c /* 10 */:
                return ENUM;
            case 11:
                return ANNOTATION;
            case ep1.d /* 12 */:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // o.ol3
    public final int getNumber() {
        return this.m;
    }
}
