package com.teamviewer.remotecontrolviewmodellib.swig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF61' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ResponseCode {
    public static final /* synthetic */ ResponseCode[] n;
    public final byte m;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF0;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF1;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF2;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF3;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF4;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF5;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF6;

    /* JADX INFO: Fake field, exist only in values array */
    ResponseCode EF61;

    static {
        ResponseCode responseCode = new ResponseCode("Success", 0, 0);
        ResponseCode responseCode2 = new ResponseCode("InternalError", 1, 1);
        ResponseCode responseCode3 = new ResponseCode("InvalidToken", 2, 2);
        ResponseCode responseCode4 = new ResponseCode("MalformedToken", 3, 3);
        ResponseCode responseCode5 = new ResponseCode("ExpiredToken", 4, 4);
        ResponseCode responseCode6 = new ResponseCode("DatabaseError", 5, 5);
        ResponseCode responseCode7 = new ResponseCode("UnknownError", 6, 6);
        n = new ResponseCode[]{responseCode, responseCode2, responseCode3, responseCode4, responseCode5, responseCode6, responseCode7, new ResponseCode("First", 7, responseCode), new ResponseCode("Last", 8, responseCode7)};
    }

    public ResponseCode(String str, int i, ResponseCode responseCode) {
        super(str, i);
        this.m = responseCode.m;
    }

    public static ResponseCode valueOf(String str) {
        return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
    }

    public static ResponseCode[] values() {
        return (ResponseCode[]) n.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ResponseCode(String str, int i, int i2) {
        super(str, i);
        this.m = i2;
    }
}
