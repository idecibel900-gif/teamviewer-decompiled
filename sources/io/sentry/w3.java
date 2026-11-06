package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public interface w3 extends Closeable {
    Long A();

    void A0();

    ArrayList B0(g1 g1Var, f2 f2Var);

    void D0();

    TimeZone E(g1 g1Var);

    String H();

    void I(boolean z);

    HashMap L(g1 g1Var, f2 f2Var);

    Double S();

    String U();

    void Z();

    Date d0(g1 g1Var);

    Boolean f0();

    boolean hasNext();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    Float p0();

    io.sentry.vendor.gson.stream.b peek();

    Object q0(g1 g1Var, f2 f2Var);

    String r();

    Object t0();

    void u0();

    void v();

    Integer w();

    void y(g1 g1Var, AbstractMap abstractMap, String str);
}
