package com.teamviewer.apidefinitions.supportsessions.infrastructure;

import kotlin.Metadata;
import o.kh7;
import o.lw;
import o.mt4;
import o.pt4;
import o.u14;
import o.w26;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR!\u0010\u0010\u001a\u00020\n8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/teamviewer/apidefinitions/supportsessions/infrastructure/Serializer;", "", "<init>", "()V", "Lo/mt4;", "moshiBuilder", "Lo/mt4;", "getMoshiBuilder", "()Lo/mt4;", "getMoshiBuilder$annotations", "Lo/pt4;", "moshi$delegate", "Lo/u14;", "getMoshi", "()Lo/pt4;", "getMoshi$annotations", "moshi", "kotlin-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Serializer {
    public static final Serializer INSTANCE = new Serializer();

    /* JADX INFO: renamed from: moshi$delegate, reason: from kotlin metadata */
    private static final u14 moshi;
    private static final mt4 moshiBuilder;

    static {
        mt4 mt4Var = new mt4();
        mt4Var.a(new OffsetDateTimeAdapter());
        mt4Var.a(new LocalDateTimeAdapter());
        mt4Var.a(new LocalDateAdapter());
        mt4Var.a(new UUIDAdapter());
        mt4Var.a(new ByteArrayAdapter());
        mt4Var.a(new URIAdapter());
        mt4Var.b(new lw((byte) 3));
        mt4Var.a(new BigDecimalAdapter());
        mt4Var.a(new BigIntegerAdapter());
        moshiBuilder = mt4Var;
        moshi = new kh7(new w26((byte) 27));
    }

    private Serializer() {
    }

    public static final pt4 getMoshi() {
        Object value = moshi.getValue();
        value.getClass();
        return (pt4) value;
    }

    public static /* synthetic */ void getMoshi$annotations() {
    }

    public static final mt4 getMoshiBuilder() {
        return moshiBuilder;
    }

    public static /* synthetic */ void getMoshiBuilder$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pt4 moshi_delegate$lambda$0() {
        mt4 mt4Var = moshiBuilder;
        mt4Var.getClass();
        return new pt4(mt4Var);
    }
}
